import java.util.*;

public class SearchIn2DArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 4, 1 },
        { 18, 12, 3, 9 },
        { 78, 99, 34, 56 },
        { 18, 12 }
    };
    int target = 34;
    int[] ans = search(arr, target); // format of return value {row, col}
    System.out.println(Arrays.toString(ans)); // Prints location of target
    System.out.println(max(arr)); // Prints maximum value in the 2D array
  }

  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 }; // Return -1, -1 if target is not found
  }

  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE; // Initialize to the smallest possible value
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] > max) {
          max = arr[row][col]; // Update max if a larger value is found
        }
      }
    }
    return max; // Return the largest value
  }
}
