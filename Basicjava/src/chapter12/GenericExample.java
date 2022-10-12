package chapter12;

public class GenericExample {
	public static void main(String[] args) {
		/*
		 * Generic(제네릭, 지네릭)
		 * JDK 1.5부터 도입
		 * 표현 방법 : <>을 이용
		 */
		IntValue value = new IntValue(10);
		System.out.println(value.getValue());
		StringValue value2 = new StringValue("10");
		System.out.println(value2.getValue());
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		Value value3 = new Value(10);
		System.out.println(value3.getValue());
		Value value4 = new Value("10");
		System.out.println(value4.getValue());
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		Value value5 = new Value(100);
		String value6 = (String)value5.getValue();
		//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		
		Box<Integer> box = new Box<Integer>(100);
		//box.setValue(100);
		int integer = box.getValue();
		
		
		
	}
}
