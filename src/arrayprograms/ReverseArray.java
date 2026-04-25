package arrayprograms;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] reverse(int[] a)
	{
		int[] b =new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[a.length-1-i];
		}
		
		return b;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 011, 9, 8, 77, 6, 5 };
		System.out.printf("The reverse of given array is "+Arrays.toString(reverse(a)));

	}

}
