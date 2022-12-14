/****************************************************************************************** 
Name: Zhenyu Jiang 
Course: CS170-01 
Lab #: Lab Assignment One (Ch1 - 4)
Submission Date: 10pm, Thu(11/03)
Description:  This class is used to calculate squre and cube base on the user inputs, and results
will be displayed on a table. The user's inputs determine the starting number and ending number. 
*********************************************************************************************/ 
import java.util.*;
public class SqureCube
{
    private int start_num, end_num; 
	 public void printtable(int start, int end) //calculate the squre and cube for the input and display
	 {
	     int squre, cube; 
	     String title,title2,title3;
	     title = "Number"; //setting up the first line of the table
	     title2 = "Squre";
	     title3 = "Cube";
	     System.out.printf("%-10s %-10s %-10s%n",title,title2,title3); //formating the first line
	     //There should be 10 space for each string.
	     for(int i = start; i <= end; i++)
	     {
	         squre = i * i; //n^2
	         cube = i * i * i; //n^3
	         System.out.printf("%-10s %-10s %-10s%n",i,squre,cube);//formating numbers output
	         //Still, 10 spaces for each number
	     }
	 }
	 
	 public void ask()
	 {
	     Scanner one = new Scanner(System.in); //creating a scanner to get users inputs
	     System.out.println("Please enter the staring number and the ending number: ");
	     System.out.println("Starting: ");
	     start_num = one.nextInt(); //getting the starting number
	     System.out.println("Ending: ");
	     end_num = one.nextInt();   //getting the ending number
	     printtable(start_num,end_num); //calling the function.
	 }
}
