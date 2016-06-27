import java.util.Scanner;
public class semin4_applesale 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("상인의 돈, 사과수, 사과가격 입력.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("소비자의 돈, 그 중 얼마로 사과를 살지 입력.");
		int d = scan.nextInt();
		int e = scan.nextInt();
	      FruitSeller seller = new FruitSeller(a, b, c);
	      FruitBuyer buyer = new FruitBuyer(d);
	      buyer.buyApple(seller, e);
	      
	      System.out.println("과일 판매자의 현제 상황");
	      seller.showSaleResult();
	      
	      System.out.println("과일 구매자의 현제 상황");
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
      System.out.println("남은 사과" + numOfApple);
      System.out.println("판매 수익" + myMoney);
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
      System.out.println("현재 잔액" + myMoney);
      System.out.println("사과 개수" + numOfApple);
   }
}