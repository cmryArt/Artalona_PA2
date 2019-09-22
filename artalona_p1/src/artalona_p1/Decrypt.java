package artalona_p1;
import java.util.Scanner;

public class Decrypt {

	public static void process(){
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		//read a four-digit integer entered by the user
		int digit = scnr.nextInt();
		int first,second,third,fourth,x;
		fourth = digit % 10;
		third = (digit % 100) / 10;
		second = (digit % 1000) / 100;
		first = (digit / 1000);
		

		third = (third + 3) % 10;
		fourth = (fourth + 3) % 10;
		
		first = (first + 3) % 10;
		second = (second + 3) % 10;
		

		System.out.println(first + "" + second + "" + third + "" + fourth);

		
		
		
	}

}
