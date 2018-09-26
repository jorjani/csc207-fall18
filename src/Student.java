public class Student extends Person {
  int studentNumber;
  String[] courses;
  double gpa = 4;
  @Override
  public String toString() {
    return "Student{" + "studentNumber=" + studentNumber + '}';
  }
}
