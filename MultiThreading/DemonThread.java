package MultiThreading;
class myThread extends Thread {
  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i++);
    }
  }
}

public class DemonThread {
  public static void main(String[] args) {
    myThread m = new myThread();
    m.setDaemon(true);
    m.start();
    try {
      Thread.sleep(100);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
