
public class Semin2 {
	public static void main(String args [])
	{
		//�⺻ ����� 3000���̰� 3000������ 500m�� ����, �� �������ʹ� 100m�� 100���� �� ����
		int distance = 1059;
		int nominaldistance = (int)distance/100;
		if (distance <= 500)
		{
			System.out.println("��� ����: 3000��");
		}
		else
		{
			System.out.println("��� ����: "+(3000+nominaldistance*100)+"��");
		}
			
	}
}
