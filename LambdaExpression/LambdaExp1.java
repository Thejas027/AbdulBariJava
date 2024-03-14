package LambdaExpression;

// simple program to show how a lambda expression can be written 
@FunctionalInterface

interface MyLambda {
    public void display();
}

public class LambdaExp1 {
    public static void main(String[] args) {
        MyLambda m = () -> {
            System.out.println("Demo for lambda expression");
        };
        m.display();
    }
}
