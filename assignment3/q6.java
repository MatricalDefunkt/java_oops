public class q6 {
  public static void main(String[] args) {
    int a = 5;
    modifyPrimitive(a);
    System.out.println("Value of a after modifyPrimitive: " + a); // Outputs: 5

    Integer b = Integer.valueOf(5);
    modifyObject(b);
    System.out.println("Value of b after modifyObject: " + b); // Outputs: 5

    Integer c = Integer.valueOf(5);
    modifyObjectReference(c);
    System.out.println("Value of c after modifyObjectReference: " + c); // Outputs: 5
  }

  public static void modifyPrimitive(int value) {
    value = 10;
  }

  public static void modifyObject(Integer value) {
    value = Integer.valueOf(10);
  }

  public static void modifyObjectReference(Integer value) {
    value.intValue();
    value = 10;
  }
}