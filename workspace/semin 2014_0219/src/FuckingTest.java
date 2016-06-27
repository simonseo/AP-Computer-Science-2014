
public class FuckingTest 
{
	public static void main(String args[])
	{
		System.out.println("1"+new Integer(2)+3);
		System.out.println(1+2+"3");
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
				
			}
			for(int j=10; j>i; j--)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}
