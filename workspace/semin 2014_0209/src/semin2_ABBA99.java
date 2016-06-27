
public class semin2_ABBA99 {
	public static void main(String args[])
	{
		double A; double B;
		System.out.println("All possible solutions are:");
		for (A=1; A<1000; A++)
		{
			for (B=1; B<1000; B++)
			{
				if (10*(A+B)+A+B==715)
				{
					System.out.println("A="+A+", B="+B);
				}
			}
		}
	}
}
