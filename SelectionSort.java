import java.util.Arrays;

public class SelectionSort {
	public void main(String args[]) {
		Integer[] a = { 6, 4, 7, 5, 3, 2, 8, 9, 1 };
		System.out.println("Before: " + Arrays.toString(a));
		sort(a);
		System.out.println("After: " + Arrays.toString(a));
	};

	static <E extends Comparable<? super E>> void sort(E[] A) {
		for (int i = 0; i < A.length - 1; i++) { // Select i’th record
			int lowindex = i; // Remember its index
			for (int j = A.length - 1; j > i; j--) // Find the least value
				if (A[j].compareTo(A[lowindex]) < 0)
					lowindex = j; // Put it in place
			Util.swap(A, i, lowindex);
		}
	}

}
