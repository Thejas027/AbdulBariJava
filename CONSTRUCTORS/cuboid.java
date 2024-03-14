package CONSTRUCTORS;
import java.util.Scanner;

public class cuboid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lenght of a cuboid");
    int lenght = sc.nextInt();
    System.out.println("enter the breadth of a cuboid");
    int breadth = sc.nextInt();
    System.out.println("Enter the height of cuboid");
    int height = sc.nextInt();

    int a1 = lenght * height;
    System.out.println(" the area of FRONT AND BACK side of cuboid is"+a1);

     int a2 = height * breadth;
    System.out.println(" the area of RIGHT AND LEFT side of cuboid is"+a2);

     int a3 = lenght * breadth;
    System.out.println(" the area of BOTTOM AND TOP side of cuboid is"+a3);

    int vol = lenght* breadth * height;
    System.out.println("the VOLUME of a cuboid is"+vol);
    sc.close();
  }
}
