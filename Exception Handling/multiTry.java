public class multiTry {
  public static void main(String[] args) {
    try {
      int A[] = { 100, 20, 30, 40, 0 };
      try {
        int c = A[0] / A[2];
        System.out.println("the result is : " + c);
      } catch (ArithmeticException a) {
        System.out.println(a);
      }

      System.out.println(A[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    System.out.println("program excuted till the end sucessfully ");
  }
}
