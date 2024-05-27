// MyPoint.java
// This class models a point with x and y coordinates.

public class MyPoint {
    private int x;
    private int y;

    // Constructor to initialize the point with x and y coordinates.
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate.
    public int getX() {
        return x;
    }

    // Setter for x coordinate.
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y coordinate.
    public int getY() {
        return y;
    }

    // Setter for y coordinate.
    public void setY(int y) {
        this.y = y;
    }

    // Returns a string representation of the point.
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
