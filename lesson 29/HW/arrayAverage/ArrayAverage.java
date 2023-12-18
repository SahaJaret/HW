package arrayAverage;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        double average = calculateAverageOfEvenNumbers(numbers);
        System.out.println("Среднее значение четных элементов: " + average);
    }

    private static double calculateAverageOfEvenNumbers(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}

