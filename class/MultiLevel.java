class Animal {
  void eat() {
    System.out.println("Eating...");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Barking...");
  }
}

class Labrador extends Dog {
  void playFetch() {
    System.out.println("Playing fetch...");
  }
}

public class MultiLevel {
  public static void main(String[] args) {
    Labrador labrador = new Labrador();
    labrador.eat();
    labrador.bark();
    labrador.playFetch();
  }
}