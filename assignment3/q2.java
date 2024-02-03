public class q2 {

  public static void main(String[] args) {
    Person person1 = new Person("John", 20);
    Person person2 = new Person(person1);

    System.out.println(person1);
    System.out.println(person2);
  }

}

class Person {
  private String name;
  private int age;

  // Parameterized constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Copy constructor
  public Person(Person other) {
    this.name = other.name;
    this.age = other.age;
  }
}