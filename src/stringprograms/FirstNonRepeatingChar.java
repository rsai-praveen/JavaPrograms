package stringprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static String firstNonRepeatChar(String s) {
		String[] s1 = s.split("");

		HashSet<String> set1 = new HashSet<String>(Arrays.asList(s1));
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		for (String a : set1) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (a.equals(s1[i])) {
					count++;
				}
			}
			myMap.put(a, count);
		}
		String character="";
		for (String s2 : s1) {
			if (myMap.get(s2) == 1) {
				character = s2;
				break;
			}
		}
		return character;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string want to find 1st non repeating character: ");
		String str1 = sc.nextLine();
		System.out.println();
		sc.close();

		System.out.println(firstNonRepeatChar(str1));

	}

}
