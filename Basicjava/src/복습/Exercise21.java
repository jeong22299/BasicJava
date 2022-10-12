package 복습;

import java.util.Scanner;

public class Exercise21 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	float width;
	float height;
	float area;
	float perimeter;
	//입력
	System.out.print("가로의 길이는?(단위: m): ");
	width = scanner.nextFloat();
	System.out.print("세로의 길이는?(단위: m): ");
	height = scanner.nextFloat();
	// Float 말고 double 쓰는것이 좋음
	
	//처리
	area= width * height;
	perimeter = (width * 2) + (height * 2);
	//double area = width * height;
	//double preimeter = (width + heihtr)*2;
	
	//출력
	System.out.println("직사각형의 넓이: " + area);
	System.out.println("직사각형의 둘레: " + perimeter);
	
 
	
	
}
}
