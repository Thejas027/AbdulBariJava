// import java.util.*;
// import java.io.*;

// // try with resources 
// public class Demo4 {

//   static FileInputStream fi;
//   static Scanner sc;

//   static void divide() throws Exception {
//     fi = new FileInputStream("text.txt");
// try{
//       sc = new Scanner(fi);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();
//     System.out.println(a / c);
// }
// finally{
//       fi.close();
//     sc.close();
// }
//   }

//   public static void main(String[] args) throws Exception {
// try{
//       divide();
// }
// catch(Exception e){
//   System.out.println(e);
// }
//     int x = sc.nextInt();
//      System.out.println(x);
//   }
// }

////// TRY WITH RECOURES 

import java.util.*;
import java.io.*;

// try with resources 
public class Demo4 {

  static void divide() throws Exception {
    try (FileInputStream fi = new FileInputStream("text.txt"); Scanner sc = new Scanner(fi)) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(a / c);
      System.out.println(b);
    }
  }

  public static void main(String[] args) throws Exception {
    try {
      divide();
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
