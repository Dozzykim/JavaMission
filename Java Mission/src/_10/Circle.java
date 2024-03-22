package _10;

public class Circle {
	double radius;
	
	/*기본 생성자*/
	public Circle() {
	}
	/*매개 변수가 있는 생성자*/
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/*넓이 구하는 메소드*/
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
