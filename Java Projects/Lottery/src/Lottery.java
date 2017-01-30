import java.util.Scanner;
public class Lottery 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int rem3, rem2, rem1; //For splitting up the lottery number into three separate numbers, the 100s, 10s, and 1s places of the lottery number
		int num3, num2, num1; //For splitting up the guess into three separate numbers, the 100s, 10s, and 1s places of the lottery number
		int lottoNum = (int)(Math.random()*(999 - 100) + 100); //Creates the 3 digit lottery number from 100 to 999
		int guess; //The guess the user will input
		
	      rem3 = lottoNum / 100;      //Gives the hundreds spot of the lottery number
	      rem2 = (lottoNum % 100)/10; //Gives the tens spot of the lottery number
	      rem1 = lottoNum % 10;       //Gives the ones spot of the lottery number
	     
	      System.out.print("Please enter your three digit number : ");
	      guess = input.nextInt();
	      
	      //Closing input
	      input.close();
	      
	      num3 = guess / 100;      //Gives the hundreds spot of the guess
	      num2 = (guess % 100)/10; //Gives the tens spot of the guess
	      num1 = guess % 10;       //Gives the ones spot of the guess
	      
	      System.out.println("Lottery number : " + lottoNum); 
	      System.out.println("Your number : " + guess); 
	      
	      if(guess == lottoNum) //If exact match in exact order
	      {
	    	  System.out.println("You have an exact match! Your award is $10,000!");
	      }
	      else if(((num1 == rem1) || (num1 == rem2) || (num1 == rem3)) && //If all matching numbers but in the incorrect order
	              ((num2 == rem1) || (num2 == rem2) || (num2 == rem3)) &&
	              ((num3 == rem1) || (num3 == rem2) || (num3 == rem3)))
	      {
	    	  System.out.println("All of your digits match! Your award is $3,000!");
	      }
	      else if (num1 == rem1 || num1 == rem2 || num1 == rem3 || //If at least one matching number
	    		   num2 == rem1 || num2 == rem2 || num2 == rem3 ||
	    		   num3 == rem1 || num3 == rem2 || num3 == rem3)
	      {
	    	  System.out.println("You have a matching digit! Your award is $1,000!");
	      }
	      else //If no matching numbers
	      {
	    	  System.out.println("There were no matching digits! Better luck next time!");
	      }
	}
}
