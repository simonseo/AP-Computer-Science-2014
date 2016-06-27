/*
 * method 안에서 선언된 변수는 local variable이라고 부르며, local variable이 영향을 미칠 수 있는 범위를 field라고 부른다.
 * method()괄호 안에 들어가는 변수는 parameter, 매개 변수.
 * void 자리에는 자료형이 들어갈 수 있음 (int double boolean 등) = output
 */

import java.util.Scanner;
public class semin4_사칙연산 
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
