/*
 * constructor은 class와 method가 이름이 같은 것
 * 정의를 안 해줘도 기본적으로 빈 껍데기로 존재함.
 * Scanner scan = new Scanner(System.in);
 * Scanner()는 기본적으로 실행이 되는데, 거기에 input을 system.in으로 정한다.
 * main에서
 * 	Theo t1 = new Theo(2, ...);
 * 	Theo t2 = new Theo(10, ...);
 * [윗줄에서 Theo는 class, t1이랑 t2는 instance, Theo(2,..)이랑 Theo(10,...)은 constructor method 호출
 * 
 * Theo class에서
 * 	int myAge;
 * 	Theo(int age)
 * 	{
 * 		myAge = age;
 * 	}
 * 
 * t1/t2를 정의한 시점에서 constructor생성자 Theo()가 실행됨. 그 이후로 실행 안 됨.
 */

public class semin3_constructor 
{
	public static void main(String args[])
	{ㄹ
		
	}
	
}
