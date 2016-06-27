import java.util.Scanner;
public class semin6_sigma {
	public static void main(String args[])
	{
		Scanner sigma = new Scanner(System.in);
		System.out.println("¢²(i^2+1,i,1,n)");
		int n = sigma.nextInt();
		int i;
		int A = 0;
		
		for (i=1; i<=n; i++)
		{
			A = A + i*i*i+3;
		}
		
		System.out.println(A);
	}
}
