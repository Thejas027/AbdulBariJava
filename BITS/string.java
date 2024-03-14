
public class string {
  public static void main(String[] args) {
    String str1 = "java program";

    String str2 = new String("JAVA");

    char c[] = {'H','E','l','O'};

    String str3 =new String(c);

    byte b[] = {65,66,67,68};
    String str4 = new String(b);  // output will be A<B<C<D

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);

    // to get particular val

      byte b1[] = {65,66,67,68};
    String str5 = new String(b1,1,2); 

    System.out.println(str5);

  }
}
