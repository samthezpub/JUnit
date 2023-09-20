package org.example;

import org.example.StringUtils.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void StringUtils_IsPalindrome_ValidPalindromeInputMustReturnTrue_WhenCalled() {
        assertTrue(StringUtils.isPalindrome("racecar"));
    }

    @Test
    void StringUtils_IsPalindrome_InvalidPalindromeInputMustReturnFalse_WhenCalled() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void StringUtils_CountVowels_ValidInputMustReturnInt_WhenCalled() {
        assertEquals(2, StringUtils.countVowels("hello"));
    }

    @Test
    void StringUtils_CountConsonants_ValidInputMustReturnInt_WhenCalled() {
        assertEquals(3, StringUtils.countConsonants("hello"));
    }

    @Test
    void StringUtils_CountWordOccurrences_WordPresentMustReturnInt_WhenCalled() {
        assertEquals(2, StringUtils.countWordOccurrences("hello world hello", "hello"));
    }

    @Test
    void StringUtils_CountWordOccurrences_WordNotPresentMustReturnInt_WhenCalled() {
        assertEquals(0, StringUtils.countWordOccurrences("This is a test", "apple"));
    }
}
