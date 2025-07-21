package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaKeywordCheckerTest {

    @Test
    public void testStringWithExactKeyword() {
        assertTrue(Utils.containsJavaKeyword("Don't break my heart"));
    }

    @Test
    public void testStringWithSimilarWord() {
        assertFalse(Utils.containsJavaKeyword("I love to breakdance"));
    }

    @Test
    public void testStringWithNoKeywords() {
        assertFalse(Utils.containsJavaKeyword("This is just a test"));
    }

    @Test
    public void testStringWithMultipleKeywords() {
        assertTrue(Utils.containsJavaKeyword("public class void"));
    }
}

