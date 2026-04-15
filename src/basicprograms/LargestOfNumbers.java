package basicprograms;

import java.util.Scanner;

public class LargestOfNumbers {
	public static int largest(int n1,int n2,int n3)
	{
		if(n1>n2 && n1>n3)
		{
			return n1;
			
		}else if(n2>n1 && n2>n3)
			
		{
			return n2;
			
		}
		else
		{
			return n3;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of number 1: ");
		int num1 =sc.nextInt();
		System.out.println();
		System.out.print("Enter the Value of number 2: ");
		int num2 =sc.nextInt();
		System.out.println();
		System.out.print("Enter the Value of number 3: ");
		int num3 =sc.nextInt();
		System.out.println();
		sc.close();
		int n=0;
		try {
			n=largest(num1,num2,num3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Largest of number given is  : "+ n);

	}

}
