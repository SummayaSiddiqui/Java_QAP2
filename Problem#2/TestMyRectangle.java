public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(4, 1);

        // Create a MyRectangle object
        System.out.println();
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Print the rectangle information
        System.out.println(rectangle);

        System.out.println();
        // Calculate and print area and perimeter
        System.out.println("Area of the Rectangle: " + rectangle.getArea() + " sq. units");
        System.out.println("Perimeter of the Rectangle : " + rectangle.getPerimeter() + " units");
        System.out.println();
    }

}
