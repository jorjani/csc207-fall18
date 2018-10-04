import java.util.Iterator;

public class intIterator implements Iterator {
  int startingPoint;
  int endingPoint;
  int nextint;

  public intIterator(int start, int end) {
    this.startingPoint = start;
    this.endingPoint = end;
    this.nextint = start;
  }

  @Override
  public Object next() {
    // Incorrect and incomplete!!! Need to use exceptions in week5
    int returnValue = -1;
    if (this.hasNext()) {
      returnValue = nextint;
      nextint++;
    }
    return returnValue;
  }

  @Override
  public boolean hasNext() {
    return nextint <= endingPoint;
  }
}
