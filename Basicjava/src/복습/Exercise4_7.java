package 복습;

import java.util.Scanner;

public class Exercise4_7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; //잔고, 잔액
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.print("선택>");

			//int num1 = Integer.parseInt(scanner.nextLine());
			int num1 = scanner.nextInt();
			
			switch (num1) {
			case 1:
				System.out.print("예금액> ");
				//balance += Integer.parseInt(scanner.nextLine());
			  balance += scanner.nextInt();
				break;

			case 2:
				System.out.print("출금액> ");
				//balance -= Integer.parseInt(scanner.nextLine());
			  balance -= scanner.nextInt();
				break;

			case 3:
				//System.out.print("잔고> "); 
				//System.out.println(balance);
				System.out.print("잔고>" + balance); 
				break;
			case 4:
				run = false;
				break;

			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
