package _10;

public class Triangle {
	double width;
	double height;
	
	/*기본 생성자*/
	public Triangle() {
	}
	/*매개 변수가 있는 생성자*/
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/*넓이 구하는 메소드*/
	public double getArea() {
		return width*height/2;
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
