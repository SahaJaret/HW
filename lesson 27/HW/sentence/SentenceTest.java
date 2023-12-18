package HW.sentence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    private Sentence sentence;

    @BeforeEach
    void setUp() {
        sentence = new Sentence();
    }

    @Test
    void countWordsWithPunctuation() {
        String str = "One, two; three: four!";
        assertEquals(4, sentence.countWords(str));
    }

    @Test
    void countWordsWithSymbols() {
        String str = "Hello$ world&";
        assertEquals(2, sentence.countWords(str));
    }

    @Test
    void countWordsWithNumbers() {
        String str = "1 apple and 2 oranges.";
        assertEquals(5, sentence.countWords(str));
    }

    @Test
    void countSymbolsWithPunctuation() {
        String str = "Hello, world!";
        assertEquals(10, sentence.countSymbols(str));
    }

    @Test
    void countSymbolsWithNumbers() {
        String str = "123 456 789";
        assertEquals(9, sentence.countSymbols(str));
    }

    @Test
    void countSymbolsEmptyString() {
        String str = "";
        assertEquals(0, sentence.countSymbols(str));
    }
}
