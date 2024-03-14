package CONSTRUCTORS;
class Rectangle {
  private int lenght;
  private int breadth;

  public int getLenght() {
    return lenght;
  }

  public void setLenght(int l) {
    if (l > 0) {
      lenght = l;
    } else {
      lenght = 0;
    }
  }

  public int getBreadth() {
    return breadth;
  }

  public void setBreadth(int b) {
    if (b > 0) {
      breadth = b;
    } else {
      breadth = 0;
    }
  }
 // DEFAULT CONSTRUCTOR
  public Rectangle() {
    lenght = 1;
    breadth = 1;
  }
// PARAMETRIZED CONSTRUCTOR
  public Rectangle(int l, int b) {
    setLenght(l);
    setBreadth(b);
  }
// PARAMETRIZED CONSTRUCTOR WHERE ONLY ONE PARAMETER IS PASSED 
  public Rectangle(int s) {
    lenght = breadth = s;
  }

  public int area() {
    return lenght * breadth;
  }

  public int perimeter() {
    return 2 * (lenght + lenght);
  }
}

public class Constructor {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();   // CREATING  AN OBJECT AND CALLING A DEFAULT CONSTRUCTOR
    Rectangle r1 = new Rectangle(10, 2); // CREATING AN OBJECT AND CALLING A PARAMETRIZED CONSTRUCTOR

    System.out.println("The area of rectangle using NON PARAMETRIZED Constructor:" + r.area());
    System.out.println("The area of rectangle using PARAMETRIZED Constructor:" + r1.area());
  }
}
