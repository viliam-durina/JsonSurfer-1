/*
 * MIT License
 *
 * Copyright (c) 2019 WANG Lingsong
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.jsfr.json;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import static com.alibaba.fastjson.parser.JSONToken.COLON;
import static com.alibaba.fastjson.parser.JSONToken.COMMA;
import static com.alibaba.fastjson.parser.JSONToken.EOF;
import static com.alibaba.fastjson.parser.JSONToken.ERROR;
import static com.alibaba.fastjson.parser.JSONToken.FALSE;
import static com.alibaba.fastjson.parser.JSONToken.IDENTIFIER;
import static com.alibaba.fastjson.parser.JSONToken.LBRACE;
import static com.alibaba.fastjson.parser.JSONToken.LBRACKET;
import static com.alibaba.fastjson.parser.JSONToken.LITERAL_FLOAT;
import static com.alibaba.fastjson.parser.JSONToken.LITERAL_INT;
import static com.alibaba.fastjson.parser.JSONToken.LITERAL_STRING;
import static com.alibaba.fastjson.parser.JSONToken.NEW;
import static com.alibaba.fastjson.parser.JSONToken.NULL;
import static com.alibaba.fastjson.parser.JSONToken.RBRACE;
import static com.alibaba.fastjson.parser.JSONToken.RBRACKET;
import static com.alibaba.fastjson.parser.JSONToken.SET;
import static com.alibaba.fastjson.parser.JSONToken.TREE_SET;
import static com.alibaba.fastjson.parser.JSONToken.TRUE;
import static com.alibaba.fastjson.parser.JSONToken.UNDEFINED;

/**
 * Created by Leo on 2017/3/31.
 */
public final class FastJsonParser implements JsonParserAdapter {

    private static class FastJsonResumableParser implements ResumableParser {

        private final JSONLexerBase lexer;
        private final SurfingContext context;
        private final StaticPrimitiveHolder staticPrimitiveHolder;

        FastJsonResumableParser(JSONLexerBase lexer, SurfingContext context, StaticPrimitiveHolder staticPrimitiveHolder) {
            this.lexer = lexer;
            this.context = context;
            this.staticPrimitiveHolder = staticPrimitiveHolder;
        }

        @Override
        public void parse() {
            context.startJSON();
            doParse();
        }

        @Override
        public boolean resume() {
            try {
                if (!context.isPaused()) {
                    return false;
                }
                context.resume();
                doParse();
                return true;
            } catch (Exception e) {
                context.getConfig().getErrorHandlingStrategy().handleParsingException(e);
                return false;
            }
        }

        @SuppressWarnings({"checkstyle:CyclomaticComplexity", "checkstyle:MethodLength"})
        private void doParse() {

            try {
                String tempString = null;

                while (!lexer.isEOF() && !context.shouldBreak()) {
                    lexer.nextToken();
                    int token = lexer.token();
                    if (tempString != null) {
                        if (token == COLON) {
                            context.startObjectEntry(tempString);
                        } else {
                            context.primitive(staticPrimitiveHolder.withValue(tempString));
                        }
                        tempString = null;
                    }
                    switch (token) {
                        case SET:
                        case TREE_SET:
                        case NEW:
                        case COMMA:
                        case COLON:
                            break;
                        case LBRACKET:
                            context.startArray();
                            break;
                        case RBRACKET:
                            context.endArray();
                            break;
                        case LBRACE:
                            context.startObject();
                            break;
                        case RBRACE:
                            context.endObject();
                            break;
                        case LITERAL_INT:
                            context.primitive(staticPrimitiveHolder.withValue(lexer.longValue()));
                            break;
                        case LITERAL_FLOAT:
                            context.primitive(staticPrimitiveHolder.withValue(lexer.doubleValue()));
                            break;
                        case IDENTIFIER:
                        case LITERAL_STRING:
                            tempString = lexer.stringVal();
                            break;
                        case NULL:
                        case UNDEFINED:
                            context.primitive(staticPrimitiveHolder.withValue(null));
                            break;
                        case TRUE:
                            context.primitive(staticPrimitiveHolder.withValue(true));
                            break;
                        case FALSE:
                            context.primitive(staticPrimitiveHolder.withValue(false));
                            break;
                        case EOF:
                            context.endJSON();
                            break;
                        case ERROR:
                        default:
                            throw new JSONException("syntax error, " + lexer.info());
                    }
                }

                if (tempString != null) {
                    context.primitive(staticPrimitiveHolder.withValue(tempString));
                }

                if (context.getConfig().isCloseParserOnStop() && context.isStopped()) {
                    lexer.close();
                }

            } catch (Exception e) {
                context.getConfig().getErrorHandlingStrategy().handleParsingException(e);
            }

        }
    }

    /**
     * Immutable shared instance
     */
    public static final FastJsonParser INSTANCE = new FastJsonParser();

    private FastJsonParser() {
    }

    @Override
    public void parse(Reader reader, SurfingContext context) {
        createResumableParser(reader, context).parse();
    }

    @Override
    public void parse(String json, SurfingContext context) {
        createResumableParser(json, context).parse();
    }

    @Override
    public void parse(InputStream inputStream, SurfingContext context) {
        createResumableParser(inputStream, context).parse();
    }

    @Override
    public ResumableParser createResumableParser(Reader reader, SurfingContext context) {
        return new FastJsonResumableParser(new JSONReaderScanner(reader), context, new StaticPrimitiveHolder());
    }

    @Override
    public ResumableParser createResumableParser(String json, SurfingContext context) {
        return new FastJsonResumableParser(new JSONScanner(json), context, new StaticPrimitiveHolder());
    }

    @Override
    public ResumableParser createResumableParser(InputStream json, SurfingContext context) {
        return new FastJsonResumableParser(new JSONReaderScanner(
            new InputStreamReader(json, context.getConfig().getParserCharset())), context, new StaticPrimitiveHolder());
    }

    @Override
    public NonBlockingParser createNonBlockingParser(SurfingContext context) {
        throw new UnsupportedOperationException("Unsupported");
    }

}
