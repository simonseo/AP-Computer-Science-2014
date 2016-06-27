import java.util.Scanner;
public class semin6_DateCalc 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter YYYY/MM/DD");
		int year = scan.nextInt();
		int monthscan = scan.nextInt();
		int day = scan.nextInt();
		int d = 0;
		int e = Math.abs((year-2012)/4);
		if (year>=2012)
		{
			d+= (day-1) + (year-2012)*365 +e;
		}
		else if (2012>year)
		{
			d+= (day+1) + (2012-year)*365 -e;
		}
		for (int month=monthscan; month>=1; month--)
		{
			if (month==2||month==4||month==6||month==8||month==9||month==11)
			{
				d+= (month-1)*31;
			}
			else if (month==5||month==7||month==10||month==12)
			{
				d+= (month-1)*30;
			}
			else if (month==3)
			{
				d+= (month-1)*28;
			}
		}
		if (d%7==0)
		{System.out.println("Wednesday");}
		else if (d%7==1)
		{System.out.println("Thursday");}
		else if (d%7==2)
		{System.out.println("Friday");}
		else if (d%7==3)
		{System.out.println("Saturday");}
		else if (d%7==4)
		{System.out.println("Sunday");}
		else if (d%7==5)
		{System.out.println("Monday");}
		else if (d%7==6)
		{System.out.println("Tuesday");}
	}
}
