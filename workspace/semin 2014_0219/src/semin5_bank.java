//�Ա� �Լ�, ��� �Լ�, �ܰ� Ȯ�� �Լ�
import java.util.Scanner;
public class semin5_bank 
{
	static int x=500;
	public static void main(String args[])
	{
		System.out.println("������ �Ͻðڽ��ϱ�");
		System.out.println("1 �Ա�");
		System.out.println("2 ���");
		System.out.println("3 �ܰ� Ȯ��");
		Scanner bank = new Scanner(System.in);
		int a = bank.nextInt();
		int b;
		
		switch (a)
		{
		case 1:
			System.out.println("�Ա� ��?");
			b = bank.nextInt();
			in(b);
			break;
			
		case 2:
			System.out.println("��� ��?");
			b = bank.nextInt();
			out(b);
			break;
			
		case 3:
			check();
			break;
		}
		
	}
	public static void in(int y)
	{
		x= x+y;
		System.out.println(y+"���� �Ա�, �ܰ�� "+x+"���Դϴ�.");
	}
	public static void out(int y)
	{
		x= x-y;
		System.out.println(y+"���� ���, �ܰ�� "+x+"���Դϴ�.");
	}
	public static void check()
	{
		System.out.println("�ܰ�� "+x+"���Դϴ�.");
	}
}
