package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many fibonaccis you want ?");
		int n = sc.nextInt();
		//take first two fibonaccis as 0 and 1
		int f1 = 0, f2 = 1;
		System.out.println(f1);
		System.out.println(f2);
		int f3 = 0;
		//Already 2 fibonaccis are displayed . so count will start at 3
		int count = 3;
		while (count <= n) {

			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			count++;
		}
	}

}
