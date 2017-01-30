import java.util.Scanner;
public class LinearEquationDriver
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double a, b, c, d, e, f;
		//Getting inputs
		System.out.print("\nPlease enter the number for A : ");
		a = scan.nextDouble();
		System.out.print("\nPlease enter the number for B : ");
		b = scan.nextDouble();
		System.out.print("\nPlease enter the number for C : ");
		c = scan.nextDouble();
		System.out.print("\nPlease enter the number for D : ");
		d = scan.nextDouble();
		System.out.print("\nPlease enter the number for E : ");
		e = scan.nextDouble();
		System.out.print("\nPlease enter the number for F : ");
		f = scan.nextDouble();
		scan.close();
		LinearEquation L = new LinearEquation(a,b,c,d,e,f); //Creates LinearEquation object with input data
		if(L.isSolvable() == false) //Sees if a-b is 0
		{
			System.out.println("The equation has no solution.");
		}
		else //if a-b is not 0, prints the linear equations
		{
			System.out.println("X = " + L.getX());
			System.out.println("Y = " + L.getY());
		}
	}
}
