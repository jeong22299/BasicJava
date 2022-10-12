package 복습;

public class Apple {
	private int no;
	private Color color;
	public Apple(int no, Color color) {
		super();
		this.no = no;
		this.color = color;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("%d, %s" , no, color) ;
	}
	
}
enum Color{
	RED, GREEN, YELLOW
}