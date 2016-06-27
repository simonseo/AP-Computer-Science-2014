import java.util.Scanner;
public class semin1_Á¦°ö 
{
	public static void main(String args[])
	{
		Scanner theo = new Scanner(System.in);
		while (true)
		{
		int b = theo.nextInt();
		int a = theo(b);
		System.out.println(a);
		}
	}
	
	static int theo(int x)
	{
		int y = x*x;
		return y;
	}
}
