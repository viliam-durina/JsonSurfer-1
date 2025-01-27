package org.jsfr.json.exception;

import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Token;

public class JsonPathCompilerException extends JsonSurfingException {

    public JsonPathCompilerException(Throwable cause) {
        super(cause);
    }

    public JsonPathCompilerException(String message, Throwable cause) {
        super(message, cause);
    }

    public static JsonPathCompilerException from(RuntimeException e) {
        if (e.getCause() instanceof InputMismatchException) {
            InputMismatchException mismatchException = (InputMismatchException) e.getCause();
            return fromInputMismatchException(mismatchException);
        }
        if (e instanceof InputMismatchException) {
            InputMismatchException mismatchException = (InputMismatchException) e;
            return fromInputMismatchException(mismatchException);
        }
        return new JsonPathCompilerException(e.getCause());
    }

    private static JsonPathCompilerException fromInputMismatchException(InputMismatchException mismatchException) {
        Token token = mismatchException.getOffendingToken();
        return new JsonPathCompilerException(String.format("Unexpected token at line %d start: %d end: %d",
            token.getLine(),
            token.getStartIndex(),
            token.getStopIndex()),
            mismatchException);
    }

}
