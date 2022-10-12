package chapter06;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer()	;
		
		Printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		
		//static이 붙은 필드나 메소드는 바로 직접 사용한다.
		Printer.println('a'); // static 방식
		
		//new를 통해서 static이 붙은 메소드를 호출 할 수도 있다.
		Printer printer3 = new Printer(); // 인스턴트 방식
		
	}
}
