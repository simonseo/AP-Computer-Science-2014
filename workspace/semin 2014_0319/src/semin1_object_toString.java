/*
 * 오늘 배우는 건 전부 자바 기본 클래스
 * class: object(toString equals) math string(substring length indexOf) wrapper[Double Integer] (toString equals compareTo intValue)
 *  
 * object 클래스는 객체로, 최상위에 있음. 알아야 되는 건 두가지: toString method, equals method
 * ├ toString: class를 프린트하려고 할 때 원래 class는 출력이 안 되지만 toString method가 자동 실행되어서 class를 출력해야하는 걸 toString method가 반환하는 string을 출력한다.
 * └ equals: 상속을 받으면 polymorphism/downcasting등을 함. Object형태로 semin2 등을 선언할 수 있음 semin1.equals(semin2);
 * hashcode: 각 instance마다 hashcode가 있음. 같은 instance이면 같은 해시코드를 가지지만 해시코드가 같다고 해서 같은 인스턴스는 아님.
 * 
 * String은 선언 방법 두가지:	┬String str = new String("semin");
 * 						└String str = "	semin";
 * 										01234
 * int x = str.length(); 이 메소드는 str라는 스트링의 length를 int로 구해줌 x=5
 * String str2 = str.substring(2); 2에 해당하는 m부터 str2=min
 * String str3 = str.substring(2,4); 2이상 4 미만의 str3=mi
 * int y = str.indexOf("min"); str에서 min이 가장 처음 나올 때의 숫자를 반환. 해당하는 시퀀스가 없으면 -1 반환.
 * 
 * Wrapper Class : 자료형이 객체로 보이게 wrap해서 존재하는 클래스
 * ├ Integer Class 	┬ int x = 10;
 * │				└ Integer x = new Integer(10);
 * └ Double Class 
 * object x 랑 integer y가 있을 때, print(x);하면 자동으로 toString 형변환(?)이 되지만, print(y)는 안됨. str z = y.toString(); 하고 프린트해야됨.
 * equals 
 * a.compareTo(b) 
 * ├같으면 return 0 
 * ├a>b이면 +1
 * └a<b이면 -1
 * 
 */
public class semin1_object_toString 
{
	public static void main(String args[])
	{
		semin2 samsung = new semin2();
		System.out.println(samsung);
		
		Integer x = new Integer(150);
		Integer y = new Integer(15);
		int z = y.compareTo(x.intValue());
		System.out.println(z);
		
		int a = (int)(Math.random()*21 + 15);
		
		System.out.println
	}
}

class semin2
{
	public String toString()
	{
		return "semin 뷁";
	}
}