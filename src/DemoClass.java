import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class DemoClass {
  public static void main(String[] args) {
    //You can run this method to see how two iterators on the same collection are independent from each other
    //runDoubleIteration();

    runIntIterator();
  }

  private static void runIntIterator() {
    Iterator<Integer> it1 = new IntIterator(0, 2);
    try {
      System.out.println(it1.next());
      System.out.println(it1.next());
      System.out.println(it1.next());
      // You can comment out the next line to see the other scenario when no exception happens
      System.out.println(it1.next());
      System.out.println("We are here!!!!");
    } catch (NoSuchElementException e2) {
      System.out.println("Called it more than we should");
    } catch (Exception e) {

    } finally {
      System.out.println("We are here finally");
    }
  }

  public static void runDoubleIteration() {
    List<Integer> integerList = new ArrayList<Integer>();
    integerList.add(0);
    integerList.add(1);
    integerList.add(2);
    Iterator<Integer> iter1 = integerList.iterator();
    Iterator<Integer> iter2 = integerList.iterator();
    System.out.println(iter1.next());
    System.out.println(iter2.next());
    System.out.println(iter1.next());
    System.out.println(iter1.next());
  }
}
