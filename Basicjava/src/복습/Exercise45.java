package 복습;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = new Random();
		int rm = new Random().nextInt(100) + 1;
		int cnt = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			cnt++;

			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요");
			int t1 = scanner.nextInt();

			if (rm > t1) {
				System.out.println("정답은 더 큰 수 입니다.");
			} else if (rm < t1) {
				System.out.println("정답은 더 작은수 입니다.");

			} else {
				System.out.println("정답입니다.");
				System.out.println(cnt + "번 만에 맞춤.");
				break;
			}
		}
	}
}
