package 복습;

import java.util.Scanner;

public class Exercise44444444 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String cheolsu = scanner.nextLine();
		System.out.print("영희: ");
		String yeonghui = scanner.nextLine();
		String result = "";

		if (cheolsu.equals(yeonghui)) {
			result = "비김";

		} else if ((cheolsu.equals("가위") && yeonghui.equals("보"))
				|| (cheolsu.equals("바위") && yeonghui.equals("가위"))
				|| (cheolsu.equals("보") && yeonghui.equals("바위"))) {
			result = "결과 : 철수 승리!";
		} else {
			result = "결과 : 영희 승리!";
		}
		System.out.println(result);
	}
}
