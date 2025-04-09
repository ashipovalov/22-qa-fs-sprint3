package ru.practicum.tests;

import org.junit.jupiter.api.*;

public class BasicAnnotationsTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Выполняется один раз перед всеми тестами");
    }

    @BeforeEach
    void setup() {
        System.out.println("Выполняется перед каждым тестов");
    }

    @Test
    void firstTest() {
        System.out.println("Первый тест");


    }

    @Test
    void secondTest() {
        System.out.println("Второй тест");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Выполняется после каждого теста");
    }

    @AfterAll
    static void tearDowmAll() {
        System.out.println("Выполняется один раз после всех тестов в классе");
    }


}
