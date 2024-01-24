package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args)

			{
		Scanner in = new Scanner(System.in);
		System.out.println("the first of two integers will be averaged?");
		int n1 = in.nextInt();
		System.out.println("the second of two integers will be averaged");
		int n2 = in.nextInt();
		double avg = (n1+n2)/2.0 ;
		System.out.println("The average is: "+ avg);
		
		
		// TODO Auto-generated method stub

	}

}
