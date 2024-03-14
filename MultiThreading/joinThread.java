package MultiThreading;

class myThread extends Thread {
  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i++);
    }
  }
}

public class joinThread {
  public static void main(String[] args) {
    
    myThread m = new myThread();
    m.setDaemon(true);
Thread mainThread = Thread.currentThread();
try{
  mainThread.join(0);
} catch(Exception e){
  System.out.println(e);
}
  }
}
