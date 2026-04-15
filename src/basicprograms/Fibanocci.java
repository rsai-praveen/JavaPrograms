package basicprograms;

import java.util.Scanner;

public class Fibanocci {
	public static void fib(int n)
	{int j=0;
	int k= 1;
	int l=0;
	System.out.printf("%d %d",j,k);
		for(int i=0;i<n-2;i++)
		{
			l=j+k;
			System.out.printf(" %d",l);
			j=k;
			k=l;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of terms you need to print in fibanacci series : ");
		int number = sc.nextInt();
		sc.close();
		System.out.printf("First %d terms of fibanacci series is : ",number);
		fib(number);


	}

}
