package chapter03;

public class IncreaseDecreaseExample {
public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z;
	
	System.out.println("________");
	x++;
	++x;
	System.out.println("x=" + x);
	
	System.out.println("________");
	y--;
	--y;
	System.out.println("y=" + y);
	
	System.out.println("________");
	z = x++;
	System.out.println("z=" + z);
	System.out.println("x=" + x);
	
	System.out.println("________");
	z = ++x;
	System.out.println("z=" + z);
	System.out.println("x=" + x);
	
	System.out.println("________");
	
	z = ++x + y++;
	System.out.println("z=" + z);
	System.out.println("x=" + x);
	System.out.println("y=" + y);
	
	
}
}
