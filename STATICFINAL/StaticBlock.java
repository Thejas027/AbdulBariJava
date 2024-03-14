// // package STATIC METHODS;

// class Test{
//   static{
//     System.out.println("Block-1");  //3rd preference
//   } 
//   static{
//     System.out.println("Block-2");  //4th preference
//   }
// }

// public class StaticBlock {
//   static {
//     System.out.println("Block-3");  //  1st preference
//   }
//   public static void main(String[] args) {
//     Test t = new Test(); 
//     System.out.println("main");   // 5th preference 
//   }
//   static{
//     System.out.println("Block-4"); // 2nd prefence
//   }
// }
