import java.util.Scanner;

public class StringInform {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] words = inputString.split(" ");

        int wordCount = words.length;
        System.out.println("Количество слов в строке: " + wordCount);

        int charCount = inputString.length();
        System.out.println("Количество символов в строке: " + charCount);

        System.out.print("Строка шиворот на виворот и задом наперед: ");
        for (int i = charCount - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }


    }

}
