import java.util.Scanner;
public class semin1_warmup 
{
	public static void main(String args[])
	{
		Scanner semin1 = new Scanner(System.in);
		System.out.println("노쓸모 노쓸모 노쓸모 │이 프로그램은 (1)정수 범위를 입력하면 (2)10개의 정수를 임의로 생성해 (3)객체 형태로 저장하고 \n노쓸모 노쓸모 노쓸모 │(4)한 개의 String으로 바꿔주는 프로그램입니다. \n노쓸모 노쓸모 노쓸모 │그 후에 (5)String의 자릿수를 입력하면 (6)그 자릿수의 숫자를 출력합니다.\n");
		System.out.println("(1)정수 범위를 입력하십시오.");
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
		System.out.println("(2)10개의 정수가 객체 형태로 생성되었습니다.");
		System.out.println("(3)10개의 정수가 객체 형태로 저장되었습니다.");
		String a = ""+ x1.toString()+" "+x2.toString()+" "+x3.toString()+" "+x4.toString()+" "+x5.toString()+" "+x6.toString()+" "+x7.toString()+" "+x8.toString()+" "+x9.toString()+" "+x10.toString();
		System.out.println("(4)1개의 String으로 저장되었습니다:");
		System.out.println("1  2  3  4  5  6  7  8  9  10");
		System.out.println(a);
		System.out.println("(5)몇 번째 수를 출력할까요?");
		int z = semin1.nextInt();
		String b = a.substring(3*(z-1), 3*(z-1)+2);
		System.out.println(z+"번째 수는 '"+b+"'입니다.");
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