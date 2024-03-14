package CONSTRUCTORS;

class Subject {
  private String subId;
  private String name;
  private int maxMarks;
  private int obtnMarks;

  public String getSubId() {
    return subId;
  }

  public String getName() {
    return name;
  }

  public int getMaxMarks() {
    return maxMarks;
  }

  public int getObtnMarks() {
    return obtnMarks;
  }

  public void setMaxMarks(int mm) {
    maxMarks = mm;
  }

  public void setObtnMarks(int om) {
    obtnMarks = om;
  }

  public Subject(String subId, String name, int maxMarks) {
    this.subId = subId;
    this.name = name;
    this.maxMarks = maxMarks;

  }

  boolean isQualified() {
    return obtnMarks >= maxMarks / 10 * 4;
  }

  public String toString() {
    return "\nSubjectId:" + subId + "\nName:" + name + "\nMarks Obtained:" + maxMarks;
  }
}

class Student {
  private int roll;
  private String name;
  private String dept;
  private int sub[];

  public int getRoll() {
    return roll;
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public int getsub() {
    return sub[3];
  }

  public void setsub(int m1, int m2, int m3) {
    sub[0] = m1;
    sub[1] = m2;
    sub[2] = m3;
  }

  public Student(int roll, String name, String dept, int sub[]) {
    this.roll = roll;
    this.name = name;
    this.dept = dept;

    this.sub = new int[3];
    if (sub != null && sub.length >= 3) {
      this.sub[0] = sub[0];
      this.sub[1] = sub[1];
      this.sub[2] = sub[2];
    }
  }

  public String toString() {
    return "\nRoll-No:" + roll + "\nStudent-Name:" + name + "\nDepartment:" + dept
        + "\nsub Marks" + (sub != null ? " " + sub[0] + " " + sub[1] + " " + sub[2] : "");

  }
}

public class Constructor4 {
  public static void main(String[] args) {
    Subject subj[] = new Subject[3];
    subj[0] = new Subject("S101", "DS", 100);
    subj[1] = new Subject("S102", "Algorithms", 100);
    subj[2] = new Subject("S103", "OS", 100);

    for (Subject s : subj) {
      System.out.println(s);
    }

    Student stu[] = new Student[3];
    stu[0] = new Student(12, "qwerty", "cs", new int[]{20, 30, 40});
    stu[1] = new Student(13, "abxc", "is", new int[]{30, 40, 50});
    stu[2] = new Student(14, "zxcv", "ec", new int[]{40, 50, 60});


    for (Student s : stu) {
      System.out.println(s);
    }

  }
}
