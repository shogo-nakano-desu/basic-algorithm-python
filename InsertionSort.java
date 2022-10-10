import java.util.Arrays;

class InsertionSort {

  public static void main(String[] args) {
    Integer[] a = { 6, 4, 5, 1, 3, };
    System.out.println("Before sort: " + Arrays.toString(a));

    sort(a);
    System.out.println("After sort: " + Arrays.toString(a));
  }

  static <E extends Comparable<? super E>> void sort(E[] A) {
    for (int i = 1; i < A.length; i++) {
      for (int j = i; (j > 0) && (A[j].compareTo(A[j - 1]) < 0); j--) {
        Util.swap(A, j, j - 1);
      }
    }
  }
}
