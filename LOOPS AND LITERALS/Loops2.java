import java.util.Scanner;

public class Loops2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice");
    System.out.println("1.Display the Digits");
    System.out.println("2.Count Digits of a number");
    System.out.println("3.To find a Amstrong Number");
    System.out.println("4.reverse a number");
    System.out.println("5.To check the number is palindrome ");
    System.out.println("6.To dispaly number in words");
    System.out.println("7.Fibbonaci");
    System.out.println("8. A.P series");
    System.out.println("9. G.P series");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("enter the n value to display the digits");
        int n1 = sc.nextInt();
        while (n1 > 0) {
          int r = n1 % 10;
          n1 = n1 / 10;
          System.out.println(r);
        }
        break;
      case 2:
        System.out.println("enter the n value to count the digits");
        int n2 = sc.nextInt();
        int count = 0;
        while (n2 > 0) {
          n2 = n2 / 10;
          count++;
        }
        System.out.println("The count :" + count);
        break;
      case 3:
        System.out.println("enter the n value to get a Amstrong numbers");
        int n3 = sc.nextInt();
        int sum = 0;
        int m = n3;
        while (n3 > 0) {
          int r = n3 % 10;
          sum = sum + r * r * r;
          n3 = n3 / 10;
        }
        System.out.println("The sum :" + sum);
        if (m == sum) {
          System.out.println("Its an Amstrong number");
        } else {
          System.out.println("not a amstrong number");
        }
        break;
      case 4:
        System.out.println("enter a number to be reversed");
        int n4 = sc.nextInt();
        int rev = 0;
        while (n4 > 0) {
          int r = n4 % 10;
          rev = rev * 10 + r;
          n4 = n4 / 10;
        }
        System.out.println("The revered number :" + rev);
        break;

      case 5:
        System.out.println("enter a number to be reversed");
        int n5 = sc.nextInt();
        int m1 = n5;
        int reve = 0;
        while (n5 > 0) {
          int r = n5 % 10;
          reve = reve * 10 + r;
          n5 = n5 / 10;
        }
        System.out.println("The number is :" + reve);
        if (m1 == reve) {
          System.out.println("Its a palindrome number");
        } else {
          System.out.println("its a not a palindrome number");
        }
      case 6:
        System.out.println("enter the number");
        int n6 = sc.nextInt();
        int r;
        String str = " ";
        while (n6 > 0) {
          r = n6 % 10;
          n6 = n6 / 10;
          str = str + r;
        }
        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
          c = str.charAt(i);
          switch (c) {
            case '0':
              System.out.print("Zero ");
              break;

            case '1':
              System.out.print("One ");
              break;
            case '2':
              System.out.print("Two ");
              break;
            case '3':
              System.out.print("Three ");
              break;
            case '4':
              System.out.print("Four ");
              break;
            case '5':
              System.out.print("Five ");
              break;

            case '6':
              System.out.print("Six ");
              break;
            case '7':
              System.out.print("Seven ");
              break;
            case '8':
              System.out.print("Eight ");
              break;
            case '9':
              System.out.print("Nine ");
              break;
            default:
              break;
          }
        }
      case 7:
        int a = 0, b = 1, p = 0;
        System.out.println("Enter number of digits");
        int n7 = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while (n7 >= 2) {
          p = a + b;
          System.out.println(p);
          a = b;
          b = p;
          n7--;
        }
        case 8:
        System.out.println("Enter the starting value of AP series");
        int A = sc.nextInt();
        System.out.println("Enter the common differenec of an AP Series");
        int D = sc.nextInt();
        System.out.println("Enter the N value upto which series should be generated(Till Where)");
        int n8 = sc.nextInt();
        int term = A;
        System.out.print("The Ap series:");
        for(int i = 0; i <= n8; i++){
          System.out.print(term + ",");
          term = term+D;
        }
        break;

        case 9: 
        System.out.println("Enter the satrting value of GP series");
        int A1 = sc.nextInt();
        System.out.println("enter the common ratio of a GP series");
        int R = sc.nextInt();
        System.out.println("Enter the N value upto which series should be generated(Till Where)");
        int n9 = sc.nextInt();
        int term2 = A1;
        System.out.print("The GP series:");
        for(int i=0; i<n9; i++){
          System.out.print(term2 + ",");
          term2 = term2 * R;
        }
        break;
      default:
        break;
    }
    sc.close();
  }
}
