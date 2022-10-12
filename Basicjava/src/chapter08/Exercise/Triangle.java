package chapter08.Exercise;


public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		super();
		this.side = side;
	}

	
	public double area() {
		
		return Math.sqrt(3) * 0.5 * side;
	}

	public double perimeter() {
		return  side * 3;
	}

	public String toString() {
		//return "도형의 종류: 삼각형, 둘레:" + perimeter() + 
			//	"cm, 넓이:" + area() + "cm²" ;
		return String.format("도형의 종류: 삼각형, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());

	}


	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}
	
	
	

}
