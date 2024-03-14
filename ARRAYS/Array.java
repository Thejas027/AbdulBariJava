import java.util.*;

public class Array {

  public static void main(String[] args) {
    // int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
    int A[] = { 1, 2, 3, 4, 5 };
    Scanner sc = new Scanner(System.in);
    int n = A.length;
    System.out.println("enter your choice");
    System.out.println("1. SUM OF AN ARRAY");
    System.out.println("2.SEARCHIMG AN ELE IN ARRAY");
    System.out.println("3.FINDING AN MAX ELE IN  ARRAY");
    System.out.println("4.FINDING 2ND LARGEST ELE IN  ARRAY");
    System.out.println("5.LEFT ROTATION OF AN ARRAY");
    System.out.println("6.RIGHT ROTATION OF AN ARRAY");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        int sum = 0;
        for (int i = 0; i < n; i++) {
          sum += A[i];
        }
        System.out.println("The sum of an array:" + sum);
        break;

      case 2:
        System.out.println("enter the key ele to be searched in array");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
          if (key == A[i]) {
            System.out.println("The ele found at: " + i);
          }

        }
        System.out.println("not found");
        break;

      case 3:
        int max = 0;
        for (int i = 0; i < n; i++) {
          if (max < A[i]) {
            max = A[i];
          }
        }
        System.out.println("The max ele in array :" + max);
        break;

      case 4:

        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n - i - 1; j++) {
            if (A[j] > A[j + 1]) {

              int temp = A[j];
              A[j] = A[j + 1];
              A[j + 1] = temp;
            }
          }
        }
        System.out.println("\nThe 2nd largest element is: " + A[n - 2]);
        break;

      case 5:
        System.out.print("The orginal Array :");
        for (int x : A) {
          System.out.print(x + " ");
        }
        System.out.println(" ");
        int temp = A[0];
        for (int i = 1; i < n; i++) {
          A[i - 1] = A[i];
        }
        A[n - 1] = temp;

        System.out.print("The array elements after left rotation :");
        for (int x : A) {
          System.out.print(x + " ");
        }
        break;

      case 6:
        System.out.print("The orginal array :");
        for (int x : A) {
          System.out.print(x + " ");
        }
        int temp2 = A[n - 1];
        for (int i = n - 1; i > 0; i--) {
          A[i] = A[i - 1];
        }
        System.out.println(" ");
        A[0] = temp2;
        System.out.print("The array elements after Right rotation :");
        for (int x : A) {
          System.out.print(x + " ");
        }
        break;

      default:
        break;
    }
    sc.close();
 }
}
