
// class Super{
//   public void meth(){
//     System.out.println("meth1");
//   }
//   public void meth2(){
//     System.out.println("super class meth");
//   }
// }

// class Sub extends Super{
//   public void meth2(){System.out.println("Sub class meth");}

// public void meth3(){System.out.println("meth3");}
// }
// public class DynamicMethod {

//   public static void main(String args[]){
//    // displays only super class methods
//    System.out.println("Gives Super class methods");
//     Super s = new Super();
//     s.meth();
//     s.meth2();
// System.out.println();
// System.out.println("gives sub class methods");
//     // displays only sub class methods
//     Sub s1 = new Sub();
//     s1.meth();
//     s1.meth2();
//     s1.meth3(); 

//     System.out.println();
//     System.out.println("gives dynamic method dispatch methods");
//     Super s3 = new Sub();
//     s3.meth();
//     s3.meth2();

//   }
// }
