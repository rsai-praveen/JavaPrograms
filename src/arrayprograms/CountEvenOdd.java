package arrayprograms;

public class CountEvenOdd {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 12, 98, 8, 99, 6, 99 };
		int even = 0;
		int odd = 0;
		for (int i : a) {
			if (i % 2 == 0) {
				even++;

			} else {
				odd++;
			}
		}
		System.out.printf("There are total %d even numbers and %d Odd numbers in the given Array", even, odd);

	}

}
