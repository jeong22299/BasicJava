package chapter06.package1;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	public Time() {
	}

	public Time(int hour, int minute, int second) {
		if(hour>0 &&hour<24) {
		this.hour = hour;
		}
		if(minute>0 && minute<59) {
			this.minute = minute;
		}
		if(second>0 &&second<59) {
			this.second = second;
		}

	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
	
}
