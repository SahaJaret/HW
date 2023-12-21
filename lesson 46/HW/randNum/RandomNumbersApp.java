package randNum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbersApp {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(10) + 1;
            numbersList.add(randomNumber);
        }

        System.out.println(numbersList);

        Set<Integer> uniqueNumbers = new HashSet<>(numbersList);

        numbersList.clear();
        numbersList.addAll(uniqueNumbers);

        System.out.println();
        System.out.println(numbersList);
    }
}
