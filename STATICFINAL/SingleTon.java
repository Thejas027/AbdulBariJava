// package STATICFINAL;

// class coffeMachine{
//   private float CoffeQnt;
//   private float waterQnt;
//   private float SugarQnt;
//   private float MilkQnt;

//   static private coffeMachine my=null;

//   private coffeMachine(){
//     CoffeQnt =1;
//     waterQnt=1;
//     SugarQnt=1;
//     MilkQnt=1;
//   }

//   public void fillWater(float qnty){
//     waterQnt = qnty;
//   }
// public void fillSugar(float qnty){
//   SugarQnt = qnty;
// }
// public float getCoffee(){
//   return 0.23f;
// }
// static coffeMachine getInstance(){
//   if(my == null)
//     my = new coffeMachine();
//     return my;
  
// }
// }

// public class SingleTon {

//   public static void main(String[] args) {
// coffeMachine m1 = coffeMachine.getInstance();
// coffeMachine m2 = coffeMachine.getInstance();
// coffeMachine m3 = coffeMachine.getInstance();

// System.out.println(m1 + "   "+ m2 + "   " + m3);
// if(m1==m2 && m1 == m3){
//   System.out.println("same");
// }
//   }
// }
