/*
 * method �ȿ��� ����� ������ local variable�̶�� �θ���, local variable�� ������ ��ĥ �� �ִ� ������ field��� �θ���.
 * method()��ȣ �ȿ� ���� ������ parameter, �Ű� ����.
 * void �ڸ����� �ڷ����� �� �� ���� (int double boolean ��) = output
 */

import java.util.Scanner;
public class semin4_��Ģ���� 
{
	static Scanner theo;
	
	public static void main(String args[])
	{
		theo = new Scanner(System.in);
		int x = theo.nextInt();
		int y = theo.nextInt();
		int a = theo(x, y);
		System.out.println(a);
	}
	
	public static int theo(int x, int y)
	{
		System.out.println(x+" + "+y+" = "+(x+y));
		System.out.println(x+" - "+y+" = "+(x-y));
		System.out.println(x+" * "+y+" = "+(x*y));
		System.out.println(x+" / "+y+" = "+(x/y));
		int z = (int)x*x*x*y;
		return z;
	}
}
