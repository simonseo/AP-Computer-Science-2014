/*
 * static: 뭘 하던지 최상위 레벨. 클래스보다 높음. 어떤 클래스에서든지 불러올 수 있음.
 * 접근 제어  access control: class method 자료형 등 앞에 선언. private, protected, default(아무것도 없음), public
 * 
 * private은 같은 class 안에서만 접근할 수 있음 Theo 클래스의 instance를 선언해도 그 안에 있는 private은 바꿀 수가 없음.
 * protected는 같은 package내 중에 상속받은 것만!!! 이게 뭐야!!! 상속 상속 상속
 * default는 같은 package내에.
 * public은 같은 project이면 다른 패키지라도 접근, 바꿀 수 있음. 다른 class도 method도.
 * 
 * 배열, ARRAY (2D ARRAY?) : 저장 형태
 * int[] Coin = {10, 20, 30};
 * ==
 * int[] Coin = int[3];	main(String args[])
 * int Coin[] = int[3]; main(String[] args)
 * Coin[0] = 10;
 * Coin[1] = 20;
 * Coin[2] = 30;
 * 
 * For each in 1D: for each element in {coin}, put the value into {int num}. Do what is said in the bracket for each and all elements of {Coin}.  
 * for (자료형 아무이름:배열이름)
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
