import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoClass {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<Integer>();
    integerList.add(0);
    integerList.add(1);
    integerList.add(2);
    Iterator<Integer> it1 = integerList.iterator();
    // Method 1
    for (int i = 0; i < integerList.size(); i++) {
      System.out.println(integerList.get(i));
    }

    for (Integer i : integerList) {
      System.out.println(i);
    }

    while (it1.hasNext()) {
      System.out.println(it1.next());
    }
  }
}
