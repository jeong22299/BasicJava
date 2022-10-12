package 복습;

public class Exercise4_4 {
	public static void main(String[] args) {
		// 4x+5t=60 모든해를 구해서 (x,y) 형태로 출력 단, x와y는 10이하 자연수

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int num1 = 4 * x;
				int num2 = 5 * y;

				if (num1 + num2 == 60) {

					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}