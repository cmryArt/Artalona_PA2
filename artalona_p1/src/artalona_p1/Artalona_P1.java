package artalona_p1;
import java.util.Scanner;


public class Artalona_P1 {

	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		 System.out.println("Enter 1 for encrypt, 2 for decrypt");
		 int userInput = scnr.nextInt();
		 
		 if (userInput == 1)
		 {
			Encrypt.process();
		 }else
		 {	
			Decrypt.process();
		 }
	}
	}


