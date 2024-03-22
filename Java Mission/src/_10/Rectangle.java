package _10;

public class Rectangle {
	double width;
	double height;
	
	/*기본 생성자*/
	public Rectangle() {
	}
	/*매개 변수가 있는 생성자*/
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/*넓이 구하는 메소드*/
	public double getArea() {
		return width*height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
