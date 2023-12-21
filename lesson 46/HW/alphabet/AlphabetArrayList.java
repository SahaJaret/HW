package alphabet;

import java.util.ArrayList;

public class AlphabetArrayList {
    public static void main(String[] args) {
        ArrayList<Character> alphabet = new ArrayList<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }

        for (char letter : alphabet) {
            System.out.print(letter + " ");
        }
    }
}
