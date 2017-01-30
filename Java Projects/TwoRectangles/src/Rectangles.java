import java.util.Scanner;
public class Rectangles 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x1,y1,h1,w1, //center, height, and width of both squares
			x2,y2,h2,w2,
			distanceX, distanceY;
		boolean R2insideR1, R2overlapsR1, R1insideR2;
		
		//R1s Data
		System.out.print("Enter Rectangle 1's center x coordinate, center y coordinate, width, and height : ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();	
		h1 = input.nextDouble();
		w1 = input.nextDouble();
		
		//R2s Data
		System.out.print("Enter Rectangle 2's center x coordinate, center y coordinate, width, and height : ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		h2 = input.nextDouble();
		w2 = input.nextDouble();
		
		//Closing input
		input.close();
		
		//If x1 is >= x2, then the distance between the Xs will be x1 - x2
		//Else, distance between the Xs will be x2 - x1, ensuring a positive distance
		distanceX = x1 >= x2 ? x1 - x2 : x2 - x1;
		
		//If y1 is >= y2, then the distance between the Ys will be y1 - y2
		//Else, distance between the Ys will be y2 - y1, ensuring a positive distance
		distanceY = y1 >= y2 ? y1 - y2 : y2 - y1; 
		
		//Calculating situation of rectangles
		R2insideR1 = (distanceX <= (w1-w2)/2 && distanceY <= (h1-h2)/2);
		R2overlapsR1 = (distanceX <= (w1+w2)/2 && distanceY <= (h1+h2)/2);
		
		//Output
		if(R2insideR1)
		{
			System.out.println("R2 is inside R1");
		}
		else if(R2overlapsR1)
		{
			System.out.println("R2 overlaps R1");
		}
		else
		{
			System.out.println("R2 does not overlap R1");
		}
	}
}
