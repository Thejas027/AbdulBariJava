public class nestedTry {
  public static void main(String [] args){
    int A[] = {10,20,30,40,0};
    try {
      int c = A[1]/A[0];
      System.out.println(c);
        try{
          System.out.println(A[10]);
        } catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
        }  
        System.out.println("HII");
    } catch(ArithmeticException e){
      System.out.println(e);
    }
  System.out.println("Bye");
  }
}
