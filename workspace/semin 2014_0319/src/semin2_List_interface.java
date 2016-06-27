import java.util.ArrayList;
import java.util.List;

/* 
 * List< > x = new ArrayList();
 * List는 interface. Object형식의 array. Method를 통해서 칸을 늘리거나 줄이거나 값을 삽입하고 빼낼 수 있음. 차원이라는 개념은 없고 자료저장용.
 * Array는 object이기는 하지만 자료의 나열
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
