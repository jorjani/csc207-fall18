import java.util.Arrays;
import java.util.Objects;

public class Person {
  String[] name;
  String SIN;
  String utorId;
  String employeeID;
  String coursesTeaching;

  public Person() {
    this.name = new String[] {"Michel", "Jordan"};
    this.SIN = "TBD";
  }

  public Person(String firstName, String lastName, String SIN) {
        this.name = new String[]{firstName,lastName};
        this.SIN = SIN;
    }

    /**
   * @param firstName is the new first name
   * @param lastName is the new last name
   * @param id is the SIN of the person
   */
  public String getId() {
    return SIN;
  }

  public void setId(String id) {
    this.SIN = id;
  }

  public String[] getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" + "name=" + Arrays.toString(name) + ", SIN='" + SIN + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return Arrays.equals(name, person.name) && SIN == person.SIN;
  }

  @Override
  public int hashCode() {

    int result = Objects.hash(SIN);
    result = 31 * result + Arrays.hashCode(name);
    return result;
  }
}
