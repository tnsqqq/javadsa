public class NumbersExampleRecursion {
  public static void main(String[] args) {
    // Recursion- the function that calls itself
    // Base Condition- condition where our recursion will stop making new calls
    print(1);
  }

  static void print(int n) {
    if (n == 5) {
      System.out.println(5);
      return;
    }
    System.out.println(n);

    // recursive call
    // if you are calling a function again and again, you can treat it as a seperate
    // call in the stack

    // this is called tail recursion
    // this is the last function call
    print(n + 1);
  }
}

// why recursion?
// it helps us in solving bigger / complex problems in a simple way
// you can convert recursion solution into iteration and vise versa
// space complexity is not constant bcoz of recursive calls
