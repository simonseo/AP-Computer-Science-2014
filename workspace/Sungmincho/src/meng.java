
public class meng {
public static void main(String[] args)
{
	/*
	//�������� ����, �������� ����
	for(int i=1; i<10; i++)
	{for(int j=1; j<10; j++)
		{System.out.println("FOR�� "+(i)+"x"+(j)+"="+(i*j));}
	}
	
	int i=1;
	while (i<10)
	{int j=1;
			while (j<10)
			{System.out.println("WHILE�� "+(i)+"x"+(j)+"="+(i*j));
			j++;}
		i++;}
		*/
	
	//���� ù�ٿ� ���, ������ �ٿ��� ��� ������?
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