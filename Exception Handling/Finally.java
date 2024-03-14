// public class Finally {
//   public static void main(String[] args) {
//     try{
//     System.out.println(10/0);
//   }
//   catch(Exception e){
//     System.out.println(e);
//   }
//   finally{ // if we are handling the case with try and catch method then finally usage is not requried
//     System.out.println("program ended");  // if try and catch are waritten insted we need to print the message then finally keyword must be written 
//   }
// }
// }


public class Finally {
static void meth1() throws Exception{
 try{ 
  throw new Exception();
} 
finally {
  System.out.println("final message");
}
}
  public static void main(String[] args) throws Exception {
    meth1();
  }
}