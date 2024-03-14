

// package STATICFINAL;

import java.util.*;

class Student {
  private String rollNo;
  private static int count = 1;

  private String assignRollNO() {
    Date d = new Date();
    String rno = "Univ-" + (d.getTime() + 1900) + "-" + count;
    count++;
    return rno;

  }

  Student() {
    rollNo = assignRollNO();
  }

  public String getRollNO() {
    return rollNo;
  }
}

public class StaticSec {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    System.out.println(s1.getRollNO());
    System.out.println(s2.getRollNO());
    System.out.println(s3.getRollNO());
  }
}
