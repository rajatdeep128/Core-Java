package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year:- ");
		int year = sc.nextInt();
		sc.close();
		if (year%100==0 && year%400==0) {
			System.out.println(year +" is a Leap year");
		}
		else if (year%100!=0 &&year%4==0) {
			System.out.println(year +" is a Leap year");
		}
		else {
			System.out.println(year +" is not a Leap year");

		}
	}

}
