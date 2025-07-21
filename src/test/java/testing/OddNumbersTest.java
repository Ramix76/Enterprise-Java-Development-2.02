package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddNumbersTest {

    @Test
    public void testOddNumbersUpTo10() {
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, Utils.getOddNumbers(10));
    }

    @Test
    public void testOddNumbersUpTo1() {
        int[] expected = {1};
        assertArrayEquals(expected, Utils.getOddNumbers(1));
    }

    @Test
    public void testOddNumbersUpTo0() {
        int[] expected = {};
        assertArrayEquals(expected, Utils.getOddNumbers(0));
    }
}

