package stringprograms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string want to check palindrome : ");
		String str = sc.next();
		sc.close();
		System.out.printf("Reverse of String is %s ",ReverseString.reverse(str));
		System.out.println();
		if (str.equals(ReverseString.reverse(str)))
		{
			System.out.println("Given string is Palindrome");
		}
		else
		{
			System.out.println("Given string is NOT Palindrome");
		}

	}

}
