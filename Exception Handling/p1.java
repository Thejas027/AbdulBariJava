// demo program 

import java.util.Scanner;

public class p1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;
    try {
      c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println("connat be divided by zero try again ");
    }
    System.out.println("\nProgram ended");
    sc.close();
  }
}
