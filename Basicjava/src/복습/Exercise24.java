package 복습;

import java.util.Scanner;

public class Exercise24 {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   double radius;
   double high;
   double area;
   double bulk;
   
   System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
   radius = scanner.nextDouble();
   //위에 선언 없이 double radius = scanner.nextDouble();로 입력하면 간단.
   
   System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
   high = scanner.nextDouble();
   
   area = Math.PI * (radius * radius);
   bulk = area * high;
   
   System.out.println("원기둥 밑변의 넓이는 " + area + "cm²이고, 원기둥의 부피는 " + bulk +"cm³이다.");
   scanner. close();
   
		   
   
}	
}
