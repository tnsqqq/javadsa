
public class NumbersExample {
  public static void main(String[] args) {
    // Write a function that takes in a number and prints it
    // print first 5 numbers: 1 2 3 4 5

    // print1(1);
    // print1(2);
    // print1(3);
    // print1(4);
    // print1(5);

    print1(1);
  }

  static void print1(int n) {
    System.out.println(n);
    print2(2);
  }

  static void print2(int n) {
    System.out.println(n);
    print3(3);
  }

  static void print3(int n) {
    System.out.println(n);
    print4(4);
  }

  static void print4(int n) {
    System.out.println(n);
    print5(5);
  }

  static void print5(int n) {
    System.out.println(n);
  }

}

// while the function is not finished executing it will remain in stack
// when the function finished executing it is removed from stack and the flow of
// program restored.
