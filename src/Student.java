public class Student extends Person {
  int studentNumber;
  String[] courses;

  @Override
  public String toString() {
    return "Student{" + "studentNumber=" + studentNumber + '}';
  }
}
