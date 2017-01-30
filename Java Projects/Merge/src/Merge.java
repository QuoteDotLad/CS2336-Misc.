import java.util.Scanner;
import java.util.Arrays;
public class Merge 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int len1, len2;
		
		System.out.print("Please enter List 1 : ");
		len1 = scan.nextInt(); //Gets length of list1, as it is the first value entered
		while(len1 < 0) //If value entered is negative
		{
			System.out.println("Error; length can not be negative, please try again : ");
			len1 = scan.nextInt();
		}
		int[] list1 = new int[len1]; //Creates the array with len1 range
		for(int i = 0; i < list1.length; i++) //Sets the rest of the input to proper index in the array
		{
			list1[i] = scan.nextInt();
		}
		
		System.out.print("Please enter List 2 : ");
		len2 = scan.nextInt(); //Gets length of list2 from first value entered
		while(len2 < 0)
		{
			System.out.println("Error; length can not be negative, please try again : "); //Error catching again
			len2 = scan.nextInt();
		}
		int[] list2 = new int[len2]; //Creates new array
		for(int j = 0; j < list2.length; j++) //Sets each value of array again
		{
			list2[j] = scan.nextInt();
		}
		scan.close(); //Closing scanner
		int[] list3 = merge(list1, list2);
		Arrays.sort(list3); //Sorts list3 using the java.util.Arrays method
		System.out.println("Sorted merged list : " + Arrays.toString(list3)); //Displays list3 after sorting
		
	}


	public static int[] merge(int[] list1, int[] list2)
	{
	int[] list3 = new int[list1.length + list2.length]; //Create array of size of both passed arrays
	int x = 0, y = 0; //Positioning integers for first two arrays
	for(int k = 0; k < list1.length; k++) //Running from 0 to list1's length
	{
		list3[k] = list1[x]; //Setting 0 to list1.length of list3 to the equivalent values in list1
		x++;
	}
	for(int l = list1.length; l < list3.length; l++) //Running through remaining size of list3
	{
		list3[l] = list2[y]; //Setting the remaining values of list3 equivalent to every value of list2
		y++;
	}
	return list3; //Send list3 to main method where the function was called
	}
}
