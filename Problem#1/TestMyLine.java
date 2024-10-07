



public class TestMyLine {
    public static void main(String[] args) {
        MyPoint P1 = new MyPoint(); //Test constructor
        System.out.println();
        System.out.println("The coordinates of point P1 are: " + (P1)); //Print Coordinates of P1 using toString
        System.out.println();
        
        P1.setX(3); //Test getters
        P1.setY(4);
        System.out.println("The x-cordinate of Point P1 is: " + P1.getX());
        System.out.println("The y-cordinate of Point P1 is: " + P1.getY());
        System.out.println("The cordinates of Point P1 are: (" + P1.getX() + "," + P1.getY() + ")");
        System.out.println();

        MyPoint P2 = new MyPoint(-9, -1); //Test another constructor
        System.out.println("The coordinates of point P2 are: " + P2);
        System.out.println();

        //Testing the overload methods distance()
        System.out.println("The distance between two points is: " + P2.distance(P1) + " units"); 
        System.out.println("The distance between two points is: " + P1.distance(P2) + " units"); 
        System.out.println("The distance between two points is: " + P2.distance(0, -9) + " units");
        System.out.println("The distance between two points is: " + P1.distance() + " units");
        System.out.println();
        
        //Printing line using toString()
        MyLine L1 = new MyLine(P1, P2);
        System.out.println("Line L1: " + L1);
        MyLine L2 = new MyLine(0, 3, 3, 3);
        System.out.println("Line L2: " + L2);
        MyLine L3 = new MyLine(1, 5, 1, 0);
        System.out.println("Line L3: " + L3);
        System.out.println();

        // Calculating length of line
        System.out.println("Length of the line L1: " + L1.getLength() + " units");
        System.out.println("Length of the line L2: " + L2.getLength() + " units");
        System.out.println("Length of the line L3: " + L3.getLength() + " units");
        System.out.println();

        // Calculating gradient of line
        System.out.println("The gradient of the line L1: " + L1.getGradient() + " units");
        System.out.println("The gradient of the line L2: " + L2.getGradient() + " units");
        System.out.println("The gradient of the line L3: " + L3.getGradient() + " units");
    }
}
