public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method to calculate area
    public int getArea() {
        int length = bottomRight.getX() - topLeft.getX();
        int width = topLeft.getY() - bottomRight.getY();
        return length * width;
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        int length = bottomRight.getX() - topLeft.getX();
        int width = topLeft.getY() - bottomRight.getY();
        return 2 * (length + width);
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}