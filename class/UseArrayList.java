import java.util.ArrayList;

public class UseArrayList {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("Element at index 0: " + numbers.get(0));
    System.out.println("Element at index 1: " + numbers.get(1));
    System.out.println("Element at index 2: " + numbers.get(2));

    numbers.set(1, 50);
    System.out.println("Updated element at index 1: " + numbers.get(1));

    numbers.remove(2);
    System.out.println("Size of ArrayList after removal: " + numbers.size());

    System.out.println("Elements in the ArrayList:");
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
