import java.util.Scanner;

public class merge {

  public static void mergeArray(int arr1[], int arr2[], int arr3[], int n) {
    int i = 0, j = 0, k = 0;
    while (i < n && j < n) {
      if (arr1[i] < arr2[j]) {
        arr3[k++] = arr1[i++];
      } else {
        arr3[k++] = arr2[j++];
      }
    }
    while (i < n) {
      arr3[k++] = arr1[i++];
    }

    while (j < n) {
      arr3[k++] = arr2[j++];
    }

    for(int p=0; p<2*n-1; p++){
      for(int q=0; q<2*n-p-1; q++){
        if(arr3[q] > arr3[q+1]){
          int temp = arr3[q];
          arr3[q] = arr3[q+1];
          arr3[q+1] = temp;
        }
      }
    }

  }

  public static void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + ",");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n = sc.nextInt();
    int arr1[] = new int[n];
    int arr2[] = new int[n];
    int arr3[] = new int[2 * n];

    System.out.println("Enter the first array elements");
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }

    System.out.println("Enter the second array elements");
    for (int j = 0; j < n; j++) {
      arr2[j] = sc.nextInt();
    }

    mergeArray(arr1, arr2, arr3, n);
    System.out.println("the merged array");
    printArray(arr3, 2 * n);
    sc.close();

  }
}


