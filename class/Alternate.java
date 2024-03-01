
public class Alternate {
  Number[] arrayNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

  public static void main(String[] args) {
    Alternate alternate = new Alternate();
    alternate.printAlternate();
  }

  public void printAlternate() {
    for (int i = 0; i < arrayNumbers.length; i += 2) {
      System.out.print(arrayNumbers[i] + " ");
    }
  }
}
