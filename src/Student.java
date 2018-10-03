public class Student extends Person implements SystemUser {
  int studentNumber;
  String[] courses;
  double gpa = 4;

  public Student(String firstName, String lastName, String SIN) {
    this.SIN = SIN;
    this.name = new String[] {firstName, lastName};
  }

  @Override
  public void goToLecture() {
    System.out.println("Damn! Again?!");
  }

  @Override
  public String toString() {
    return "Student{" + "studentNumber=" + studentNumber + '}';
  }

  @Override
  public void checkBalance() {}
}
