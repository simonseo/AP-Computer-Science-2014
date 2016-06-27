
public class Semin2 {
	public static void main(String args [])
	{
		//기본 요금이 3000원이고 3000원으로 500m를 가고, 그 다음부터는 100m당 100원씩 더 받음
		int distance = 1059;
		int nominaldistance = (int)distance/100;
		if (distance <= 500)
		{
			System.out.println("요금 정산: 3000원");
		}
		else
		{
			System.out.println("요금 정산: "+(3000+nominaldistance*100)+"원");
		}
			
	}
}
