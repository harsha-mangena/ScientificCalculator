package com.projects.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LogicalTest {

    protected LogicalCalculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new LogicalCalculator();
    }

    //Test for AND
    @Test
    @DisplayName("AND")
    void testAND()
    {
        double result = 100 & 1;
        calculator.AND(100, 1);
        assertEquals(result, calculator.getResult());
    }

    //Test for OR
    @Test
    @DisplayName("OR")
    void testOR()
    {
        double result = 10 | 1;
        calculator.OR(10, 1);
        assertEquals(result, calculator.getResult());
    }

    //Test for NOT
    @Test
    @DisplayName("NOT")
    void testNOT()
    {
        double result = ~1000;
        calculator.NOT(1000);
        assertEquals(result, calculator.getResult());
    }

    //Test for  XOR
    @Test
    @DisplayName("XOR")
    void testXOR()
    {
        double result = 100 ^ 1;
        calculator.XOR(100, 1);
        assertEquals(result, calculator.getResult());
    }

    //Test for Version
    @Test
    @DisplayName("Version")
    void testVersion()
    {
        String version = "1.12";
        assertEquals(version, calculator.getVersion());
    }




    
}
