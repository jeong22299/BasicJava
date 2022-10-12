package chapter08.Exercise;


public class Rectangle extends Shape  {
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	public double area() {
		return width * height;
	}
	public double preimeter() {
		return (2*width) + (2*height);
	}

	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public String toString() {
		//return "도형의 종류 : 사각형, 둘레: "+ preimeter()  + "cm, 넓이: " + area() + "cm²";
		return String.format("도형의 종류: 사각형, 둘레: %-5.2f cm, 넓이: %-5.2f cm²", perimeter(), area());

	}


	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
