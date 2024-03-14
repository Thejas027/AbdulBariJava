package INHERITANCES;

class Rectangular {
  public int length;
  public int breadth;

  public Rectangular() {
    length = breadth = 1;
  }

  public Rectangular(int l, int b) {
    length = l;
    breadth = b;
  }
}

class Cubodical extends Rectangular {
  public int height;

  public Cubodical() {
    height = 1;
  }

  public Cubodical(int h) {
    height = h;
  }

  public Cubodical(int l, int b, int h) {
  super(l,b);
    height = h;
  }

  public int volume() {
    return length * breadth * height;
  }
}

public class InheritConst2 {
  public static void main(String[] args) {
    Cubodical c = new Cubodical();
    Cubodical c1 = new Cubodical(10);
    Cubodical c2 = new Cubodical(10, 20, 30);
    System.out.println(c.volume());
    System.out.println(c1.volume());
    System.out.println(c2.volume());
  }
}
