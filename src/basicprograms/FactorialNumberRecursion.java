package basicprograms;

import java.util.Scanner;

public class FactorialNumberRecursion {
	

	public static int fact(int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		} else

			return n * fact(n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer number to find the factorial : ");
		int number = sc.nextInt();
		sc.close();
		System.out.print("Finding the factorial  using Recursive Method: ");
		System.out.printf("the factorial of %d is %d ", number, fact(number));

	}

}
