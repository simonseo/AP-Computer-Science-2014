import java.util.Scanner;
public class semin4_applesale 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��, �����, ������� �Է�.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("�Һ����� ��, �� �� �󸶷� ����� ���� �Է�.");
		int d = scan.nextInt();
		int e = scan.nextInt();
	      FruitSeller seller = new FruitSeller(a, b, c);
	      FruitBuyer buyer = new FruitBuyer(d);
	      buyer.buyApple(seller, e);
	      
	      System.out.println("���� �Ǹ����� ���� ��Ȳ");
	      seller.showSaleResult();
	      
	      System.out.println("���� �������� ���� ��Ȳ");
	      buyer.showBuyResult();
	}
}


class FruitSeller
{
   int numOfApple;
   int myMoney;
   final int APPLE_PRICE;
   
   FruitSeller(int a, int b, int c)
   {
	   numOfApple = b;
	   myMoney = a;
	   APPLE_PRICE = c;
	   
	   System.out.println(""+a+b+c);
   }
   
   public int saleApple(int money)
   {
      int num = money/APPLE_PRICE;
      numOfApple-=num;
      myMoney+=money;
      System.out.println(""+numOfApple+myMoney);
      return num;
   }
   public void showSaleResult()
   {
      System.out.println("���� ���" + numOfApple);
      System.out.println("�Ǹ� ����" + myMoney);
   }
}

class FruitBuyer
{
   int myMoney;
   int numOfApple = 0;
   
   FruitBuyer(int d)
   {
	   myMoney = d;
   }
   
   public void buyApple(FruitSeller seller, int money)
   {8huh
      numOfApple+=seller.saleApple(money);
      myMoney-=money;
   }
   public void showBuyResult()
   {
      System.out.println("���� �ܾ�" + myMoney);
      System.out.println("��� ����" + numOfApple);
   }
}