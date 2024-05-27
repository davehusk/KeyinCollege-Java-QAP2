// TestMyLine.java
// This class tests the MyLine class and its methods.

public class TestMyLine {
    public static void main(String[] args) {
        // Create points for testing.
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create a line using the points.
        MyLine line1 = new MyLine(p1, p2);

        // Print the line and its length.
        System.out.println(line1);
        System.out.println("Length of line1: " + line1.getLength());

        // Create another line using coordinates.
        MyLine line2 = new MyLine(3, 5, 7, 8);

        // Print the second line and its length.
        System.out.println(line2);
        System.out.println("Length of line2: " + line2.getLength());
    }
}
