


class Outer{
  public void display(){
    class Inner {
      public void show(){
        System.out.println("hello");
      }
    }
    Inner i = new Inner();
    i.show();
  }
}

public class InnerClsLocal {
 
  public static void main(String[] args) {
    Outer o = new Outer();
    o.display();
  }
}
