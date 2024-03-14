package LambdaExpression;

// simple lambda expression program where parameter is passed 

@FunctionalInterface
interface MyLambda {
    public int add(int a, int b);
}

public class LambdaExp2 {
    public static void main(String[] args) {
        MyLambda m = (int a, int b) -> a + b;
        int result = m.add(10, 20);
        System.out.println(result);
    }
}
