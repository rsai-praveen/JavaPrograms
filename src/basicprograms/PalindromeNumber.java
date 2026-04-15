package basicprograms;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static int reverse(int n)
	{
		int rem=0;
		while(n!=0)
		{
			rem=rem*10+n%10;
			//System.out.println(rem);
			n=n/10;
		}
		System.out.printf("The Value after reversing the given number : "+rem);
		System.out.println();
		return rem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to Reverse: ");
		int number = sc.nextInt();
		sc.close();
		if(number==reverse(number))
		{
			System.out.println("The given number is Palindrome");
		}
		else 
		{
			System.out.println("The given number is NOT Palindrome");
		}

	}

}
