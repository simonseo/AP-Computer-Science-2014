import java.util.Scanner;
public class semin2_keyboardKI_japangi 
{
	public static void main(String args[])
	{
		Scanner japangi = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("�޴�");
			System.out.println("����");
			System.out.println("����");
			String a = japangi.next();

			if (a.equals("�޴�"))
			{
				System.out.println("����1 100��");
				System.out.println("����2 200��");
				System.out.println("����3 300��");
				System.out.println("����4 400��");
				System.out.println("����5 500��");
				System.out.println("����6 600��");
				System.out.println("����7 700��");
				System.out.println("����8 800��");
				System.out.println("����9 900��");
				System.out.println("����10 1000��");
			}
			else if (a.equals("����"))
			{
				System.out.println("� ���� �����Ͻðڽ��ϱ� 3������ ���ÿ�");
				System.out.println("����1 100��");
				System.out.println("����2 200��");
				System.out.println("����3 300��");
				System.out.println("����4 400��");
				System.out.println("����5 500��");
				System.out.println("����6 600��");
				System.out.println("����7 700��");
				System.out.println("����8 800��");
				System.out.println("����9 900��");
				System.out.println("����10 1000��");
				String b = japangi.next();
				String c = japangi.next();
				String d = japangi.next();
				int e = 0;
				if (b.equals("����1"))
				{e =+ 100;}
				else if (b.equals("����2"))
				{e =+ 200;}
				else if (b.equals("����3"))
				{e =+ 300;}
				else if (b.equals("����4"))
				{e =+ 400;}
				else if (b.equals("����5"))
				{e =+ 500;}
				else if (b.equals("����6"))
				{e =+ 600;}
				else if (b.equals("����7"))
				{e =+ 700;}
				else if (b.equals("����8"))
				{e =+ 800;}
				else if (b.equals("����9"))
				{e =+ 900;}
				else if (b.equals("����10"))
				{e =+ 1000;}
				
				int h = 0;
				if (c.equals("����1"))
				{h =+ 100;}
				else if (c.equals("����2"))
				{h =+ 200;}
				else if (c.equals("����3"))
				{h =+ 300;}
				else if (c.equals("����4"))
				{h =+ 400;}
				else if (c.equals("����5"))
				{h =+ 500;}
				else if (c.equals("����6"))
				{h =+ 600;}
				else if (c.equals("����7"))
				{h =+ 700;}
				else if (c.equals("����8"))
				{h =+ 800;}
				else if (c.equals("����9"))
				{h =+ 900;}
				else if (c.equals("����10"))
				{h =+ 1000;}
				
				int j = 0;
				if (d.equals("����1"))
				{j =+ 100;}
				else if (d.equals("����2"))
				{j =+ 200;}
				else if (d.equals("����3"))
				{j =+ 300;}
				else if (d.equals("����4"))
				{j =+ 400;}
				else if (d.equals("����5"))
				{j =+ 500;}
				else if (d.equals("����6"))
				{j =+ 600;}
				else if (d.equals("����7"))
				{j =+ 700;}
				else if (d.equals("����8"))
				{j =+ 800;}
				else if (d.equals("����9"))
				{j =+ 900;}
				else if (d.equals("����10"))
				{j =+ 1000;}
				
				System.out.println("������ ������ "+(e+h+j)+"���Դϴ�.");
				
				int �Ž����� = 0;
				int ����=0;
				while (�Ž����� <= 0)
				{	
					System.out.println("�󸶸� ���ðڽ��ϱ�?");
					���� = ���� + japangi.nextInt();
					�Ž����� = ���� - (e+h+j);
					System.out.println(����+"���� ���̽��ϴ�. �� ���ž� �� ���� "+(-�Ž�����)+"���Դϴ�.");
				}
				int ��������=0; int ������=0; int ��õ����=0; int õ����=0; int �����=0; int ���=0; int ���ʿ�=0; int �ʿ�=0;
				if (�Ž����� > 0)
				{
					�������� = �Ž�����/50000;
					�Ž����� = �Ž����� - 50000*��������;
					if (�Ž����� > 0)
					{
						������ = �Ž�����/10000;
						�Ž����� = �Ž����� - 10000*������;
					if (�Ž����� > 0)
					{
						��õ���� = �Ž�����/5000;
						�Ž����� = �Ž����� - 5000*��õ����;
					if (�Ž����� > 0)
					{õ���� = �Ž�����/1000;
					�Ž����� = �Ž����� - 1000*õ����;
					if (�Ž����� > 0)
					{
						����� = �Ž�����/500;
						�Ž����� = �Ž����� - 500*�����;
					if (�Ž����� > 0)
					{
						��� = �Ž�����/100;
						�Ž����� = �Ž����� - 100*���;
					if (�Ž����� > 0)
					{
						���ʿ� = �Ž�����/50;
						�Ž����� = �Ž����� - 50*���ʿ�;	
					if (�Ž����� > 0)
					{
					�ʿ� = �Ž�����/10;
					}}}}}}}
					System.out.println("�������� "+��������+"��, ������ "+������+"��, ��õ���� "+��õ����+"��, õ���� "+õ����+"��, ����� "+�����+"��, ��� "+���+"��, ���ʿ� "+���ʿ�+"��, �ʿ� "+�ʿ�+"��");
					System.out.println("�����մϴ� �ǤǤ�");
				}
			}
			else if (a.equals("����"))
			{
				break;
			}			
		}
	}
}
