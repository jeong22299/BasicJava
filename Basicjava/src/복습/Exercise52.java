package 복습;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		/*
		 * 로또번호를 생성하는 프로그램을 작성하시오. (로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를
		 * 출력한다.)
		 */
		Random random = new Random();
		int[] nembers = new int[45];
		for (int i = 0; i < nembers.length; i++) {
			nembers[i] = i + 1;
		}
		for (int i = 0; i < nembers.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = nembers[i];
			nembers[i] = nembers[ranNum];
			nembers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(nembers[i] + " ");

		}
	}
}
