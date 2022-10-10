import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		Integer[] a = { 6, 2, 5, 3, 4, 7, 1 };
		System.out.println("Before: " + Arrays.toString(a));
		sort(a);
		System.out.println("After: " + Arrays.toString(a));
	}

	static <E extends Comparable<? super E>> void sort(E[] A) {
		for (int i = A.length / 2; i > 2; i /= 2) // For each increment
			for (int j = 0; j < i; j++) // Sort each sublist
				inssort2(A, j, i);
		inssort2(A, 0, 1); // Could call regular inssort here
	}

	// Modified version of Insertion Sort for varying increments
	static <E extends Comparable<? super E>> void inssort2(E[] A, int start, int incr) {
		for (int i = start + incr; i < A.length; i += incr)
			for (int j = i; (j >= incr) &&
					(A[j].compareTo(A[j - incr]) < 0); j -= incr)
				Util.swap(A, j, j - incr);
	}

}
