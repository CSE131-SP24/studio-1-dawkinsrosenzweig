package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input value for x");
		int x = in.nextInt();
		System.out.println("input value for y");
		int y = in.nextInt();
		System.out.println("input value for z");
		int z = in.nextInt();
		boolean isinorder = (x<y)&&(y<z);
		System.out.print(isinorder);
	}

}
