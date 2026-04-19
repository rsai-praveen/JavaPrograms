package stringprograms;

import java.util.Scanner;

public class StringAnagram {
	public static String sorting(String s) {
		char[] c1 = s.toCharArray();
		// char[] c2 = s2.toCharArray();
		char temp = ' ';
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1.length - 1; j++) {

				if (c1[j] > c1[j + 1]) {
					temp = c1[j];
					c1[j] = c1[j + 1];
					c1[j + 1] = temp;
					// break;
				}
			}

		}
		s = "";
		for (char a : c1) {
			s = s + a;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Check if two strings are anagrams
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string-1 want to check anagram: ");
		String str1 = sc.nextLine();
		System.out.println();
		System.out.print("Enter the string-2 want to check anagram: ");
		String str2 = sc.nextLine();
		System.out.println();

		sc.close();
		if (sorting(str1).equals(sorting(str2))) {
			System.out.println("The given 2 strings are Anagram");
		} else {
			System.out.println("The given 2 strings  are NOT Anagram");
		}
		// System.out.println(anagram(str1, str2));

	}

}
