package chapter08.Exercise;


public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	 @Override
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String toString() {
		//return "도형의 종류 : 원, 둘레: "+ perimeter()  + "cm, 넓이: " + area() + "cm²";
		return String.format("도형의 종류: 원, 둘레: %-5.2f cm, 넓이: %-5.2fcm²", perimeter(), area());

	}
	
	
}
