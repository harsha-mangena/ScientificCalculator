package com.projects.calculator;

//LOMBOK
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
public class Calculator implements ICalculator 
{
    //For Result
    protected double result;
    //Versioning
    protected String version = "1.01";

    //Addition
    @Override
    public void Addition(@NonNull Integer a, @NonNull Integer b){
        if (a == null || b == null)
        {
            throw new ArithmeticException("Inputs can't be ZERO !");
        }
        Addition((double)a, (double)b);
    }
    public void Addition(double a, double b)
    {
        double result = a + b;
        if(result ==  Double.POSITIVE_INFINITY || result == Double.MAX_VALUE)
        {
            throw new ArithmeticException("Overflow");
        }
        this.result = result;

    }

    //Substraction
    @Override
    public void Substraction(Integer a, Integer b) {
        if (a == null || b == null)
        {
            throw new ArithmeticException("Inputs can't be ZERO !");
        }
        Substraction((double)a, (double) b);
    }
    void Substraction(double a, double b)
    {
        double result = a-b;
        if(result ==  Double.POSITIVE_INFINITY || result == Double.MAX_VALUE)
        {
            throw new ArithmeticException("Overflow");
        }
        this.result = result;
    }

    //Division
    @Override
    public void Division(Integer a, Integer b) {
        if (a == null || b == null)
        {
            throw new ArithmeticException("Inputs can't be ZERO !");
        }
        Division((double)a, (double)b); //Chaining 
    }
    void Division(double a, double b)
    {
        double result = a/b;
        if(result ==  Double.POSITIVE_INFINITY || result == Double.MAX_VALUE)
        {
            throw new ArithmeticException("Overflow");
        }
        this.result = result;

    }

    //Multiplication
    @Override
    public void Multiplication(Integer a, Integer b) {
        if (a == null || b == null)
        {
            throw new ArithmeticException("Inputs can't be ZERO !");
        }
        Multiplication((double)a, (double)b);
    }
    void Multiplication(double a, double b)
    {
        double result = a*b;
        if(result ==  Double.POSITIVE_INFINITY || result == Double.MAX_VALUE)
        {
            throw new ArithmeticException("Overflow");
        }
        this.result = result;
    }

    //Getting Result
    public double getResult()
    {
        return result;
    }
    //clearing Result
    public void clearResult()
    {
        this.result = 0.0;
    }

    //Getting Version
    public String getVersion()
    {
        return version;
    }

    
}
