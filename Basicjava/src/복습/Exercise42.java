package 복습;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1: 
			//case 1 : case 12: case 2: 함께 사용 가능
			System.out.println(num + "월은 겨울입니다.");
			break;
			
		case 2: 
			System.out.println(num + "월은 겨울입니다.");
			break;
			
		case 3: 
			System.out.println(num + "월은 봄입니다.");
			break;
			
		case 4: 
			System.out.println(num + "월은 봄입니다.");
			break;
			
		case 5: 
			System.out.println(num + "월은 봄입니다.");
			break;
			
		case 6: 
			System.out.println(num + "월은 여름입니다.");
			break;
			
		case 7: 
			System.out.println(num + "월은 여름입니다.");
			break;			
			
		case 8: 
			System.out.println(num + "월은 여름입니다.");
			break;
					
		case 9: 
			System.out.println(num + "월은 가을입니다.");
			break;
			
		case 10: 
			System.out.println(num + "월은 가을입니다.");
			break;
			
		case 11: 
			System.out.println(num + "월은 가을입니다.");
			break;
			
		case 12: 
			System.out.println(num + "월은 겨울입니다.");
			break;
		default :
			System.out.println(num + "월은 잘못된 입력입니다.");
			break;

		}
	}
}
