import java.util.*;

public class Strings {

  // Comparison
  public static void main(String[] args) {
    // String a = "tanishq";
    String b = "tanishq";
    // String c = a;
    // System.out.println(c == a);

    // ==
    // System.out.println(a == b);

    String name1 = new String("tanishq");
    String name2 = new String("tanishq");

    System.out.println(name1 == name2);

    System.out.println(name1.equals(name2));

    // PrintStream Class
    System.out.println(56); // return Integer.toString(i);

    // String name = null;
    // System.out.println(name);

    // Pretty Printing in Java
    // float a = 453.1274f;
    // System.out.printf("Formatted number is %.2f", a);

    // System.out.printf("Pie: %.3f", Math.PI);

    // System.out.printf("Hello my name is %s and I am %s", "tanishq", "sexy");

    // String Concatenation
    System.out.println('a' + 'b');
    System.out.println("a" + "b");
    System.out.println((char) ('a' + 3));

    System.out.println("a" + 1);
    // this is same as after a few steps: "a" + "1"
    // integer will be converted to Integer that will call toString()

    System.out.println("tani" + new ArrayList<>());
    System.out.println("tani" + new Integer(56));

    // System.out.println(new Integer(56) + new ArrayList<>()); // error

    // String Performance

    String series = "";
    for (int i = 0; i < 26; i++) {
      char ch = (char) ('a' + i);
      series = series + ch; // series += ch
    }

    System.out.println(series);
    System.out.println("a" + 'b');

    // StringBuilder Class
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      char ch = (char) ('a' + i);
      builder.append(ch);
    }

    System.out.println(builder.toString());

    builder.deleteCharAt(0);
    System.out.println(builder);
    builder.reverse();
    System.out.println(builder);

    // String Methods
    String name = "tanishq baliyan";
    System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println(name.toLowerCase());
    System.out.println(name);
    System.out.println(name.indexOf('a'));
    System.out.println("    tanishq    ".strip());
    System.out.println(Arrays.toString(name.split(" ")));
  }
}
