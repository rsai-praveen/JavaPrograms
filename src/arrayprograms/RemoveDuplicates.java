package arrayprograms;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static ArrayList<Integer> delDuplicate(int[] a) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int d:a)
		{
			if(!l.contains(d))
					{
				l.add(d);
					}
		}
		return l;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 12, 98, 8, 99, 6, 99 };
		System.out.printf("The array after removal of duplicates is " + delDuplicate(a).toString());

	}

}
