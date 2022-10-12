package chapter05;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0; //최소값
		int min = 1; //최대값
		int[] array = { 1, 5, 3, 8, 2 };
		
		// 작성위치

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
		}	
		}			
		/*for (int g = 0 ; g < array.length; g++){
			if (min > array[g]) {
				min = array[g];*/
			
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}	
}
