
public class meng {
public static void main(String[] args)
{
	/*
	//구구단을 외자, 구구단을 외자
	for(int i=1; i<10; i++)
	{for(int j=1; j<10; j++)
		{System.out.println("FOR문 "+(i)+"x"+(j)+"="+(i*j));}
	}
	
	int i=1;
	while (i<10)
	{int j=1;
			while (j<10)
			{System.out.println("WHILE문 "+(i)+"x"+(j)+"="+(i*j));
			j++;}
		i++;}
		*/
	
	//별이 첫줄에 몇개면, 마지막 줄에는 몇개가 있을까?
	while(true)
{
	for (int i=1; i<5; i++)
	{for (int j=1; j<i+1; j++)
		{System.out.print(" ");}
	{for (int j=11-i; 0<j; j--)
		{System.out.print("*");}
		System.out.println(" ");}
	}
	
	for (int i=1; i<5; i++)
	{for (int j=5-i; 0<j; j--)
		{System.out.print(" ");}
	{for (int j=1; j<i+1; j++)
		{System.out.print("*");}
		System.out.println(" ");}
	}
}
}}