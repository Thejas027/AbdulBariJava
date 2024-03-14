
// // COYPING AN ARRAY ELEMENTS TO NEW ARRAY 
// public class Array3 {

//   public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5,6,7,8,9};
//     int arr1[] = new int[10];
//     int n = arr.length;

//     for(int i=0; i<n ; i++){
//       arr1[i] = arr[i];
//     }
//     System.out.println("The array elements After coyping are");
//     for(int i=0; i<n; i++){
//       System.out.println(arr1[i]);
//     }
//   }
// }

// // REVERSING AND COPYING THE ARRAY ELEMENTS
// public class Array3 {

//   public static void main(String[] args) {
//     int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//     int arr1[] = new int[10];
//     int n = arr.length;

//     // coppying the array into another array
//     for (int i = 0; i < n; i++) {
//       arr1[i] = arr[i];
//     }
//     // PRINTING ARRAY ELEMNTS AFTER COPYING WHERE ARRAY IS REVERSED
//     System.out.print("the array elemnts after reversing: ");
//     for (int i = n - 1; i >= 0; i--) {
//       System.out.print(arr1[i] + ",");
//     }
//   }
// }


// // INCREASING THE SIZE OF AN ARRAY 

public class Array3 {

  public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    int n = a.length;
    System.out.println(n);
    int b[] = new int[ 2 * n];

    for(int i=0; i<n; i++){
      b[i] = a [i];
    }
    System.out.println(b.length);

    System.out.println("The array elements in B");
    for(int x:b){
      System.out.print(x + ",");
    }

  }
}