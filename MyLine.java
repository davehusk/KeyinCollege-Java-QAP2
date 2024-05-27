// MyLine.java
// This class models a line with a begin point and an end point.

public class MyLine {
    private MyPoint begin;  // The begin point of the line.
    private MyPoint end;    // The end point of the line.

    // Constructor to initialize the line with begin and end points.
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor to initialize the line with coordinates of begin and end points.
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getter for the begin point.
    public MyPoint getBegin() {
        return begin;
    }

    // Setter for the begin point.
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter for the end point.
    public MyPoint getEnd() {
        return end;
    }

    // Setter for the end point.
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Calculates the length of the line.
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }

    // Returns a string representation of the line.
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
