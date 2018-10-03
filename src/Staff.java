public class Staff extends Person {
  public Staff(String firstName, String lastName, String SIN) {
    this.SIN = SIN;
    this.name = new String[] {firstName, lastName};
  }

  @Override
  public void goToLecture() {
    System.out.println("Noooo! Again?! I can't take this much fun!");
  }
}
