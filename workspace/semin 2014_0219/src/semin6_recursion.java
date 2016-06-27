import java.util.Scanner;
public class semin6_recursion 
{
	public static void main(String args[])
	{
		Scanner factorial = new Scanner(System.in);
		int x = factorial.nextInt();
		System.out.println(theo(x));
	}
	
	static int theo(int x)
	{
		System.out.println(x);
		if(x <= 1)
		{
			return 1;
		}
		
		return theo(x-1)*x;
	}
}
