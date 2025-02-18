import java.util.*;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 1, 2, 3 };
    insertion(arr);
    System.out.println(Arrays.toString(arr));

  }

  static void insertion(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}

// 1. Adaptive: steps get reduced if array is sorted, no of swaps reduced as
// compared to bubble sort.
// 2. stable
// 3. used for smaller values of N -> works good when array is partially sorted.
// It takes part in hybrid sorting algorithms.
