package chapter06;

public class MemberClass {
	public static void main(String[] args) {
		
		Member member = new Member();
		member.name = "최하얀";
		member.age = 23;
	//-> 간단 Member member = new Member("최하얀", 23);	
		
		Member user1 = new Member("홍길동", "hong");
		System.out.println(user1.id);
	}
}
