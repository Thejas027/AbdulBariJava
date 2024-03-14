import java.util.Scanner;



public class MatrixAdd {
  
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
  //ADDING TWO MATRIX
  for(int i=0; i<c.length; i++){
    for(int j=0; j<c[0].length; j++){
      c[i][j] = a[i][j] + b[i][j];
    }
  }

  System.out.println("THE SUM OF MATRIX a AND b :");
  for(int i=0; i<a.length; i++){
    for(int j=0; j<a[0].length;j++){
      System.out.print(c[i][j] + " ");
    }
    System.out.println("");
  }
  
sc.close();
}
}
