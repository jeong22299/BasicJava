package chapter06.package1;

public class Plane {
	private String manufature;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	Plane(){
		numberOfPlanes++;
	}
	Plane(String manufature, String model, int maxNumberOfPassengers){
		this();
		this.manufature = manufature;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	public String getManufature() {
		return manufature;
	}
	public void setManufature(String manufature) {
		this.manufature = manufature;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers<0) {
			maxNumberOfPassengers = 0;
		}
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

}	

