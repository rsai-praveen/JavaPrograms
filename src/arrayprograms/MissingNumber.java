package arrayprograms;

public class MissingNumber {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int z=0;
		for (int i =0;i<a.length-1;i++)
		{
			if(!(a[i]+1==a[i+1]))
			{
				z=a[i]+1;
			}
		}
			

		System.out.printf("The missing numbers in the given Array is %d",z);

	}

}
