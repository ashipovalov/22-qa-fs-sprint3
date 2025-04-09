package ru.practicum.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {


    @Test
    void standartAssertions(){
        assertEquals(2, 1+1);
        assertTrue(6 > 4, "Или нет");
        assertNull(null);

    }

    @Tag("Демонстрация")
    @Test
    void groupedAssertions(){
        String name = "John Doe";
        assertAll("person",
                () -> assertEquals("John", name.split(" ")[0]),
                () -> assertEquals("Doe", name.split(" ")[1]));
    }

    @Test
    void exceptionTesting(){
        Exception exception = assertThrows(
        ArithmeticException.class,
                () -> {int i = 1 /0; }
        );
        assertEquals("/ by zero" , exception.getMessage());
    }
}
