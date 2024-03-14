// package MultiThreading;

// class mythread extends Thread {
//   public void run() {
//     int i = 1;
//     while (true) {
//       System.out.println(i + "Hello");
//       i++;
//     }
//   }
// }

// public class multi {
//   public static void main(String[] args) {
//     mythread t = new mythread();
//     t.start();
//     int i = 1;
//     while (true) {
//       System.out.println(i + "world");
//       i++;
//     }
//   }
// }

// in a single class

package MultiThreading;

public class multi extends Thread {
  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i + "Hello");
      i++;
    }
  }

  public static void main(String[] args) {
    multi m = new multi();
    m.start();
    int i = 1;
    while (true) {
      System.out.println(i + "world");
      i++;
    }
  }

}