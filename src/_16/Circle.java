package _16;

public class Circle extends Shape{

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    int round() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
