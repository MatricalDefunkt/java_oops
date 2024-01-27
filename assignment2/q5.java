public class q5 {
  public static void main(String[] args) {
    String acc = "";
    for (String arg : args) {
      acc += arg;
      acc += " ";
    }
    System.out.println(acc);
  }
}
