import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the choice");
    System.out.println("1.Multilpication Table");
    System.out.println("2.Sum of Numbers");
    System.out.println("3.Fcatorial of a Number");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("enter the N value");
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
          System.out.println(N + "X" + i + "=" + N * i);
        }
        break;
      case 2:
        System.out.println("enter the n value");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
          sum = sum + i;
        }
        System.out.println("the sum of n number is " + sum);
        break;
        case 3:  System.out.println("enter the n value to obtain the factorial");
                int n1 = sc.nextInt();
                int fact =1;
                for(int i=1; i<=n1; i++){
                  fact = fact*i;
                } 
                System.out.println("The factorial is " + fact);
                break;
      default:
        break;
    }
    sc.close();
  }
}
