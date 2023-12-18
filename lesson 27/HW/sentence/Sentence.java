package HW.sentence;
public class Sentence {

    public int countWords(String str) {
        String[] words = str.split("\\W+");
        int wordCount = 0;
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public int countSymbols(String str) {
        String cleanedStr = str.replaceAll("[^A-Za-z0-9]", "");
        return cleanedStr.length();
    }
}
