package chapter08.Exercise;

import java.util.Objects;

public abstract class Book {
	private int number; // 관리번호
	private String title; //책의제목
	private String author; // 책의저자
	private static int countOfBooks; // 만들어진 Book 객체개수
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		countOfBooks++;
		this.number = this.countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract int getLateFee(int lateDays);
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	/*선생님 버전
	 	public boolean equals(Object obj) {
		 Book book =null;
	 	if (obj instanceof Book){
			book = (Book) obj; 
		}
	 	if(this.author.equals(book.author)
	 			&&this.title.equals(book.title)){
	 		return true;
	 	}else {
	 		return false;
	 	}
	 	}*/
	 
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public String toString() {
		return "관리번호 "+ number + "번, 제목:" + title 
				+ ", 작가:"+ author + "(일주일 연체료:" + getLateFee(7)+ "원)";
	}


}
