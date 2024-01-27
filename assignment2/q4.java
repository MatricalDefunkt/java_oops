public class q4 {
  public static void main(String[] args) {
    Integer arg1 = Integer.parseInt(args[0]);
    Integer arg2 = Integer.parseInt(args[1]);
    String op = args[2];

    if (op == "+") {
      System.out.println(arg1 + arg2);
    } else if (op == "-") {
      System.out.println(arg1 - arg2);
    } else if (op == "*") {
      System.out.println(arg1 * arg2);
    } else if (op == "/") {
      System.out.println(arg1 / arg2);
    } else if (op == "%") {
      System.out.println(arg1 % arg2);
    } else {
      System.out.println("Invalid operator.");
    }
  }
}
