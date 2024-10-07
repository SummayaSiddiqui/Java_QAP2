public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint P1, MyPoint P2) {
        this.begin = P1;
        this.end = P2;
    }

    public MyPoint getBegin() {
        return this.begin;
    }

    public void setBegin(MyPoint P1) {
        this.begin = P1;
    }

    public MyPoint getEnd() {
        return this.end;
    }

    public void setEnd(MyPoint P2) {
        this.end = P2;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        int[] a = { this.getBeginX(), this.getBeginY() };
        return a;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int[] getEndXY() {
        int[] a = { this.getEndX(), this.getEndY() };
        return a;
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int y1 = begin.getY();
        int y2 = end.getY();
        int x1 = begin.getX();
        int x2 = end.getX();

        // Calculate differences
        double yDiff = y2 - y1;
        double xDiff = x2 - x1;
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "[P1 = " + begin.toString() + ", P2 = " + end.toString() + "]";
    }
}