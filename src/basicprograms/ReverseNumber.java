package basicprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int n)
	{int rem=0;
		while(n!=0)
		{
			rem=rem*10+n%10;
			//System.out.println(rem);
			n=n/10;
		}
		return rem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to Reverse: ");
		int number = sc.nextInt();
		sc.close();
		
		System.out.println(reverse(number));
		


	}

}
