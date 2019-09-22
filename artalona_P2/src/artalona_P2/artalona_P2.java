package artalona_P2;
import java.util.Scanner;

public class artalona_P2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int choice;
		double userWeightInLbs, weightInKilograms, userHeight;
		double BMI;
		
		System.out.println("Select which formula to use");
		System.out.println("1 for (703 * weightInPounds) / heightInInches^");
		System.out.println("2 for weightInKilograms / heightInInches^2");
		choice = scnr.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Enter youir height in inches and weight in pounds.");
			userHeight = scnr.nextDouble();
			userWeightInLbs = scnr.nextDouble();
			BMI =  ((703 * userWeightInLbs) / (Math.pow(userHeight, 2)));
			System.out.println("Your BMI is " + BMI);
		}
		else if (choice == 2)
		{
			System.out.println("Enter youir height in meters and weight in kilograms.");
			userHeight = scnr.nextDouble();
			weightInKilograms = scnr.nextDouble();
			BMI =(((weightInKilograms) / ((Math.pow(userHeight, 2)))));
			System.out.print("Your BMI is ");
			System.out.printf("%.1f\n", BMI);

		}
		else
		{
			BMI = 100;
		}
		
		if (BMI < 18.5)
		{
			System.out.println("Underweight");
		}else if (BMI < 25 && BMI > 18.6)
		{
			System.out.println("NormalWeight");
		}else if (BMI < 30 && BMI >= 25)
		{
			System.out.println("Overweight");
		}else
			System.out.println("Obesity");
		
	//Create a BMI calculator that reads the user’s weight and height 
	//(providing an option for the user to select which formula to use)
		//1:) BMI = (703 * weightInPounds) / heightInInches^2
		//2:) BMI = weightInKilograms / heightInInches^2
    //then calculates and displays the user’s body mass index. 
	//Also, display the BMI categories and their values from the National Heart Lung and Blood 
	
	}

}
