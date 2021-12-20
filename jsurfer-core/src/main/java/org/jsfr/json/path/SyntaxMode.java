package org.jsfr.json.path;

@SuppressWarnings("checkstyle:JavadocVariable")
public enum SyntaxMode {
    LAX, STRICT;


    public static SyntaxMode parse(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        for (SyntaxMode variant : values()) {
            if (variant.name().equalsIgnoreCase(input)) {
                return variant;
            }
        }
        return null;
    }
}
