class NeagtiveDimensionException extends Exception{
  public String toString(){
    return "dimension cannot be neagtive";
  }
}

public class Demo3 {

static int area(int l,int b) throws NeagtiveDimensionException{
  if(l < 0 || b < 0){
    throw new NeagtiveDimensionException();
  }
    return l*b;
}

static void meth1() throws NeagtiveDimensionException{
  System.out.println("Area is" + area(-10,5));
}

  public static void main(String[] args) {
  try {
    meth1();
  }
  catch(Exception e)
  {
    System.out.println(e);
  }
 } 
}
