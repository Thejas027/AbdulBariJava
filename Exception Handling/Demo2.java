// parogarm for checked and unchecked excepation 

class lowBalanceException extends Exception {
  public String toString() {
    return "Low balance to withdraw an amount min of 5000 to be maintained";
  }
}



public class Demo2 {
    static void fun1() {
    try{
      throw new lowBalanceException();
    } 
    catch(Exception e){
      System.out.println(e);
    }
  }

  static void fun2(){
    fun1();
  }
  static void fun3(){
    fun2();
  }
  public static void main(String[] args) {
fun3();
  }
}
