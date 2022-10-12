package 복습;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int t1 = scanner.nextInt();
		
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int t2 = scanner.nextInt();
		
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int t3 = scanner.nextInt();
		
		if (t1 + t2 <= t3) {
			System.out.println("삼각형을 만들 수 없습니다.");
		}else if(t1 + t3 <= t2){
			System.out.println("삼각형을 만들 수 없습니다.");
		}else if(t2+ t3 <= t1) {
			System.out.println("삼각형을 만들 수 없습니다.");
	// if(t1 + t2 <=t3 && t2 + t3<= t1 && t1 + t3 <= t2)
		}else {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
	}
}
