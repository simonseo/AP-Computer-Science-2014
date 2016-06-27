
public class PrimeNumber {
	public static void main(String[] args)
	{int i=1;
		while (i<100)
		{int j=1;
		while (j<i)
			{
			if (i%(i-j)==0)
				i++;			
			else
			{
				j++;
			}
			}
		System.out.println(i);
				
		}

}}