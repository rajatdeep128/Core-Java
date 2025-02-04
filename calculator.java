package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		try {
			System.out.println("Enter first number");
			a = sc.nextInt();
			System.out.println("Enter second number");
			b = sc.nextInt();

		}

		catch (InputMismatchException IME) {
			System.out.println("Enter only integer Type input");
		}
		System.out.println("Enter the opration which you want:- \n(add/sub/mul/div)");
		System.out.println(" ");

		String s = sc.next();

		sc.close();


			switch (s) {
		case "add": 
			addition(a,b);
			break;
		case "sub": 
			substraction(a, b);
			break;
		
		case "mul": 
			multiplication(a, b);
			break;
		
		case "div": 
			division(a, b);
			break;
		
		
			}
	}

	static void addition(double a, double b) {

		System.out.println(a + b);
	}

	static void substraction(double a, double b) {

		System.out.println(a - b);
	}

	static void multiplication(double a, double b) {

		System.out.println(a * b);
	}

	static void division(int a, int b) {
		int c = a / b;
		System.out.println(c);
		
	}
}
