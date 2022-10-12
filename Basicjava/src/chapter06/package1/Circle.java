package chapter06.package1;

public class Circle {
	double radius;
	double x;
	double y;
	public Circle() {
		super();
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius < 0 ) {
			radius = 0;
		}
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
}
