
class mydata {

 synchronized public void display(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
    }
  }
}

class myThread1 extends Thread{
  mydata d;
 public myThread1(mydata d){
    this.d = d;
  }

public void run(){
  d.display("Helloworld ");
}
}

class myThread2 extends Thread{
  mydata d;
 public myThread2(mydata d){
    this.d = d;
  }
  public void run(){
    d.display("  welcome");
  }
}

public class synDemo {

  public static void main(String[] args) {
    mydata d = new mydata();
    myThread1 t1 = new myThread1(d);
    myThread2 t2 = new myThread2(d);
    t1.start();
    t2.start();
  }
}