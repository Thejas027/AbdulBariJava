package LambdaExpression;

// simple program to show that how a method can be accessed as reference

interface MyLambda {
    public void display(String str);
}

public class LambdaExp4 {
    public void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.err.println(sb);
    }

    public LambdaExp4(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        // MyLambda ml = System.out::println;
        // ml.display("\nsimple program to show that how a method as reference can be
        // done in lambda expression \n");

        // // to call a static method
        // MyLambda m = LambdaExp4::reverse;
        // m.display("Hello");

        // // if the function is not a static consider here reverse method is not a
        // static
        // LambdaExp4 ld = new LambdaExp4();
        // MyLambda ml = ld::reverse;
        // ml.display("Hello");

        // if constructor is defined as shown
        // output --> any string value passed will be converted to upper case
        MyLambda ml = LambdaExp4::new;
        ml.display("Hello");
    }
}
