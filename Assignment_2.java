
/*1) Take couple of variables (like int=1, j=5) and do 
    arithmetic
    Unary
    Relational and 
    Logical Operation*/

package com.saran.app;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Frist Number for arthematic: ");
		int i = sc.nextInt();
		System.out.println("Please Enter Second Number: ");
		int j = sc.nextInt();
		// Athematic operation

		int add = (i + j);
		System.out.println("Addition of the number is " + add);
		int sub = (i - j);
		System.out.println("Subtraction of the number is " + sub);
		int multi = (i * j);
		System.out.println("Miltiplication of the number is " + multi);

		// Unary
		int a = 2;
		a++;
		int b = 3;
		b++;
		System.out.println(a + " " + b);

		/* Relational and Logical Operation */

		System.out.println("Please Enter Number for ralation and logical: ");
		int c = sc.nextInt();
		if (c > 0 && c <= 100) {
			System.out.println("Valid number");
		} else if (c == 100) {
			System.out.println("Number is hundred");
		} else if (c >= 100 && c <= 1000) {
			System.out.println("Number is betwen 100 and 1000");

		} else {
			System.out.println("Number is out of range");
		}

		/*
		 * Take command like argument and check it is odd or even number by using if
		 * statement
		 */

		System.out.println("\nEnter number to find Odd even: ");
		int OddEven = sc.nextInt();

		if (OddEven % 2 == 0) {
			// 3) Print the given number(command line argument) is even or odd.
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
// 4) For a given number integer, print in the words using switch statement 1 to 10.
		// Ex : if input is 5, then it should print "Five"
		System.out.println("\nEnter number to find number into words: ");
		int numberInWords = sc.nextInt();
		switch (numberInWords) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invalid, Please enter number 1 to five: ");
		}

		// 5) Print even number between 1 to 100 using for loop.

		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				System.out.println("Even Number is: " + k);
			}

		}

		// 6) Print number 1 to 5, 5 times using nested for loop;

		for (int w = 1; w <= 5; w++) {

			for (int r = 1; r <= 5; r++) {
				System.out.print(" " + r);
			}
			System.out.print(" \n");
		}

		// 7) print 1 to 25 number using while loop.

		int h = 0;
		while (h <= 24) {
			System.out.println(h += 1);
		}

		// 8) Print odd number between 50 to 100 using do..while
		int p = 50;
		do {
			if (p % 2 == 1) {
				System.out.println(p + "\n");
			}
			p++;
		} while (p <= 100);

		// 9) Print prime number from 1 to 100.

		int v = 0;
		int num1 = 0;
		// Empty String
		String primeNumbers = "";

		for (v = 1; v <= 100; v++) {
			int counter = 0;
			for (num1 = v; num1 >= 1; num1--) {
				if (v % num1 == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + v + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);

		// 10) Iterate for loop form 1 to 100, and using continue statement print only
		// add numbers.

		for (int q = 1; q <= 100; q++) {
			if (q % 2 == 0)
				continue;
			System.out.print(q + " ");
		}

		// 11) Iterate for loop form 50 to 100, and using break statement print only
		// even numbers till 75.

		for (int r = 50; r <= 100; ++r) {
			if (r > 75) {
				break;
			}

			if (r % 2 != 1) {
				System.out.println("even: " + r);
			}

		}

	}

}
