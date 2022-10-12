package chapter01;

public class Star01 {
	public static void main(String[] args) {


		int i = 1;
		int j = 1;

		while (i<= 10) {
			while (j <= i) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println("");
			j = 1;
			i = i+1;
		}

	}
}
