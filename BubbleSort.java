import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		Integer[] a = { 2, 4, 1, 3, 9, 7 };
		System.out.println("Before: " + Arrays.toString(a));
		sort(a);
		System.out.println("After: " + Arrays.toString(a));
	}

	static <E extends Comparable<? super E>> void sort(E[] A) {
		for (int i = 0; i < A.length - 1; i++) // Bubble up i’th record
			for (int j = A.length - 1; j > i; j--)
				if ((A[j].compareTo(A[j - 1]) < 0)) {
					Util.swap(A, j, j - 1);
				}
	}
}
