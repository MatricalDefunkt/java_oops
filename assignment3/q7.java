class Person {
  private int age;  

  public Person(int initialAge) {
    if (initialAge < 0) {
      System.out.println("Age is not valid, setting age to 0.");
      this.age = 0;
    } else {
      this.age = initialAge;
    }
  }

  public void amIOld() {
    if (age < 13) {
      System.out.println("You are young.");
    } else if (age >= 13 && age < 18) {
      System.out.println("You are a teenager.");
    } else {
      System.out.println("You are old.");
    }
  }

  public void yearPasses() {
    this.age++;
  }
}

public class q7 {
  public static void main(String[] args) {
    Person person = new Person(20);
    person.amIOld();
    person.yearPasses();
    person.amIOld();
  }
}