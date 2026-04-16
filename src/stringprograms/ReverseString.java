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
		System.out.print("Enter the number you want to Sum number of digits : ");
		String st = sc.next();
		sc.close();
		System.out.println(reverse(st));

	}

}
