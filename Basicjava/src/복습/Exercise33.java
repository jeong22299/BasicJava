package 복습;

import java.util.Scanner;

public class Exercise33 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	 System.out.println("윤년인지를 확일할 연도를 입력하세요: ");
	 int year = scanner.nextInt();
	 
	 
	 if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
		
	System.out.println( year + "년은 윤달이다");
} else {
	System.out.println( year + "년은 윤달이 아니다");
}

}
}
/*
 * String year1 = ((year % 4 == 0 && year % 100 !=0) ? "년은 윤달이다" : (year % 400
 * ==0) ? "년은 윤달이다" : "년은 윤달이 아니다");
 */
