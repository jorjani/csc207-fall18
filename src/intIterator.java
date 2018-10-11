import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntIterator implements Iterator {
  int startingPoint;
  int endingPoint;
  int nextint;

  public IntIterator(int start, int end) {
    this.startingPoint = start;
    this.endingPoint = end;
    this.nextint = start;
  }

  @Override
  public Object next(){
    // Incorrect and incomplete!!! Need to use exceptions in week5
    int returnValue;
    if (!hasNext()) {
      throw new NoSuchElementException("We are at the end of the iterator");
    }
    returnValue = nextint;
    nextint++;
    return returnValue;
  }

  @Override
  public boolean hasNext() {
    return nextint <= endingPoint;
  }
}
