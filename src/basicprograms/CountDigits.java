package basicprograms;

import java.util.Scanner;

public class CountDigits {
// Count digits in a number
	public static int count(long n) {
		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}

		return count;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to Count number of digits : ");
		long number = sc.nextLong();
		sc.close();
		System.out.printf("The total Digits in the given number %d is %d digits",number,count(number));
	}

}
