import java.util.Scanner;

class Rectangle {
  private int lenght;
  private int breadth;

  public int area() {
    return lenght * breadth;
  }

  public int perimeter() {
    return 2 * (lenght + breadth);
  }

  int getLenght() {
    return lenght;
  }

  void setLenght(int l) {
    if (l > 0) {
      lenght = l;
    } else {
      lenght = 0;
    }
  }

  int getBreadth() {
    return breadth;
  }

  void setBreadth(int b) {
    if (b > 0) {
      breadth = b;
    } else {
      breadth = 0;
    }
  }
}

public class DataHiding {

  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the bredath and lenght value of integer");
    int l = sc.nextInt();
    int b = sc.nextInt();
    r.setLenght(l);
    r.setBreadth(b);
    System.out.println("The lenght of a rectangle :" + r.getLenght());
    System.out.println("The breadth of rectangle :" + r.getBreadth());
    System.out.println("The area of rectangle:" + r.area());
    System.out.println("The perimeter of rectangle:" + r.perimeter());
    sc.close();
  }
}