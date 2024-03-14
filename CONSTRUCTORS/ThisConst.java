package CONSTRUCTORS;

// class Rect{
//   int length;
//   int breadth;
  
//   public Rect(int length,int breadth){
//     this.length = length;
//     this.breadth = breadth;
//   }

//   void Display(){
//     System.out.println("lenght is:"+this.length);
//     System.out.println("Breadth is:"+this.breadth);
//   }
// }

// public class ThisConst {
//  public static void main(String args[]){
//   Rect r = new Rect(10,20);
//   r.Display();

//  } 
// }


// //USE OF super 

class Rect{
  int length;
  int breadth;
  int x =   10;

  public Rect (int length , int breadth){
    this.length = length;
    this.breadth = breadth;

  }
}

class Cub extends Rect{
  int height ;
  int x =20;

  public Cub(int length,int breadth,int height){
    super(length,breadth);
    this.height = height;
  }

  public void Display(){
    System.out.println(super.x);
    System.out.println(x);
  }
}


public class ThisConst{
  public static void main(String args[]){
    Cub c = new Cub(10,20,30);
    c.Display();
  }
}