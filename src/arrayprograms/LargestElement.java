package arrayprograms;

public class LargestElement {
	public static int maxArray(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 0, 9, 8, 77, 6, 5 };
		System.out.printf("The maimum of given array is %d", maxArray(a));
	}

}
