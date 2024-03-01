public class Box {
  private int length;
  private int width;
  private int height;

  public Box(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void printBoxDimensions() {
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
  }

  public void printVolume() {
    int volume = length * width * height;
    System.out.println("Volume: " + volume);
  }
}
