import java.util.Scanner;

public class qudratic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the values of a,b,c");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
    double D =( b * b )- (4 * a * c);

    if(D > 0){
      double root1 =  (-b + Math.sqrt(D))/(2*a);
       double root2 =  (-b - Math.sqrt(D))/(2*a);
       System.out.println("roots are real and distinct");
       System.out.println("root1:"+root1);
       System.out.println("root2:"+root2);
    }
    else if(D == 0){
     double root = (b*b)/(2*a);
     System.out.println("roots are real and equal");
      System.out.println("root1:"+root);
      System.out.println("root2:"+root);
    } else{
      double realPart =  (b*b)/(2*a);
      double imgPart = Math.sqrt(-D);
      System.out.println("roots are imaginary");
      System.out.println("root:"+realPart+"+i"+imgPart);
    }
    sc.close();;
  }
}