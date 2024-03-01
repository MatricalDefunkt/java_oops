import java.util.Scanner;

public class EvenNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    sc.close();
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The even numbers in the array are: ");
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
