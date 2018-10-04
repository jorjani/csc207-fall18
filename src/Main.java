import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Person Mike = new Student("Mike", "Jordan", "456");
    Person Dave = new Staff("Mike", "Jordan", "456");
    List<Person> people = new ArrayList<Person>();
    // List<Student> students = new ArrayList<>();
    people.add(Mike);
    people.add(Dave);
    for (Person p : people) {
      p.goToLecture();
    }
  }
}
