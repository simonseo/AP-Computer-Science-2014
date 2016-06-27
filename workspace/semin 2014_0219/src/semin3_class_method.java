import java.util.Scanner;
public class semin3_class_method 
{
	public static void main(String args[])
	{
		Scanner theo = new Scanner(System.in);
		System.out.println("넌 몇 살이니 태오야?");
		int x = theo.nextInt();
		int y = theo.nextInt();
		int z = theo.nextInt();
		theo(x, y, z);
		theo(x, z, y);
	}
	
	//	public static void theo(마법상자 입구)
	public static void theo(int x, int y, int z)
	{
		System.out.println("hello world. my name is theo.");
		int a = x*x*y*y*y*z;
		System.out.println("I am "+a+" years old.");
	}
}
