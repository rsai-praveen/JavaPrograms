package stringprograms;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
	public static String delChar(String s) {

		StringBuilder ans = new StringBuilder();

		HashSet<Character> set1 = new HashSet<Character>();
		for (char z : s.toCharArray()) {
			if (!set1.contains(z)) {
				set1.add(z);
				ans.append(z);

			}

		}
		// System.out.println(ans);
		return ans.toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string want to remove duplicate Characters: ");
		String str1 = sc.nextLine();
		System.out.println();
		sc.close();
		System.out.printf("String after removing duplicates : %s", delChar(str1));
		System.out.println();

	}

}
