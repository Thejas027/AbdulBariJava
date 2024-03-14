import java.util.Scanner;

public class MatrixMulti {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of 2-D array");
  int n = sc.nextInt();
  int a[][] = new int[n][n];
  int b[] [] = new int [n][n];
  int c[] [] = new int[n][n];


  // INPUT FOR 1ST MATRIX
  System.out.println("ENETER THE ELEMENTS FOR MATRIX a");
  for(int i=0; i<a.length; i++){
  for(int j=0; j<a[0].length; j++){
      a[i][j] = sc.nextInt();
  }
  }


  // INPUT FOR 2ND MATRIX
  System.out.println("ENTER THE ELEMNTS FOR MATRIX b");
    for(int i=0; i<b.length; i++){
  for(int j=0; j<b[0].length; j++){
      b[i][j] = sc.nextInt();
  }
  }


  
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
      c[i][j] = 0;
      for(int k=0; k<n; k++){
        c[i][j] = c[i][j] +  a[i][k] * b[k][j];
      }
    }
  }


System.out.println("The matrix elements after multiplication:");
for(int x[]: c){
for(int y:x){
  System.out.print(y + " ");
}
System.out.println("");
}
  sc.close();
  }
}
