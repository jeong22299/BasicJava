package 복습;

public class Exercise4_5 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) { // 행 개수
			for (int j = 1; j <= i; j++) {//열에서 * 개수 
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}
}
/*		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			 {
				System.out.println();
*/