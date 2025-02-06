public class InfiniteArray {
  public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
    int target = 10;
    System.err.println(ans(arr, target));
  }

  static int ans(int[] arr, int target) {
    // first find the range
    // start with the box of size 2
    int start = 0;
    int end = 1;

    // condition for the target to lie in the range
    while (target > arr[end]) {
      int temp = end + 1; // this is my new start
      // double the box value
      // end = previous end + sizeofbox*2
      end = end + (end - start + 1) * 2;
      start = temp;
    }

    return infiniteArray(arr, target, start, end);

  }

  static int infiniteArray(int[] arr, int target, int start, int end) {

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;

  }
}
