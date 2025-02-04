import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	static double num1, num2;
	static char operator;

	public static void main(String[] args) throws IOException, NumberFormatException {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter First Number :- ");
			num1 = sc.nextDouble();
			System.out.print("Enter Second Number :- ");
			num2 = sc.nextDouble();

		} catch (InputMismatchException e) {
			System.err.println("Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter an Operator\ni.e.(+,-,*,/,%)");
		operator = sc.next().charAt(0);
		System.err.println("--------------------------------------");

		switch (operator) {
		case '+':
			addition(num1, num2);

			break;
		case '-':
			substraction(num1, num2);
			break;
		case '*':
			multiplication(num1, num2);
			break;
		case '/':
			division(num1, num2);
			break;
		case '%':
			modulus(num1, num2);
			break;

		default:
			System.err.println("Invalid Operator");
			break;
		}

	}

	static void addition(double a, double b) {

		System.out.println(a + " + " + b + " = " + (a + b));
	}

	static void substraction(double a, double b) {

		System.out.println(a + " - " + b + " = " + (a - b));
	}

	static void multiplication(double a, double b) {

		System.out.println(a + " * " + b + " = " + (a * b));
	}

	static void division(double a, double b) {

		if (b == 0) {
			System.err.println("Denominator can't be zero");
			System.exit(0);
		}
		System.out.println(a + " / " + b + " = " + (a / b));

	}

	static void modulus(double a, double b) {

		System.out.println(a + " % " + b + " = " + (a % b));
	}

}
