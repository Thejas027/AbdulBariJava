import java.util.Scanner;

public class radix {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    if(str.matches("[01]+")){
      System.out.println("its a binary");
    } else if(str.matches("[0-7]+")){
      System.out.println("octal number");
    } else if(str.matches("[0-9]+")){
      System.out.println("decimal number");
    } else if(str.matches("[0-9A-F]+")){
      System.out.println("Hexa decimal number");
    } else{
      System.out.println("not a number");
    }


    sc.close();
  }
}
