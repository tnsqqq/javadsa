import java.util.*;

public class MaxWealth {
  public static void main(String[] args) {
    int[][] accounts = { { 1, 2, 3 }, { 2, 3, 4 }, { 2, 3, 4, 5 } };
    System.out.println(maxWealth(accounts));

  }

  static int maxWealth(int[][] accounts) {
    // person = row;
    // account = col;
    int ans = Integer.MIN_VALUE;
    // for (int person = 0; person < accounts.length; person++)
    for (int[] ints : accounts) {
      // when you start a new col, take a new sum for that row.
      int sum = 0;
      // for (int account = 0; account < accounts[person].length; account++)
      for (int intss : ints) {
        // sum += accounts[person][account];
        sum += intss;
      }
      // now we have sum of accounts of person
      // check with overall ans
      if (sum > ans) {
        ans = sum;
      }
    }
    return ans;
  }

}
