package chapter08.Exercise;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int lateDays) {
		return lateDays * 200;
	}

}
