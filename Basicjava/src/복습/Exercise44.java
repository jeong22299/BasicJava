package 복습;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String c1 = "바위";
		String c2 = "가위";
		String c3 = "보";
		String p1 = "철수";
		String p2 = "영희";
		System.out.print("철수: ");
		String d1 = scanner.next();
		System.out.print("영희: ");
		String d2 = scanner.next();

		if (d1.equals(c2) && d2.equals(c1)) {
			System.out.println("결과: " + d2 + " 승리!");
		} else if (d1.equals(c1) && d2.equals(c2)) {
			System.out.println("결과: " + p1 + " 승리!");
		} else if (d1.equals(c2) && d2.equals(c3)) {
			System.out.println("결과: " + p1 + " 승리!");
		} else if (d1.equals(c3) && d2.equals(c2)) {
			System.out.println("결과: " + p2 + " 승리!");
		} else if (d1.equals(c1) && d2.equals(c3)) {
			System.out.println("결과: " + p2 + " 승리!");
		} else if (d1.equals(c3) && d2.equals(c1)) {
			System.out.println("결과: " + p1 + " 승리!");
		} else {
			System.out.println("결과: " + "무승부");
		}
	}
}
/*		System.out.print("철수: ");
		String d1 = scanner.next();
		System.out.print("영희: ");
		String d2 = scanner.next();
		if(d1.equals(d2)){
		System.out.println("비김");
		} else if (d1.equals("가위") && d2.equals("보")) ||
		d1.equals("바위") && d2.equals("가위"))||
		d1.equals("보") && d2.equals("바위")){
		System.out.println("철수 승리!");
		} else
		System.out.println("영희 승리!");
		}
*/








