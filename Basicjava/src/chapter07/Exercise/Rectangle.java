package chapter07.Exercise;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	public double preimeter() {
		return (2*width) + (2*height);
	}

	
	public String toString() {
		return "도형의 종류 : 사각형, 둘레: "+ preimeter()  + "cm, 넓이: " + area() + "cm²";
	}
	

}
