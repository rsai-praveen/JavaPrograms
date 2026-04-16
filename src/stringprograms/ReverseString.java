package stringprograms;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		return s1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String want to Reverse : ");
		String st = sc.next();
		sc.close();
		System.out.printf("The reverse of String is %s" ,reverse(st));

	}

}
