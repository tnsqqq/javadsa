public class DigitProduct {

  public static void main(String[] args) {
    int ans = pro(1342);
    System.out.println(ans);
  }

  static int pro(int n) {
    if (n%10 == n) {
      return n;
    }

    return (n % 10) * pro(n / 10);
  }
}
