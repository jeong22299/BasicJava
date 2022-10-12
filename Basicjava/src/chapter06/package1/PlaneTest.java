package chapter06.package1;

public class PlaneTest {
	public static void main(String[] args) {
		Plane plene1 = new Plane("보잉", "보잉 747", 450);
		System.out.println("제조사: "+ plene1.getManufature());
		System.out.println("모델명: "+ plene1.getModel());
		System.out.println("최대 승객수: "+ plene1.getMaxNumberOfPassengers());
		System.out.println();
	
		Plane plene2 = new Plane("보잉", "보잉 777", 500);
		System.out.println("제조사: "+ plene2.getManufature());
		System.out.println("모델명: "+ plene2.getModel());
		System.out.println("최대 승객수: "+ plene2.getMaxNumberOfPassengers());
		System.out.println();
	
		Plane plene3 = new Plane();
		plene3.setManufature("록히드 마틴");
		plene3.setModel("F-22");
		plene3.setMaxNumberOfPassengers(-10);
	
		System.out.println("제조사: "+ plene3.getManufature());
		System.out.println("모델명: "+ plene3.getModel());
		System.out.println("최대 승객수: "+ plene3.getMaxNumberOfPassengers());
		System.out.println();	
	
		System.out.println("생산된 비행기의 수: " + Plane.getNumberOfPlanes());

	
	}
}
