
public class semin1 
{
	public static void main(String args[])
	{
		for (int i=1; i<11; i++)
		{
			for (int j=1; j<i+1; j++)
			{
				System.out.print(" ");
			}
		
			for (int j=1; j<11-i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
