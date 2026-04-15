package basicprograms;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static  void evenOrOdd(int n)
	{
		if(n%2==0)
		{
			System.out.printf("Given number %d is even",n);
		}
		else
		{
			System.out.printf("Given number %d is odd",n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer number to Check Even or odd : ");
		int num1 =sc.nextInt();
		sc.close();
		evenOrOdd(num1);

	}

}
