package _16;

public class Triangle extends Shape{

    double width;
    double height;

    public Triangle() {
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        return "Triangle [width=" + width + ", height=" + height + "]";
    }
    
}
