import java.util.Scanner;

public class CheckSSN {
	public static void main(String[] args)
	{
		//Initialize variables
		Scanner scan = new Scanner(System.in);
		String SSNumber;
		
		//Get Input
		System.out.print("Enter a SSN in XXX-XX-XXXX format : ");
		SSNumber = scan.nextLine();
		
		//Close Scanner
		scan.close();
		
		//Checking the number to see if it is valid or not
			   if (SSNumber.length() != 11) //If length isn't exactly 11 it is invalid
			   {
			    System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(0))) //Checking index 0 of the string
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(1))) //Checking index 1 of the string
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(2))) //Checking index 2 of the string
			   {
						System.out.println(SSNumber + " is an invalid social security number");
			   }	   
			   else if(SSNumber.charAt(3) != '-'||SSNumber.charAt(6) != '-') //Checking the assumed locations of the hyphens if the SSN is valid
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(4))) //Checking index 4 of the string
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(5))) //Checking index 5 of the string
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(7))) //Checking index 7 of the string
			   {
						System.out.println(SSNumber + " is an invalid social security number");
			   }	   
			   else if(!Character.isDigit(SSNumber.charAt(8))) //Checking index 8 of the string
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(9))) //Checking index 9 of the string
			   {
					   System.out.println(SSNumber + " is an invalid social security number");
			   }
			   else if(!Character.isDigit(SSNumber.charAt(10))) //Checking index 10 of the string
			   {
						System.out.println(SSNumber + " is an invalid social security number");
			   }	   
			   else //If it does not meet any of the above requirements the number is valid, as it is in proper format
			   {
				    System.out.println(SSNumber + " is a valid social security number");
			   }
	}
}
