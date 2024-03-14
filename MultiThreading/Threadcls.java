package MultiThreading;

class myThread extends Thread {
  public myThread(String name) {
    super(name);
  }
}

public class Threadcls {
  public static void main(String[] args) {
    myThread th = new myThread("Threads!!!!");
    System.out.println(th.getName());
    System.out.println(th.getPriority());
    System.out.println(th.getState());
    System.out.println(th.isAlive());
  }
}
