package stringprograms;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Scanner;

public class EachChaFrequency {

	public static void frequency(String s) {

		String[] Array = s.split("");
		HashSet<String> setList = new HashSet<String>(Arrays.asList(Array));

		for (String a : setList) {
			int count = 0;
			for (String b : Array) {
				if (a.equals(b)) {
					count++;
				}
			}
			System.out.printf("The Frequecy of '%s' in a array is %d", a, count);
			System.out.println();
		}

	}

	public static void main(String[] args) {
//Find frequency of each character
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string want to check Character Frequency: ");
		String str = sc.nextLine();
		sc.close();

		frequency(str);

	}

}
