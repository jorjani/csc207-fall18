public class Main {
  public static void main(String[] args) {
    Person Mike = new Person("Mike", "Jordan", "456");
    Person Mike2 = new Person("Mike", "Jordan", "456");
    String[] people = new String[] {"Joe"};
    System.out.println(Mike.equals(Mike2));
  }
}
