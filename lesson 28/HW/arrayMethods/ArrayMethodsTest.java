package arrayMethods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMethodsTest {

    @Test
    public void testSum() {
        assertEquals(10, ArrayMethods.sum(new int[] {1, 2, 3, 4}));
        assertEquals(0, ArrayMethods.sum(new int[] {0, 0, 0, 0}));
        assertEquals(-10, ArrayMethods.sum(new int[] {-1, -2, -3, -4}));
    }

    @Test
    public void testContains() {
        assertTrue(ArrayMethods.contains(new int[] {1, 2, 3, 4}, 3));
        assertFalse(ArrayMethods.contains(new int[] {1, 2, 3, 4}, 5));
    }
}
