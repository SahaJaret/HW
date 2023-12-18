package arrayStatistics;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayStatisticsTest {

    @Test
    public void testCountPositiveNumbers() {
        int[] array = {1, 2, -3, 4, 0, 5, -6, 7, -8, 9};
        int expectedCount = 6;
        int actualCount = ArrayStatistics.countPositiveNumbers(array);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountNegativeNumbers() {
        int[] array = {1, 2, -3, 4, 0, 5, -6, 7, -8, 9};
        int expectedCount = 3;
        int actualCount = ArrayStatistics.countNegativeNumbers(array);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountEvenNumbers() {
        int[] array = {1, 2, -3, 4,  5, -6, 7, -8, 9};
        int expectedCount = 4;
        int actualCount = ArrayStatistics.countEvenNumbers(array);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountZeros() {
        int[] array = {1, 2, -3, 4, 0, 5, -6, 7, -8, 9};
        int expectedCount = 1;
        int actualCount = ArrayStatistics.countZeros(array);
        assertEquals(expectedCount, actualCount);
    }
}
