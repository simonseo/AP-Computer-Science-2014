import java.util.Scanner;

public class semin4_updown {
	public static void main(String args[])
	{
		int A; int X;
		int x = (int)(1+Math.random()*98);
		
		Scanner updown = new Scanner(System.in); 
		
		while (true)
		{
			A = updown.nextInt();
			if (A>x)
			{
				System.out.println("Down");
			}
			else if (A<x)
			{
				System.out.println("Up");
			}
			else if (A==x)
			{
				System.out.println("You're right!");
				break;
			}
		
		}
	}
}
