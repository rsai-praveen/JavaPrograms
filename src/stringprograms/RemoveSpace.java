package stringprograms;

import java.util.Scanner;

public class RemoveSpace {
	public static String removeSpace(String s) {
		String[] a = s.split(" ");
		s = "";
		for (String b : a) {
			s = s + b;
		}

		return s;
	}

	public static void main(String[] args) {
		// TODO 5. Remove spaces from a string

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string want to remove spaces: ");
		String str = sc.nextLine();

		sc.close();
		// method 1
		System.out.println(str.replace(" ",""));
		
		//method 2
		System.out.println(removeSpace(str));

	}

}
