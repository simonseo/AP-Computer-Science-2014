/*
 * ���� ���� �� ���� �ڹ� �⺻ Ŭ����
 * class: object(toString equals) math string(substring length indexOf) wrapper[Double Integer] (toString equals compareTo intValue)
 *  
 * object Ŭ������ ��ü��, �ֻ����� ����. �˾ƾ� �Ǵ� �� �ΰ���: toString method, equals method
 * �� toString: class�� ����Ʈ�Ϸ��� �� �� ���� class�� ����� �� ������ toString method�� �ڵ� ����Ǿ class�� ����ؾ��ϴ� �� toString method�� ��ȯ�ϴ� string�� ����Ѵ�.
 * �� equals: ����� ������ polymorphism/downcasting���� ��. Object���·� semin2 ���� ������ �� ���� semin1.equals(semin2);
 * hashcode: �� instance���� hashcode�� ����. ���� instance�̸� ���� �ؽ��ڵ带 �������� �ؽ��ڵ尡 ���ٰ� �ؼ� ���� �ν��Ͻ��� �ƴ�.
 * 
 * String�� ���� ��� �ΰ���:	��String str = new String("semin");
 * 						��String str = "	semin";
 * 										01234
 * int x = str.length(); �� �޼ҵ�� str��� ��Ʈ���� length�� int�� ������ x=5
 * String str2 = str.substring(2); 2�� �ش��ϴ� m���� str2=min
 * String str3 = str.substring(2,4); 2�̻� 4 �̸��� str3=mi
 * int y = str.indexOf("min"); str���� min�� ���� ó�� ���� ���� ���ڸ� ��ȯ. �ش��ϴ� �������� ������ -1 ��ȯ.
 * 
 * Wrapper Class : �ڷ����� ��ü�� ���̰� wrap�ؼ� �����ϴ� Ŭ����
 * �� Integer Class 	�� int x = 10;
 * ��				�� Integer x = new Integer(10);
 * �� Double Class 
 * object x �� integer y�� ���� ��, print(x);�ϸ� �ڵ����� toString ����ȯ(?)�� ������, print(y)�� �ȵ�. str z = y.toString(); �ϰ� ����Ʈ�ؾߵ�.
 * equals 
 * a.compareTo(b) 
 * �������� return 0 
 * ��a>b�̸� +1
 * ��a<b�̸� -1
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
		return "semin ��";
	}
}