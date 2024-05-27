// TestMyRectangle.java
// This class tests the MyRectangle class and its methods.

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create points for testing.
        MyPoint p1 = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint(5, 7);

        // Create a rectangle using the points.
        MyRectangle rectangle = new MyRectangle(p1, p2);

        // Print the rectangle and its area.
        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}
