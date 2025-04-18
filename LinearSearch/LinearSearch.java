
public class LinearSearch {
  public static void main(String[] args) {
    int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
    int target = 19;

    System.out.println(linearSearch(nums, target));
  }

  // search the target and return the element - return i --> return element

  // search in the array: return the index if item found
  // ohterwise if item not found return -1
  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int i = 0; i < arr.length; i++) {
      // check for element at every index if it is = target
      int element = arr[i];
      if (element == target) {
        return i;
      }
    }

    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return -1;
  }
}