package artalona_P3;
import java.util.Scanner;

public class artalona_P3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String highestTopic = "none";
		String lowestTopic = "none";
		int highest = 0;
		int lowest = 0;
		int i, j, ppl;
		double counter = 0;
		String[] topic = new String[5]; 
		double[] mean = new double[5];
		int[] total = new int[5];
		int[][] rate = new int[5][10];
		topic[0] = "red";
		topic[1] = "green";
		topic[2] = "yellow";
		topic[3] = "blue";
		topic[4] = "black";
		
		
		System.out.println("How many people will be responding?");
		ppl = scnr.nextInt();
		
		//create topic array
		
		
	//for loop that loops for each person
		for (i = 0; i < ppl; i++)
		{
			for (j = 0; j < 5; j++)
			{
			//loops for every topic topic
			System.out.println("Please rate topic " + topic[j] + " from 1-10");
			rate[j][i] = scnr.nextInt();
			counter = rate[j][i];
//			System.out.println("SUM is now " + counter);
//			System.out.println("CHECK: " + rate[j][i]);
			total[j] += counter;
			mean[j] = counter / ppl;
			}
			counter = 0;
			System.out.println("\n\n");
		}
	
		
		lowestTopic = topic[0];
	//check for the highest and lowest
	for (i = 0; i < 5; i++)
	{
		highest = total[0];
		lowest = total[0];
		
		if(total[i] < lowest)
		{
			lowest = total[i];
			lowestTopic = topic[i];
		}
		if(total[i] > highest)
		{
			highest = total[i];
			highestTopic = topic[i];
		}
	}
	
	for (i = 0; i < 5; i++)
	{
		System.out.print(topic[i]);
		for (j = 0; j < 9; j++)
		{

			System.out.print(rate[i][j]);
		}
		System.out.print("\n");
	}
	
	System.out.print("\n");
	System.out.println("Your mean values are ");
	for (i = 0; i < 5; i++)
	{
		System.out.println(topic[i] + " is " + mean[i]);
	}
	
	
	
	
	System.out.println("Your highest total is " + highest + " at " + highestTopic);
	System.out.println("Your lowest total is " + lowest + " at " + lowestTopic);
	
	}

}
