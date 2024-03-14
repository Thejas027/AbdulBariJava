import java.util.Scanner;

public class Array2 {

  public static void main(String[] args) {
    // int arr[] = new int[10];
    // arr[0] = 5;
    // arr[1] = 15;
    // arr[2] = 35;
    // arr[3] = 45;
    // arr[4] = 65;
    // arr[5] = 75;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size");
    int n = sc.nextInt();
    int arr[] = new int[n];

    System.out.println("enter the array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // int index = 2;
    // int x = 25;
    System.out.println("enter the index value to be inserted");
    int index = sc.nextInt();
    System.out.println("enter the value to be inserted in index");
    int x = sc.nextInt();

    for (int i = n - 1; i > index; i--) {
      arr[i] = arr[i - 1];

    }
    arr[index] = x;
    System.out.print("the array elements after insertion :");
    for (int Q : arr) {
      System.out.print(Q + " ");
    }
    sc.close();
  }
}