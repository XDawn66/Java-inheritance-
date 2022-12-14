/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment One (Ch1 - 4)
Submission Date: 10pm, Thu(11/03)
Description:  This class is used to convert kg and pounds base on the user inputs, and results
will be displayed in the end. The user can do as many time as they want until they enter n. 
*********************************************************************************************/ 
import java.text.DecimalFormat;
import java.util.*;
public class WeightConvertor
{
	private double result, result2;
	
	public void kilo_convertor(double weight)
	{
		
		result = weight * 2.205; //kg to pound
		result2 = weight / 2.205; // pound to kg
	}
	
	public void ask_and_display()
	{
		Scanner one = new Scanner(System.in); //Creating a scanner to get input
		Boolean run = true; //a starting condition for the while loop
		double data = 0; //the variable to hold the result of string to number  
		String input = ""; //use for holding the user input
		DecimalFormat df = new DecimalFormat(); //create the format tool to only allow 3 decimal showed
		df.setMaximumFractionDigits(3);
		while(run)
		{
			System.out.println("Please enter the weight that you want to convert. Enter n to quit: ");
			input = one.next(); //getting input as a string from the user
			if(input.equals("n")) //if the user input n
			{
				run = false; //loop stops
			}
			else
			{
				data = Double.parseDouble(input); //converting string to double
				kilo_convertor(data); //calling the function
				System.out.println(data + " kilogram = "+ df.format(result)+ " pound");
				System.out.println(data + " pound = " + df.format(result2)+ " kilogram\n");
			}
		}
		System.out.println("Thanks for using.\n");
	}
}