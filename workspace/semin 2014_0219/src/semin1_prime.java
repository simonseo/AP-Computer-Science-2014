//���ڸ� �Է��ϸ� �� ���ڱ����� ��� �Ҽ��� ���ض�
import java.util.Scanner;
public class semin1_prime 
{
	public static void main(String args[])
	{
		Scanner prime = new Scanner(System.in);
		double n = prime.nextDouble();
		double b; double c;
		for (b=n; b>=2; b--)
		{
			for (c=b-1; c>=1; c--)
			{
				if (b%c==0 && c>=2)
				{
					break;
				}
				else if (b%c==0 && c==1)
				{
					System.out.println(b);
				}
			}
		}
	}
}