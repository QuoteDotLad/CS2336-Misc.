import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		// Initialize variables
		int year, days;
		String month;
		char firstLetter;
		Scanner scan = new Scanner(System.in);

		// Input number year
		System.out.print("Enter a year : ");
		year = scan.nextInt();
		
		// If negative number entered for year
		if (year < 0) 
		{
			System.out.print("Error, year can not be a negative number.");
			System.exit(0);
		}

		// Enter month
		System.out.print("Enter the first three letters in a month, with the first letter capitalized : ");
		month = scan.next();
		
		// Getting the first letter for checking if it is upper case
		firstLetter = month.charAt(0);
		
		if (Character.isUpperCase(firstLetter) == false) // checking for upper case
		{
			System.out.print("Error, first letter was not capitalized.");
			System.exit(0);
		}
		if (month.length() != 3) // Checking if they put too many or too few letters in for the month
		{
			System.out.println("Error, the month input was not the first three letters of the month.");
			System.exit(0);
		}

		// Closing scanner
		scan.close();
		
		days = 0;

		switch (month) {
		case "Feb": //If February checks for leap year
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
				break;
			}
			days = 28;
			break;

		case "Apr": //For months that have 30 days
		case "Jun":
		case "Sep":
		case "Nov":
			days = 30;
			break;

		case "Jan": //For months that have 31 days
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			days = 31;
			break;

		default: //If a nonexistant month was entered
			System.out.println("Invalid month was entered.");
			System.exit(0);

		}

		System.out.println(month + " " + year + " has " + days + " days");
	}
}
