import java.util.ArrayList;
import java.util.List;

/* 
 * List< > x = new ArrayList();
 * List�� interface. Object������ array. Method�� ���ؼ� ĭ�� �ø��ų� ���̰ų� ���� �����ϰ� ���� �� ����. �����̶�� ������ ���� �ڷ������.
 * Array�� object�̱�� ������ �ڷ��� ����
 * 
 * x.add()
 * x.size()
 * x.get()
 * x.set()
 * x.add( , )
 * x.remove()
 */
public class semin2_List_interface 
{
	public static void main(String args[])
	{
		List<Integer> x = new ArrayList<Integer>();
		x.add(15);
		x.add(10);
		x.add(5);
		x.add(0);
		x.add(2,7);
//		x.remove(2);
		System.out.println(x);
	}
}
