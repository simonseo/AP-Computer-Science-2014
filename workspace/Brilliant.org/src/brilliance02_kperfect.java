import java.util.Scanner;
public class brilliance02_kperfect 
{
	public static void main(String args[])
	{
		double a=900000000, b, d;
		Scanner scan = new Scanner(System.in);
		d = scan.nextDouble();
		while (true)
		{
			System.out.println(a);
			a+=30240;
			System.out.println(a);
			double c=0;
			for (b=1; b<=a; b+=1)
			{
				System.out.println("a="+a);
				if (a%b==0) c+=b;
				System.out.println("c="+c);
			}
			if (c/a==d) 
				{
				System.out.println(a);
				break;
				}
		}
		
	}
}
