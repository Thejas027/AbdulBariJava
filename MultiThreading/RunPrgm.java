
// package MultiThreading;

// class my implements Runnable {
//   public void run() {
//     int i = 1;
//     while (true) {
//       System.out.println(i + "hello");
//       i++;
//     }
//   }
// }

// public class RunPrgm {
//   public static void main(String[] args) {
//     my m = new my();
//     Thread t = new Thread(m);
//     t.start();
//     int i = 1;
//     while (true) {
//       System.out.println(i + "world");
//       i++;
//     }
//   }
// }

// This can be done using a single class
package MultiThreading;

public class RunPrgm implements Runnable {
  public void run() {
    int i = 1;
    while (i<10) {
      System.out.println(i + "hello");
      i++;
    }
  }

  public static void main(String[] args) {
    RunPrgm r = new RunPrgm();
    Thread t = new Thread(r);
    t.start();
    int i = 1;
    while (i<10) {
      System.out.println(i + "world");
      i++;
    }
  }
}