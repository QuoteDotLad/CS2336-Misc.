import java.util.Scanner;
public class Pivot 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int len;
		System.out.print("Please enter list : ");
		len = scan.nextInt(); //Finding array length
		while(len < 0) //If negative length entered
		{
			System.out.println("Error; length can not be negative, please try again : ");
			len = scan.nextInt();
		}
		int[] list = new int[len];
		for(int i = 0; i < list.length; i++) //Reads in array
		{
			list[i] = scan.nextInt();
		}
		
		scan.close(); //Closing scanner
		
		partition(list); //Calling function
		
		System.out.println("After the partition, the list is : "); //Print out array
		for(int k = 0; k < list.length; k++)
		{
			System.out.print(list[k] + " ");
		}
	}
	public static int partition(int[] list)
	{
		int pivot = list[0]; //Pivot is first number after removing length number from array
		int i = 0; //First index
		int j = list.length-1; //Last index
		while(i < j) //While the numbers haven't reached same index
		{
			if(list[i+1] < pivot) //Swap the pivot and the next item
			{
				list[i] = list[i+1];
				list[i+1] = pivot;
				i++;
			}
			else //Moves a number to the end of the array
			{
				int temp = list[j];
				list[j] = list[i+1];
				list[i+1] = temp;
				j--;
			}
		}
		
		return 0;
	}
}
