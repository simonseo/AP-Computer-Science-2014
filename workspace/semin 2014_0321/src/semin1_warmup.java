import java.util.Scanner;
public class semin1_warmup 
{
	public static void main(String args[])
	{
		Scanner semin1 = new Scanner(System.in);
		System.out.println("�뾵�� �뾵�� �뾵�� ���� ���α׷��� (1)���� ������ �Է��ϸ� (2)10���� ������ ���Ƿ� ������ (3)��ü ���·� �����ϰ� \n�뾵�� �뾵�� �뾵�� ��(4)�� ���� String���� �ٲ��ִ� ���α׷��Դϴ�. \n�뾵�� �뾵�� �뾵�� ���� �Ŀ� (5)String�� �ڸ����� �Է��ϸ� (6)�� �ڸ����� ���ڸ� ����մϴ�.\n");
		System.out.println("(1)���� ������ �Է��Ͻʽÿ�.");
		int x = semin1.nextInt();
		int y = semin1.nextInt(); 
		
		Integer x1 = new Integer(seminclass.seminmethod(x, y));
		Integer x2 = new Integer(seminclass.seminmethod(x, y));
		Integer x3 = new Integer(seminclass.seminmethod(x, y));
		Integer x4 = new Integer(seminclass.seminmethod(x, y));
		Integer x5 = new Integer(seminclass.seminmethod(x, y));
		Integer x6 = new Integer(seminclass.seminmethod(x, y));
		Integer x7 = new Integer(seminclass.seminmethod(x, y));
		Integer x8 = new Integer(seminclass.seminmethod(x, y));
		Integer x9 = new Integer(seminclass.seminmethod(x, y));
		Integer x10 = new Integer(seminclass.seminmethod(x, y));
		System.out.println("(2)10���� ������ ��ü ���·� �����Ǿ����ϴ�.");
		System.out.println("(3)10���� ������ ��ü ���·� ����Ǿ����ϴ�.");
		String a = ""+ x1.toString()+" "+x2.toString()+" "+x3.toString()+" "+x4.toString()+" "+x5.toString()+" "+x6.toString()+" "+x7.toString()+" "+x8.toString()+" "+x9.toString()+" "+x10.toString();
		System.out.println("(4)1���� String���� ����Ǿ����ϴ�:");
		System.out.println("1  2  3  4  5  6  7  8  9  10");
		System.out.println(a);
		System.out.println("(5)�� ��° ���� ����ұ��?");
		int z = semin1.nextInt();
		String b = a.substring(3*(z-1), 3*(z-1)+2);
		System.out.println(z+"��° ���� '"+b+"'�Դϴ�.");
	}
}

class seminclass
{
	static int seminmethod(int a1, int a2)
	{
		int a = (int)(Math.random()*(a2-a1+1) +a1);
				
		return a;
	}
}