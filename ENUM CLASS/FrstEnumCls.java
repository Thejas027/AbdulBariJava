
enum Dept {
  CS("Jhon", "Block A"), ECE("David", "Block B"), IS("RAM", "Block C");

  String name;
  String location;

  private Dept(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

}

public class FrstEnumCls {

  public static void main(String[] args) {
    Dept d = Dept.ECE;
    System.out.println(d.getName());
    System.out.println(d.getLocation());
  }
}