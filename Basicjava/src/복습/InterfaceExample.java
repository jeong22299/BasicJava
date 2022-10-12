package 복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterfaceExample {
	public static void main(String[] args) {
		Arrays.asList(
				new Apple(1, Color.RED), 
				new Apple(2, Color.RED), 
				new Apple(3, Color.GREEN), 
				new Apple(4, Color.YELLOW), 
				new Apple(5, Color.GREEN), 
				new Apple(6, Color.GREEN), 
				new Apple(7, Color.YELLOW), 
				new Apple(8, Color.RED), 
				new Apple(9, Color.RED), 
				new Apple(10, Color.GREEN), 
				new Apple(11, Color.RED)
				
				);
		List<Apple> redApple = new ArrayList<>();
//		for (Apple apple : list) {
//			if(apple.getColor() == color) {
//				redApple.add(apple);
//			}
//			
//		}
	}
}
