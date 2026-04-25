package arrayprograms;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 12, 98, 8, 99, 6, 99 };
		int[] b = { 1, 23, 45, 6 };
		// System.out.printf("The array after removal of duplicates is " +
		// delDuplicate(a).toString());
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int p=a.length;
		for(int i=0;i<b.length;i++)
		{c[p]=b[i];
		p++;
		}
		System.out.println(Arrays.toString(c));

	}

}
