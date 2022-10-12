package chapter06;

public class Member {

	String name;
	String id;
	String password;
	int age;
	/* 기본생성자(Default Constructor)
	 * Member(){
	 * }
	 * 매개값(매개변수)이 있는 생성자
	 * Member(String name, int age){
	 */
	//this : 메모리에 위치한 객체 자신을 가리킨다.
	/*
	 * this.name = name;
	 * this.age = age;}
	 */
	Member(){
	}
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	
	
	
}
