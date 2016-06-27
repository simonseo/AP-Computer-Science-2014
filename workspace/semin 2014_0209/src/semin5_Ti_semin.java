import java.util.Scanner;
public class semin5_Ti_semin {
	public static void main(String args[])
	{
		Scanner semin = new Scanner(System.in);
		int A = semin.nextInt();
		String B = semin.next();
		int C = semin.nextInt();
		double D;
				
		/*if (B=="+")
		{
			System.out.println(A+C);
		}
		else if (B=="-")
		{
			System.out.println(A-C);
		}
		else if(B=="*")
		{
			System.out.println(A*C);
		}
		else if(B=="/")
		{
			System.out.println(A/C);
		}*/
		
		if (B.equals("+"))
		{
			D=A+C;
			System.out.println(D);
		}
		else if (B.equals("-"))
		{
			D=A-C;
			System.out.println(D);
		}
		else if(B.equals("*"))
		{
			D=A*C;
			System.out.println(D);
		}
		else if(B.equals("/"))
		{
			D=A/C;
			System.out.println(D);
		}
		else
		{
			System.out.println("fuck");
		}
		
	}
}
