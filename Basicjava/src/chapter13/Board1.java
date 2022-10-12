package chapter13;

import java.util.Objects;

public class Board1 {
	
	private String subject;
	private String content;
	private String writer;
	public Board1(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(content, subject, writer);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board1 other = (Board1) obj;
		return Objects.equals(content, other.content) && Objects.equals(subject, other.subject)
				&& Objects.equals(writer, other.writer);
	}


	@Override
	public String toString() {
		return String.format("%s\t%s\t%s" , subject, content , writer) ;
	}
}