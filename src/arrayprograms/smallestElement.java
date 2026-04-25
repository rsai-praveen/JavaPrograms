package arrayprograms;

public class smallestElement {
	public static int minArray(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 011, 9, 8, 77, 6, 5 };
		System.out.printf("The smallest of given array is %d", minArray(a));
	}

}
