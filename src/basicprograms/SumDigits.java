package basicprograms;

import java.util.Scanner;

public class SumDigits {
	public static int digitSum(long n) {
		int sum = 0;
		while (n != 0) {
			sum = (int) (sum + n % 10);
			n = n / 10;
		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to Sum number of digits : ");
		long number = sc.nextLong();
		sc.close();
		System.out.printf("The total sum of Digits in the given number %d is %d digits", number, digitSum(number));

	}

}
