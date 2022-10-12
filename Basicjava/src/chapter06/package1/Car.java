package chapter06.package1;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;
	
	Car(){		
	}
	Car(String color){
		this.color= color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public boolean speedUp(double speed) {
		if(this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
			return false;
		}this.speed += speed;
		return true;
	}
	@Override
	public String toString() {
		return "Car [자동차속력=" + speed + ", 색상=" + color +"]";
	}
	
}

