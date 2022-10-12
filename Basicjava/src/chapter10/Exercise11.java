package chapter10;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			try {
				System.out.print("어떤 수를 나누겠습니까>>");
				String num1 = scanner.next();
				System.out.print("어떤 수로 나누겠습니까>>");
				String num2 = scanner.next();
			// 	'a b'가 입력되었을때
//				 next() : 공백 또는 a 
			//	nextLine() : 엔터만 - a b
 				int value1 = Integer.parseInt(num1);
				int value2 = Integer.parseInt(num2);
			//	int num1 = Integer.parseInt(scanner.nextLine())
				int result = value1 / value2;

				System.out.printf("%d / %d = %d\n", value1, value2, result);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				//scanner.next(); 입력된 문자열이 계속 나올 시 
			}
		}
		scanner.close();
	}
}