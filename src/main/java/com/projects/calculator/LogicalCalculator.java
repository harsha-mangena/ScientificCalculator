package com.projects.calculator;

public class LogicalCalculator extends Calculator implements ILogicalCalculator{

    String version = "1.12";

    @Override
    public void AND(Integer a, Integer b) {
        result = a & b;
        
    }

    @Override
    public void OR(Integer a, Integer b) {
        result = a | b;
        
    }

    @Override
    public void XOR(Integer a, Integer b) {
        result = a ^ b;
        
    }

    @Override
    public void NOT(Integer a) {
        result = ~a;
    }

    //From Calculator
    @Override 
    public String getVersion()
    {
        return version;
    }

    //For Result
    @Override
    public double getResult()
    {
        return result;
    }

    
}
