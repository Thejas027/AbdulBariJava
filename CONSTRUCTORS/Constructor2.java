package CONSTRUCTORS;
class Cyclinder {
  private double radius;
  private double height;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double r) {
    if (r > 0) {
      radius = r;
    } else {
      radius = 0;
    }
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double h) {
    if (h > 0) {
      height = h;
    } else {
      height = 0;
    }
  }

  public Cyclinder() {
    radius = 1;
    height = 1;
  }

  public Cyclinder(double r) {
    setRadius(r);
    height = 1;
  }

  public Cyclinder(double r, double h) {
    setRadius(r);
    setHeight(h);
  }

  public double arae() {
    return 2 * Math.PI * radius * radius * height;
  }

  public double vol() {
    return Math.PI * radius * radius * height;
  }
}

public class Constructor2 {
  public static void main(String[] args) {
    Cyclinder c1 = new Cyclinder();
    Cyclinder c2 = new Cyclinder(10);
    Cyclinder c3 = new Cyclinder(10, 10);
    System.out.println("");
    System.out.println("Area1:" + c1.arae());
    System.out.println("");
    System.out.println("Area2:" + c2.arae());
    System.out.println("");
    System.out.println("Area3:" + c3.arae());
    System.out.println("");
    System.out.println("volume1:" + c1.vol());
    System.out.println("");
    System.out.println("volume2:" + c2.vol());
    System.out.println("");
    System.out.println("volume3:" + c3.vol());
  }
}
