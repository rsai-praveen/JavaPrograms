package basicprograms;

import java.util.Scanner;

public class FactorialNumber {
	static int facto = 1;

	public static int fact(int n) {

		while (n != 0) {
			try {
				facto = facto * n;
			} catch (Exception e) {
				e.printStackTrace();
			}
			n--;
		}

		return facto;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer number to find the factorial : ");
		int number = sc.nextInt();
		sc.close();
		System.out.printf("the factorial of %d is %d ", number, fact(number));

	}

}
