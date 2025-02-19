import java.util.*;

public class FindAllDuplicates {

  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 3, 2, 1 };
    FindAllDuplicates obj = new FindAllDuplicates();
    List<Integer> duplicate = obj.findDuplicates(arr);
    System.out.println(duplicate);
  }

  public List<Integer> findDuplicates(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index + 1) {
        ans.add(arr[index]);
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
