package INHERITANCES;

class Circle {
  private double radius;

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

  public Circle() {
    radius = 0.0;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

}

class Cyclinder extends Circle {
public double height;

  public Cyclinder() {
    height = 0.0;
  }

  public double vol() {
    return (4 / 3) * Math.PI * getRadius() * getRadius() * height;
  }

}

public class Inheritance {

  public static void main(String[] args) {
    Circle c1 = new Circle();
    Cyclinder c2 = new Cyclinder();
    c1.setRadius(20);
    c2.height=30;
    c2.setRadius(40);
    
    System.out.println(c1.area());
    System.out.println(c2.area());
    System.out.println(c2.vol());
  }
}
