package chapter01;

import java.util.Scanner;

public class Confirm202 {
public static void main(String[] args) {
	new Scanner(System.in);
	
	System.out.print("첫번째 수: ");
	String strNum1 = new String();
	System.out.print("두번째 수: ");
	String strNum2 = new String();
	
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);
	int result = num1 + num2;
	
	System.out.println(result);
			
}
}
