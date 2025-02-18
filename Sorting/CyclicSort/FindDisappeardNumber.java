import java.util.*;

public class FindDisappeardNumber {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    FindDisappeardNumber obj = new FindDisappeardNumber();
    List<Integer> missing = obj.findDisappeardNumber(arr);
    System.out.println(missing);
  }

  public List<Integer> findDisappeardNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    // just find missing numbers
    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index + 1) {
        ans.add(index + 1);
      }
    }
    return ans;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
