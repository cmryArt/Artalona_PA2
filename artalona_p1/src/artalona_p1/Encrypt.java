package artalona_p1;

import java.util.Scanner;

public class Encrypt {

	public static void process()  {
		Scanner scnr = new Scanner(System.in);
		//read a four-digit integer entered by the user
		int digit = scnr.nextInt();
		int first,second,third,fourth,x;
		fourth = digit % 10;
		third = (digit % 100) / 10;
		second = (digit % 1000) / 100;
		first = (digit / 1000);
		
		//encrypt it as follows:
		
		//Replace each digit with the result of adding 7 to the digit
		//getting the remainder after dividing the new value by 10.
		fourth = (fourth + 7) % 10 ;
		third = (third + 7) % 10 ;
		second = (second + 7) % 10 ;
		first = (first + 7) % 10 ;
		
		System.out.println(first + "" + second + "" + third + "" + fourth);

//		//Then print the encrypted integer.
		}
}

