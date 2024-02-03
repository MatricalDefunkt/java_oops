class Person {
  String name;
  int age;
  String address;
  String phoneNumber;
  String email;

  Person(String name, int age, String address, String phoneNumber, String email) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: "
        + email;
  }
}

public class q1 {
  public static void main(String[] args) {
    Person person = new Person("John", 20, "123, Main St", "1234567890", "john@doe.com");
    System.out.println(person);
  }
}