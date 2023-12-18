package arrayStatistics;

import java.util.Random;

public class ArrayStatistics {

    public static int[] createRandomArray() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        return array;
    }

    public static int countPositiveNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegativeNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeros(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number == 0) {
                count++;
            }
        }
        return count;
    }
}
