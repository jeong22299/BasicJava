package chapter01;

public class loop01 {

	public static void main(String[] args) {
		int[] jumsu = {85,90,70,75,100,95,95,80,75,85};
		//jumsu의 평균을 구해보자(while)
		
		int i = 0;
		int sum = 0;
		while(i < jumsu.length) {
			sum = sum + jumsu[i];
			i++;
		}
		System.out.println(sum / jumsu.length);
		
		
	}

}
