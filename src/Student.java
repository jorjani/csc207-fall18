public class Student extends Person {
  int studentNumber;
  String[] courses;

  public Student(String[] name, int studentNumber) {}

  @Override
  public String toString() {
    return "Student{" + "studentNumber=" + studentNumber + '}';
  }
}
