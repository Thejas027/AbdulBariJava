package InterProcessThreads;

class mydata {
  int val;
  boolean flag = true;

  synchronized public void set(int v) {
    while (flag != true)
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    val = v;
    flag = false;
    notify();
  }

  synchronized public int get() {
    int x = 0;
    while (flag != false)
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    x = val;
    flag=true;
    notify();
    return x;
  }
}

class producer extends Thread {
  mydata data;

  public producer(mydata d) {
    data = d;
  }

  public void run() {
    int count = 1;
    while (true) {
      data.set(count);
      System.out.println("producer" + count);
      count++;
    }
  }
}

class consumer extends Thread {
  mydata data;

  public consumer(mydata d) {
    data = d;
  }

  public void run() {
    int val;
    while (true) {
      val = data.get();
      System.out.println("consumer " + val);
    }
  }
}

public class Demo1 {
  public static void main(String[] args) {
    mydata data = new mydata();
    producer p = new producer(data);
    consumer c = new consumer(data);
    p.start();
    c.start();
  }
}
