public class Palindrome {

  public static void main(String[] args) {
    String str = "abccba";
    System.out.println(palindrome(str));

  }

  static boolean palindrome(String str) {
    if (str == null || str.length() == 0) {
      return true;
    }
    for (int i = 0; i < str.length(); i++) {
      int start = str.charAt(i);
      int end = str.charAt(str.length() - 1 - i);

      if (start != end) {
        return false;
      }
    }
    return true;
  }
}
