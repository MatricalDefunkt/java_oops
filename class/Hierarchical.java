// Hierarchical inheritance with method overriding

import java.util.Arrays;

class Student {
  String name;
  String[] subjects;

  void study() {
    System.out.println("Studying");
  }

  Student(String name, String[] subjects) {
    this.name = name;
    this.subjects = subjects;
  }
}

class FirstYear extends Student {
  private String[] firstYearSubjects = { "Maths", "Physics", "Chemistry" };
  public String[] firstYearSubjectsFinal;

  void study() {
    System.out.println("Studing in first year");
  }

  FirstYear(String name, String[] subjects) {
    super(name, subjects);
    this.firstYearSubjectsFinal = new String[subjects.length];
    int count = 0;
    for (String subject : subjects) {
      if (Arrays.asList(this.firstYearSubjects).contains(subject)) {
        this.firstYearSubjectsFinal[count] = subject;
        count++;
      }
    }
  }
}

class SecondYear extends Student {
  private String[] secondYearSubjects = { "Data Structures", "Programming Paradigms", "Java Flexi", "DBMS" };
  public String[] secondYearSubjectsFinal;

  void study() {
    System.out.println("Studing in second year");
  }

  SecondYear(String name, String[] subjects) {
    super(name, subjects);
    this.secondYearSubjectsFinal = new String[subjects.length];
    int count = 0;
    for (String subject : subjects) {
      if (Arrays.asList(this.secondYearSubjects).contains(subject)) {
        this.secondYearSubjectsFinal[count] = subject;
        count++;
      }
    }
  }
}

public class Hierarchical {
  public static void main(String[] args) {
    FirstYear firstYear = new FirstYear("John", new String[] { "Maths", "Physics", "Chemistry", "Data Structures" });
    firstYear.study();
    System.out.println("First year subjects: " + Arrays.toString(firstYear.firstYearSubjectsFinal));

    SecondYear secondYear = new SecondYear("Doe",
        new String[] { "Data Structures", "Programming Paradigms", "Java Flexi", "DBMS" });
    secondYear.study();
    System.out.println("Second year subjects: " + Arrays.toString(secondYear.secondYearSubjectsFinal));
  }
}
