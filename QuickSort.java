import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		Integer[] a = { 6, 1, 2, 3, 8, 4 };
		System.out.println("Before: " + Arrays.toString(a));
		qsort(a, 0, a.length - 1);
		System.out.println("After: " + Arrays.toString(a));
	}

	static <E extends Comparable<? super E>> void qsort(E[] A, int i, int j) { // Quicksort
		int pivotindex = findpivot(A, i, j); // Pick a pivot
		Util.swap(A, pivotindex, j); // Stick pivot at end
		// k will be the first position in the right subarray
		int k = partition(A, i - 1, j, A[j]);
		Util.swap(A, k, j);
		if ((k - i) > 1)
			qsort(A, i, k - 1);
		if ((j - k) > 1)
			qsort(A, k + 1, j);

	}

	static <E extends Comparable<? super E>> int findpivot(E[] A, int i, int j) {
		return (i + j) / 2;
	}

	static <E extends Comparable<? super E>> int partition(E[] A, int l, int r, E pivot) {
		do { // Move bounds inward until they meet
			while (A[++l].compareTo(pivot) < 0)
				;
			while ((r != 0) && (A[--r].compareTo(pivot) > 0))
				;
			Util.swap(A, l, r);
		} while (l < r);
		Util.swap(A, l, r);
		return l; // Return first position in right partition
	}

}
