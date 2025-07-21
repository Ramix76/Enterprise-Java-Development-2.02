package testing;

import java.util.Set;

public class Utils {
    public static int[] getOddNumbers(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 != 0)
                .toArray();
    }

    private static final Set<String> JAVA_KEYWORDS = Set.of(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while"
    );

    public static boolean containsJavaKeyword(String input) {
        String[] words = input.split("\\W+");
        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
