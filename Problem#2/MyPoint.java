public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }

    public double distance(int x, int y) {
    int xTerm = (this.x - x);
    int yTerm = (this.y - y);
    return Math.sqrt(Math.pow(xTerm, 2) + Math.pow(yTerm, 2));  // Correct formula
}

    public double distance(MyPoint object) {
        int xTerm = (this.x - object.x);
        int yTerm = this.y - object.y;
        return Math.sqrt(Math.pow(xTerm, 2) + Math.pow(yTerm, 2));
    }

    public double distance() {
        int xTerm = (this.x - x);
        int yTerm = this.y - y;
        return Math.sqrt(Math.pow(xTerm, 2) + Math.pow(yTerm, 2));
    }
    
}
