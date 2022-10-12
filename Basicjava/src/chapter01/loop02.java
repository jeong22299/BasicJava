package chapter01;

public class loop02 {

	public static void main(String[] args) {
		//과목 : kor, eng
		int [][] jumsuArr= { 
				{90,80},{95,75},{100, 90},{95,85}
				,{80,100}
		};
		//while문을 사용하여 다음과 같이 출력해보자
		//kor의 평균 : 90
		//eng의 평균 : 90
		int i = 0;
		int j = 0;
		int sum1 = 0;
		int sum2 = 0;
		while(i< jumsuArr.length) {
			sum1 = sum1 + jumsuArr[i][0];
			sum2 = sum2 + jumsuArr[0][i];
			i++;		
			
		}
		System.out.println("kor의 평균 : " + sum1);
		System.out.println("eng의 평균 : " + sum2);
		
	}

}
