public class ExceptionHandling {
  public static void main(String[] args) {
    String test = "this is not an int";
    try {
      int num = Integer.parseInt(test);
      System.out.println(num);
      System.out.println("This will not be printed");
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException occurred");
    } catch (Exception e) {
      System.out.println("Some other exception occurred");
    } finally {
      System.out.println("This will be printed");
    }
  }
}
