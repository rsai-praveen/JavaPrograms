package basicprograms;

import java.util.Scanner;

public class Swap2Numbers {
	
	public static void main(String[] args)
	{
		
		// swap number with out using temp variable
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of number 1 : ");
		int num1 =sc.nextInt();
		System.out.println();
		System.out.print("Enter the Value of number 2 : ");
		int num2 =sc.nextInt();
		System.out.println();
		
		num1=num1+num2;//5+4=9
		num2=num1-num2;//9-4=5
		num1= num1-num2;//9-5=4
		sc.close();
		System.out.println("The swapping output of number below");
		System.out.println("Value of number 1 : "+num1);
		System.out.println("Value of number 2 : "+num2);
		
	}

}
