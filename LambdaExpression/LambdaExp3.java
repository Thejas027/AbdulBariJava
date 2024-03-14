package LambdaExpression;

// simple program to show that lambda expression can be passed as parameter aslo 
interface MyLambda {
    public void display();
}

class useLambda {
    public void callLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {
    public void method1() {
        useLambda ul = new useLambda();
        ul.callLambda(() -> {
            System.out.println("\nDemo program to show that lambda expression can be passed as parameter\n");
        });
    }
}

public class LambdaExp3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
