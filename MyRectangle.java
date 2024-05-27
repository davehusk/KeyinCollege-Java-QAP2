// MyRectangle.java
// This class models a rectangle with top-left and bottom-right points.

public class MyRectangle {
    private MyPoint topLeft;      // The top-left corner of the rectangle.
    private MyPoint bottomRight;  // The bottom-right corner of the rectangle.

    // Constructor to initialize the rectangle with top-left and bottom-right points.
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter for the top-left point.
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Setter for the top-left point.
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter for the bottom-right point.
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setter for the bottom-right point.
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Calculates the area of the rectangle.
    public double getArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = bottomRight.getY() - topLeft.getY();
        return width * height;
    }

    // Returns a string representation of the rectangle.
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
