import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		int year, startDay, numDays;
		numDays = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		year = scan.nextInt();
		while(year < 0)
		{
			System.out.println("Error, year can not be negative. Please try again : ");
			year = scan.nextInt();
		}
		System.out.print("Enter the first day of the year: ");
		startDay = scan.nextInt();
		while(startDay < 0 || startDay > 7)
		{
			System.out.println("Error, start day can not be less than 1 or greater than 7. Please try again : ");
			startDay = scan.nextInt();
		}
		scan.close();
		
		for (int month = 1; month <= 12; month++) 
		{
			System.out.print("          "); //Formatting
			switch (month) 
			{
			case 1: //Decides month and also if leap year or not for February
				System.out.println("January " + year);
				numDays = 31;
				break;
			case 2:
				System.out.println("February " + year);
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
				{
					numDays = 29;
				} 
				else 
				{
					numDays = 28;
				}
				break;
			case 3:
				System.out.println("March " + year);
				numDays = 31;
				break;
			case 4:
				System.out.println("April " + year);
				numDays = 30;
				break;
			case 5:
				System.out.println("May " + year);
				numDays = 31;
				break;
			case 6:
				System.out.println("June " + year);
				numDays = 30;
				break;
			case 7:
				System.out.println("July " + year);
				numDays = 31;
				break;
			case 8:
				System.out.println("August " + year);
				numDays = 31;
				break;
			case 9:
				System.out.println("September " + year);
				numDays = 30;
				break;
			case 10:
				System.out.println("October " + year);
				numDays = 31;
				break;
			case 11:
				System.out.println("November " + year);
				numDays = 30;
				break;
			case 12:
				System.out.println("December " + year);
				numDays = 31;
			}
			System.out.println("-----------------------------"); //More formatting and printing the calendars
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

			for (int i = 0; i < startDay; i++) 
			{
				System.out.print("    "); //Spaces until the first day of the month
			}
			for (int i = 1; i <= numDays; i++) 
			{
				if (i < 10) 
				{
					System.out.print("   " + i);
				} 
				else 
				{
					System.out.print("  " + i);
				}
				if ((i + startDay) % 7 == 0) 
				{
					System.out.println();
				}
			}
			System.out.println("");

			startDay = (startDay + numDays) % 7;
		}
	}
}
