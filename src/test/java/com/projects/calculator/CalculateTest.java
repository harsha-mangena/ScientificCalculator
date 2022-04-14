package com.projects.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateTest {
    
    protected Calculator calculator;
    //Setting calculator Object
    @BeforeEach
    void setCalculate()
    {
        calculator = new Calculator();
    }

    //Addition
    @Test
    @DisplayName("Addition")
    void testAddition()
    {
        double desiredResult = (double)10;
        calculator.Addition(-10, 20);
        assertEquals(desiredResult, calculator.getResult());
    }

    //Subtraction
    @Test
    @DisplayName("Subtraction")
    void testSubtraction()
    {
        double desiredResult = (double)1000;
        calculator.Substraction(990,-10);
        assertEquals(desiredResult, calculator.getResult());
    }

    //Division
    @Test
    @DisplayName("Division")
    void testDivision()
    {
        double desiredResult = 1;
        calculator.Division(10, 10);
        assertEquals(desiredResult, calculator.getResult());
    }

    //Multiplication
    @Test
    @DisplayName("Multiplication")
    void testMultiplication()
    {
        double desiredResult = (double)100 * (double) 190878;
        calculator.Multiplication(100, 190878);
        assertEquals(desiredResult, calculator.getResult());
    }

    //Clear Result
    @Test
    @DisplayName("Clearing Result")
    void testClearResult()
    {
        calculator.clearResult();
        assertEquals(0, calculator.getResult());
    }

    //Version 
    @Test
    @DisplayName("Version")
    void testVersion()
    {
        String version = "1.01";
        assertEquals(version, calculator.getVersion());
    }

}
