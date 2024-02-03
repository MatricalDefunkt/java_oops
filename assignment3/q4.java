class Vehicle {
  private String make;
  private String model;
  private int year;

  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // Getters and setters for make, model, and year
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // Other methods for the Vehicle class
  public void start() {
    System.out.println("The vehicle is starting.");
  }

  public void accelerate() {
    System.out.println("The vehicle is accelerating.");
  }

  public void brake() {
    System.out.println("The vehicle is braking.");
  }
}

public class q4 {
  public static void main(String[] args) {
    // Create instances of Vehicle and perform operations
    Vehicle car = new Vehicle("Toyota", "Camry", 2022);
    car.start();
    car.accelerate();
    car.brake();
  }
}
