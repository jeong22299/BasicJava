package chapter01;

public class Hello {
	public static void main(String[] args) {
		System.out.println("안녕, Java!");

		// 구구단 출력

//	 for (int i = 2; i <=9; i++) {
//		System.out.println(i +"단"); 
//	 for(int j = 1; j<=9; j++) {
//		System.out.println(i+"x"+j+"="+i*j);
//	 }
//	 }

		int dan = 2;
		int num = 1;
		while (dan <= 9) {
			System.out.println(dan + "단");

			while (num <= 9) {
				System.out.println(dan + "X" + num + "=" + num * dan);
				num++;
			}
			num = 1;
			dan = dan + 1;
		}
	}
}
