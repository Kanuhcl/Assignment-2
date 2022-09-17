package com.saran.app;

//14) Write a program for constructer overloading example.

class Assin_Q14 // addition
{
	Assin_Q14(int a, int b) {
		int sum = a + b;
		System.out.println("sum of two number: " + sum);
	}

	// three argument constructor
	Assin_Q14(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum of three number: " + sum);

	}

	public static void main(String args[]) {
		Assin_Q14 obj = new Assin_Q14(2, 2);
		Assin_Q14 obj1 = new Assin_Q14(3, 3, 3);
	}

}