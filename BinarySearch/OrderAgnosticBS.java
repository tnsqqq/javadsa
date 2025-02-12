public class OrderAgnosticBS {
  public static void main(String[] args) {
    // int[] arr = { 2, 3, 4, 15, 16, 18, 22, 45 };
    int[] arr = { 99, 80, 75, 22, 11, 10, 5, 2, -3 };
    int target = 22;
    int ans = orderAgnosticBS(arr, target);
    System.out.println(ans);

  }

  static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find weather the array is sorted in ascending or descending
    // if (arr[start] < arr[end]) {
    // isAsc = true;
    // } else {
    // isAsc = false;
    // }

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {

        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {

        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}
