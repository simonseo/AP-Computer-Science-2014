//입금 함수, 출금 함수, 잔고 확인 함수
import java.util.Scanner;
public class semin5_bank 
{
	static int x=500;
	public static void main(String args[])
	{
		System.out.println("무엇을 하시겠습니까");
		System.out.println("1 입금");
		System.out.println("2 출금");
		System.out.println("3 잔고 확인");
		Scanner bank = new Scanner(System.in);
		int a = bank.nextInt();
		int b;
		
		switch (a)
		{
		case 1:
			System.out.println("입금 얼마?");
			b = bank.nextInt();
			in(b);
			break;
			
		case 2:
			System.out.println("출금 얼마?");
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
		System.out.println(y+"원을 입금, 잔고는 "+x+"원입니다.");
	}
	public static void out(int y)
	{
		x= x-y;
		System.out.println(y+"원을 출금, 잔고는 "+x+"원입니다.");
	}
	public static void check()
	{
		System.out.println("잔고는 "+x+"원입니다.");
	}
}
