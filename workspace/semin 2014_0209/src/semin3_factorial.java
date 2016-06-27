import java.util.Scanner;
public class semin3_factorial {
	public static void main(String args[])
	{
		int A; int B; double C=1;
		System.out.print("Enter your number here: ");
		Scanner factorialnumberN = new Scanner(System.in);
		A = factorialnumberN.nextInt();

	
		for (B=1; B<A; B++)
		/*for (A=factorialnumberN.nextInt(); A>1; A--)
		 * B=B*A;
		 * 
		 */
		{
			C = C*B;
			
		}
		System.out.println("factorial of your number is: "+C);
	}
}
