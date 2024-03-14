class Super{
public void display(){
  System.out.println("super class display");
}
}
class Sub extends Super {
@Override
  public void display(){
System.out.println("sub class Display");
}

}
public class OverRidinning {
  
  public static void main(String[] args) {



    // Super sup = new Super();
    // sup.display();
    
    
    
    Sub sb = new Sub();
    sb.display();



    Super su = new Sub();  // here reference is super and the object created is sub clasS HERE ALWAYS SUB <OBJECT> METHODS ARE CALLED AND THE REFERENCE METHODS ARE OVERWRITTENS
    su.display();
  }
}
