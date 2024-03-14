interface test{
  void m1();
  void m2();
}

class test2 implements test{
  public void m1(){
    System.out.println("Test2 meth1");
  }
  public void m2(){
    System.out.println("Test2 meth2");
  }
  public void m3(){
    System.out.println("Test2 meth3");
  }
}

public class Interfaces {
  public static void main(String[] args) {
    test t = new test2();
    t.m1();
    t.m2();
  }
}
