package _16;

public abstract class Shape {

    Point point;

    abstract double area();
    abstract int round();


    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }

    
    
}
