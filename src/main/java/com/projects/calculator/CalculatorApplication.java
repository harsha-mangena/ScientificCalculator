package com.projects.calculator;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	//Scanner Function
	public static Scanner getScanner()
	{
		return new Scanner(System.in);
	}

	//Main
	public static void main(String[] args) {
		// Object for Calculator
		Calculator calculate = new Calculator();
		//Scanner
		Scanner scan = getScanner();
		//Input's
		// Integer input1 = scan.nextInt(); 
		// Integer input2 = scan.nextInt();
		LogicalCalculator l = new LogicalCalculator();
		l.AND(1, 2);
		System.out.println(l.getResult());

	}

}
