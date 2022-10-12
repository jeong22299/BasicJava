package chapter07;

public class HangookTire extends Tire {
	
	public HangookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation< maxRotation) {
			System.out.println(location + "HangookTire 수명:" + (maxRotation- accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HangookTire 펑크 ***");
			return false;
		}
	}
	

}
