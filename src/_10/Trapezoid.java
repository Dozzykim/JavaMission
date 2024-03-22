package _10;

public class Trapezoid {
	double top;
	double bottom;
	double height;
	
	/*기본 생성자*/
	public Trapezoid() {
	}
	/*매개 변수가 있는 생성자*/
	public Trapezoid(double top, double bottom, double height ) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	/*넓이 구하는 메소드*/
	public double getArea() {
		return (top + bottom) * height / 2 ;
	}
	
	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}
	
}
