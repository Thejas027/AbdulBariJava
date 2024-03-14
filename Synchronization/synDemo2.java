class ATM {
  public void checkBalc(String name) {
    System.out.print(name + " checking ");
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.print(" Amount \n");
  }

  public void withDraw(String name, double balc) {
    System.out.print(name + " withdrawing ");
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.print(balc + "\n");
  }
}

class Customer extends Thread {
  ATM atm;
  String name;
  double ammount;

  Customer(String s, ATM a, Double d) {
    name = s;
    atm = a;
    ammount = d;
  }

  public void useATM() {
    synchronized (atm) {
      atm.checkBalc(name);
      atm.withDraw(name, ammount);
    }
  }

  public void run() {
    useATM();
  }
}

public class synDemo2 {
  public static void main(String[] args) {
    ATM atm = new ATM();
    Customer c1 = new Customer("JHON", atm, 100.15);
    Customer c2 = new Customer("SMITH", atm, 300.15);
    c1.start();
    c2.start();
  }
}
