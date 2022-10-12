package 복습;

public class Exercise22 {
public static void main(String[] args) {
	
	double distance = 40e12;
	double speed = 300000;
	
	double time = distance / speed / 60 / 60 / 24 / 365;
	//300초 => 5분
	//60*60*24*365(초,분,일,년)
	
	System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time +"광년이다." );
			
	
	

}
}
