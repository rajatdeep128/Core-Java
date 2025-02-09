package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();

		s = s.toLowerCase();

		boolean ispalindrome = true;

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {

			} else {
				ispalindrome = false;
				break;
			}
			start++;
			end--;

		}
		if (ispalindrome) {
			System.out.println(s + " is palindrome");
		} else {
			System.err.println(s + " is not palindrome");

		}
		sc.close();
	}

}
