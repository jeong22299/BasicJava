package chapter08;

import java.util.Arrays;

public class StudentSortExample {
	public static void main(String[] args) {
		Student[] students = {
				new Student("이승연", 20),
				new Student("김연수", 21),
				new Student("허지현", 23),
				new Student("이준혁", 15),
				new Student("김강산", 40),
				new Student("윤다영", 53),
				new Student("성민정", 26),
				new Student("이동민", 6),
				new Student("박종환", 28),
				new Student("길선주", 77),
		};
		
		Arrays.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
}
