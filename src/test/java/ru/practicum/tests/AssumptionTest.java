package ru.practicum.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionTest {

    @Test
    void testOnlyCIServer(){
        assumeTrue("CI".equals(System.getenv("ENV")));
        //Выполняется только на CI сервере
    }
}
