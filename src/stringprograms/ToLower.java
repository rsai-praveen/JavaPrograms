package stringprograms;

import java.util.Scanner;

public class ToLower {

	public static void main(String[] args) {
		// TODO 6 Convert lowercase to uppercase
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string want to convert to uppercase ");
		String str = sc.nextLine();
		

		sc.close();
		
		System.out.println(str.toLowerCase());
				

	}

}
