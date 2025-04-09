package ru.practicum.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShowParameterizedTests {

    boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);

    }

    @ValueSource(strings = {"racecar" , "radar" , "able was I ere I saw elba"} )
    @ParameterizedTest
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "10, 20, 30"
    })
    void addTest(int a, int b, int expected){
        assertEquals(expected, a+b);
    }
}
