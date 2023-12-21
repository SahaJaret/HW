import java.util.Random;

public class DuplicateFind{
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int randomPosition = random.nextInt(100);
        numbers[100] = numbers[randomPosition];
        numbers[randomPosition] = randomNumber;

        int duplicate = findDuplicate(numbers);
        System.out.println("Задуманое число: " + randomNumber);
        System.out.println("Найдений дубликат: " + duplicate);
    }

    private static int findDuplicate(int[] numbers) {
        int sumOfNumbers = 0;
        int expectedSum = 100 * (100 + 1) / 2;

        for (int number : numbers) {
            sumOfNumbers += number;
        }

        return sumOfNumbers - expectedSum;
    }
}
