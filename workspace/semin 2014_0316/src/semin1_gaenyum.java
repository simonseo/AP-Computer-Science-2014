/*
 * static: �� �ϴ��� �ֻ��� ����. Ŭ�������� ����. � Ŭ������������ �ҷ��� �� ����.
 * ���� ����  access control: class method �ڷ��� �� �տ� ����. private, protected, default(�ƹ��͵� ����), public
 * 
 * private�� ���� class �ȿ����� ������ �� ���� Theo Ŭ������ instance�� �����ص� �� �ȿ� �ִ� private�� �ٲ� ���� ����.
 * protected�� ���� package�� �߿� ��ӹ��� �͸�!!! �̰� ����!!! ��� ��� ���
 * default�� ���� package����.
 * public�� ���� project�̸� �ٸ� ��Ű���� ����, �ٲ� �� ����. �ٸ� class�� method��.
 * 
 * �迭, ARRAY (2D ARRAY?) : ���� ����
 * int[] Coin = {10, 20, 30};
 * ==
 * int[] Coin = int[3];	main(String args[])
 * int Coin[] = int[3]; main(String[] args)
 * Coin[0] = 10;
 * Coin[1] = 20;
 * Coin[2] = 30;
 * 
 * For each in 1D: for each element in {coin}, put the value into {int num}. Do what is said in the bracket for each and all elements of {Coin}.  
 * for (�ڷ��� �ƹ��̸�:�迭�̸�)
 * for (int num:Coin)
 * 
 * 
 */
public class semin1_gaenyum 
{
	public static void main(String args[])
	{
		System.out.println("sdlk\ndkljf");
		int[]Coin = new int[3];
			Coin[0] = 10;
			Coin[1] = 20;
			Coin[2] = 30;		
		
		for (int num:Coin)
		{
			System.out.println(num);
		}
		
		int[][] x = new int [4][4];
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				x[i][j] = (int)(Math.random()*4+1);
			}
		}
		
		for (int num1[] : x)
		{
			for (int num2 : num1)
			{
				System.out.print(num2+" ");
			}
			System.out.println("");
		}
	}
}
