import java.util.Scanner;
public class DayOfWeek 
{
	public static void main(String[] args)
	{
		//Creating variables
		Scanner input = new Scanner(System.in);
		int monthDay, month, year, century, centuryYear;
		String answer = "The day of the week is : "; //Just to clean up the code for the output a bit
		
		//Asking for inputs
		System.out.print("Enter the year : (e.g., 2012) : ");
		year = input.nextInt();
		System.out.print("Enter month : 1-12 : ");
		month = input.nextInt();
		System.out.print("Enter the day of the month : 1-31 : ");
		monthDay = input.nextInt();
			
			//Closing Scanner
			input.close();
		
		//If month is January or February, convert to 13 or 14 for the formula
		if(month < 3)
		{
			month += 12;
			year = year-1;
		}
		
		//Calculating century and year of century
		century = year / 100;
		centuryYear = year % 100;
		
		//Calculating weekday
		 int weekday = (monthDay + 
				 	   (((month + 1) * 26) / 10) + 
				 	   centuryYear + 
				 	   (centuryYear / 4) + 
				 	   (century / 4) +
		               (5 * century)) % 7;
		 
		//Output for the weekday calculated
		if(weekday == 0)
		{
			System.out.println(answer + "Saturday");
		}
		if(weekday == 1)
		{
			System.out.println(answer + "Sunday");
		}
		if(weekday == 2)
		{
			System.out.println(answer + "Monday");
		}
		if(weekday == 3)
		{
			System.out.println(answer + "Tuesday");
		}
		if(weekday == 4)
		{
			System.out.println(answer + "Wednesday");
		}
		if(weekday == 5)
		{
			System.out.println(answer + "Thursday");
		}
		if(weekday == 6)
		{
			System.out.println(answer + "Friday");
		}
	}
}
