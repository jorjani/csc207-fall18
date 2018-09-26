public class Student extends Person {
  int studentNumber;
  String[] courses;
  double gpa = 3;

  @Override
  public String toString() {
    return "Student{" + "studentNumber=" + studentNumber + '}';
  }
}
