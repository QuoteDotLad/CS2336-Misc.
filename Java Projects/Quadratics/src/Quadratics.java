import java.util.Scanner;
public class Quadratics 
{
	public static void main(String[] args) 
	{
		//Creating variables and input, the scanner
		Scanner input = new Scanner(System.in);
		double root1, root2, a, b, c, discriminant;
		
		System.out.print("Please enter the numbers for A, B, C : "); //All inputs
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//Closing input
		input.close();
		
		//Calculating discriminant
		discriminant = (Math.pow(b, 2) - (4*a*c));
		
			if(discriminant > 0) //Positive discriminant, two real roots
			{
				//Calculating the roots
				root1 = (-b + Math.sqrt(discriminant)) / (2*a);
				root2 = (-b - Math.sqrt(discriminant)) / (2*a);
				//Displaying the roots
				System.out.print("The quadratic equation entered has two real roots :\n");
				System.out.println("Root 1 : " + root1 + "\n");
				System.out.println("Root 2 : " + root2 + "\n");
			}
			else if(discriminant < 0) //Negative discriminant, no real roots
			{
				System.out.print("The quadratic equation entered has no real roots.\n");
			}
			else //Zero discriminant, one real root
			{
				root1 = (-b + Math.sqrt(discriminant)) / (2*a);
				System.out.print("The quadratic equation entered has one real root :\n");
				System.out.println("Root 1 : " + root1 + "\n");
			}
		}
}
