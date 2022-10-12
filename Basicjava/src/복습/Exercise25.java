package 복습;

import java.util.Scanner;

public class Exercise25 {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		int sc1, sc2, sc3, sc4, sum;
		System.out.print("500원짜리 동전의 갯수: ");
		sc1 = scanner.nextInt();
		
		System.out.print("100원짜리 동전의 갯수: ");
		sc2 = scanner.nextInt();
		
		System.out.print("50원짜리 동전의 갯수: ");
		sc3 = scanner.nextInt();
		
		System.out.print("10원짜리 동전의 갯수: ");
		sc4 = scanner.nextInt();
		
		sum=(sc1*500)+(sc2*100)+(sc3*50)+(sc4*10);
	
	System.out.println("저금통 안의 동전의 총 액수: "+ sum);
	
	scanner.close();
	
}
		
}
