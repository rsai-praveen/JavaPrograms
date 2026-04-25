package arrayprograms;



public class SecondLargest {
	public static int secondLargest(int[] a)
	{int max=a[0];
	int max2=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		
	}
	//System.out.println(max);
	for(int i=0;i<a.length;i++)
	{
		if(max2<a[i] && a[i]!=max)
		{
			max2=a[i];
		}
	}
		
		
		return max2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 12, 98, 8, 77, 6, 99 };
		System.out.printf("The 2nd largest of given array is "+secondLargest(a));

	}

}
