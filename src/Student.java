public class Student extends Person {
  int studentNumber;
  String[] courses;
  double gpa;

  @Override
  public String toString() {
    return "Student{" + "studentNumber=" + studentNumber + '}';
  }
}
