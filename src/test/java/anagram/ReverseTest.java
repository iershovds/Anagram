package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseTest {
    Reverse reverse = new Reverse();

    @Test
    void reverse_shouldReturnNull_whenInputStringIsNull() {
        assertNull(reverse.reverse(null));
    }

    @Test
    void reverse_shouldReturnEmptyString_whenInputEmptyString() {
        assertEquals("", reverse.reverse(""));
    }

    @Test
    void reverse_shouldReturnSingleSpace_whenInputSingleSpace() {
        assertEquals(" ", reverse.reverse(" "));
    }

    @Test
    void reverse_shouldReturnSameAmountOfSpaces_whenInputOnlySpaces() {
        assertEquals("   ", reverse.reverse("   "));
    }

    @Test
    void reverse_shouldReturnSingleCharacter_whenInputSingleCharacter() {
        assertEquals("a", reverse.reverse("a"));
    }

    @Test
    void reverse_shouldReturnSameAmountOfCharacters_whenInputMultipleSameLetters() {
        assertEquals("aaa", reverse.reverse("aaa"));
    }

    @Test
    void reverse_shouldReturnReversedOrderOfLetters_whenInputMultipleSameLettersInDifferentCases() {
        assertEquals("AaAa", reverse.reverse("aAaA"));
    }

    @Test
    void reverse_shouldReturnReversedWord_whenInputDifferentLetters() {
        assertEquals("dcba", reverse.reverse("abcd"));
    }

    @Test
    void reverse_shouldReturnSameOrderOfSymbols_whenInputOnlySymbols() {
        assertEquals("/.,&", reverse.reverse("/.,&"));
    }

    @Test
    void reverse_shouldReturnReversedString_whenInputWordsWithoutSymbols() {
        assertEquals("dcba hgfe", reverse.reverse("abcd efgh"));
    }

    @Test
    void reverse_shouldReturnReversedString_whenInputWordsContainsLettersAndSymbols() {
        assertEquals("d1cba hgf!e", reverse.reverse("a1bcd efg!h"));
    }
}