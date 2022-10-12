package chapter01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int sum = 0;

		while (true) {
			System.out.println("====================");
			System.out.println("Lotto 프로그램");
			System.out.println("1. Lotto 구입");
			System.out.println("2. 프로그램 종료");
			System.out.println("====================");
			System.out.print("메뉴선택 : ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Lotto 구입 시작\n(1000원에 로또번호 하나입니다.)");
				System.out.print("금액입력 : ");
				int pay = scanner.nextInt();
				System.out.println("행운의 로또번호는 아래와 같습니다.");
				Set<Integer> rndLotto = new HashSet<Integer>();
				int num = pay / 1000;
				int cnt = 0;
				for (int i = 0; i < num; i++) {
					cnt++;
					rndLotto.clear();
					while (rndLotto.size() < 6) {
						int ran = random.nextInt(45);
						rndLotto.add(ran);
					}
					System.out.println("로또번호" + cnt + " : " + rndLotto);
				}
				System.out.println("받은금액은 " + pay + "이고 거스름돈은 " + pay % 1000 + "원입니다.");
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
