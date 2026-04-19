package stringprograms;

import java.util.Scanner;

public class CountVowelsConsonants {
//13  Vowels: a,e,i,o,u
	String v[] = { "a", "e", "i", "o", "u" };

	public static int[] vowels(String s) {
		int l = s.length();
		System.out.println(s);
		System.out.println("length of given String is "+l);
		int[] count = new int[2];
		int i = 0;
		while (i < l) {

			if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i'
					|| s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') {
				count[0]++;
			} else if(s.toLowerCase().charAt(i)==' '){
				i++;
				continue;
			

			}
			else
			{
				count[1]++;
			}
			i++;

		}

		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string want to check Count of vowels and Consonents : ");
		String str = sc.nextLine();
		sc.close();
		int[] c=vowels(str);
		System.out.printf("The number of Vowels in Giver String is %s", c[0]);
		System.out.println();
		System.out.printf("The number of Consonents in Giver String is %s", c[1]);
		System.out.println();
	}

}
