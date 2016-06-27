import java.util.Scanner;
public class semin2_keyboardKI_japangi 
{
	public static void main(String args[])
	{
		Scanner japangi = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("¸Þ´º");
			System.out.println("±¸ÀÔ");
			System.out.println("Á¾·á");
			String a = japangi.next();

			if (a.equals("¸Þ´º"))
			{
				System.out.println("¼¼¹Î1 100¿ø");
				System.out.println("¼¼¹Î2 200¿ø");
				System.out.println("¼¼¹Î3 300¿ø");
				System.out.println("¼¼¹Î4 400¿ø");
				System.out.println("¼¼¹Î5 500¿ø");
				System.out.println("¼¼¹Î6 600¿ø");
				System.out.println("¼¼¹Î7 700¿ø");
				System.out.println("¼¼¹Î8 800¿ø");
				System.out.println("¼¼¹Î9 900¿ø");
				System.out.println("¼¼¹Î10 1000¿ø");
			}
			else if (a.equals("±¸ÀÔ"))
			{
				System.out.println("¾î¶² °ÍÀ» ±¸ÀÔÇÏ½Ã°Ú½À´Ï±î 3°¡Áö¸¦ °í¸£½Ã¿À");
				System.out.println("¼¼¹Î1 100¿ø");
				System.out.println("¼¼¹Î2 200¿ø");
				System.out.println("¼¼¹Î3 300¿ø");
				System.out.println("¼¼¹Î4 400¿ø");
				System.out.println("¼¼¹Î5 500¿ø");
				System.out.println("¼¼¹Î6 600¿ø");
				System.out.println("¼¼¹Î7 700¿ø");
				System.out.println("¼¼¹Î8 800¿ø");
				System.out.println("¼¼¹Î9 900¿ø");
				System.out.println("¼¼¹Î10 1000¿ø");
				String b = japangi.next();
				String c = japangi.next();
				String d = japangi.next();
				int e = 0;
				if (b.equals("¼¼¹Î1"))
				{e =+ 100;}
				else if (b.equals("¼¼¹Î2"))
				{e =+ 200;}
				else if (b.equals("¼¼¹Î3"))
				{e =+ 300;}
				else if (b.equals("¼¼¹Î4"))
				{e =+ 400;}
				else if (b.equals("¼¼¹Î5"))
				{e =+ 500;}
				else if (b.equals("¼¼¹Î6"))
				{e =+ 600;}
				else if (b.equals("¼¼¹Î7"))
				{e =+ 700;}
				else if (b.equals("¼¼¹Î8"))
				{e =+ 800;}
				else if (b.equals("¼¼¹Î9"))
				{e =+ 900;}
				else if (b.equals("¼¼¹Î10"))
				{e =+ 1000;}
				
				int h = 0;
				if (c.equals("¼¼¹Î1"))
				{h =+ 100;}
				else if (c.equals("¼¼¹Î2"))
				{h =+ 200;}
				else if (c.equals("¼¼¹Î3"))
				{h =+ 300;}
				else if (c.equals("¼¼¹Î4"))
				{h =+ 400;}
				else if (c.equals("¼¼¹Î5"))
				{h =+ 500;}
				else if (c.equals("¼¼¹Î6"))
				{h =+ 600;}
				else if (c.equals("¼¼¹Î7"))
				{h =+ 700;}
				else if (c.equals("¼¼¹Î8"))
				{h =+ 800;}
				else if (c.equals("¼¼¹Î9"))
				{h =+ 900;}
				else if (c.equals("¼¼¹Î10"))
				{h =+ 1000;}
				
				int j = 0;
				if (d.equals("¼¼¹Î1"))
				{j =+ 100;}
				else if (d.equals("¼¼¹Î2"))
				{j =+ 200;}
				else if (d.equals("¼¼¹Î3"))
				{j =+ 300;}
				else if (d.equals("¼¼¹Î4"))
				{j =+ 400;}
				else if (d.equals("¼¼¹Î5"))
				{j =+ 500;}
				else if (d.equals("¼¼¹Î6"))
				{j =+ 600;}
				else if (d.equals("¼¼¹Î7"))
				{j =+ 700;}
				else if (d.equals("¼¼¹Î8"))
				{j =+ 800;}
				else if (d.equals("¼¼¹Î9"))
				{j =+ 900;}
				else if (d.equals("¼¼¹Î10"))
				{j =+ 1000;}
				
				System.out.println("³»¾ßÇÒ °¡°ÝÀº "+(e+h+j)+"¿øÀÔ´Ï´Ù.");
				
				int °Å½º¸§µ· = 0;
				int ³½µ·=0;
				while (°Å½º¸§µ· <= 0)
				{	
					System.out.println("¾ó¸¶¸¦ ³»½Ã°Ú½À´Ï±î?");
					³½µ· = ³½µ· + japangi.nextInt();
					°Å½º¸§µ· = ³½µ· - (e+h+j);
					System.out.println(³½µ·+"¿øÀ» ³»¼Ì½À´Ï´Ù. ´õ ³»¼Å¾ß ÇÒ µ·Àº "+(-°Å½º¸§µ·)+"¿øÀÔ´Ï´Ù.");
				}
				int ¿À¸¸¿ø±Ç=0; int ¸¸¿ø±Ç=0; int ¿ÀÃµ¿ø±Ç=0; int Ãµ¿ø±Ç=0; int ¿À¹é¿ø=0; int ¹é¿ø=0; int ¿À½Ê¿ø=0; int ½Ê¿ø=0;
				if (°Å½º¸§µ· > 0)
				{
					¿À¸¸¿ø±Ç = °Å½º¸§µ·/50000;
					°Å½º¸§µ· = °Å½º¸§µ· - 50000*¿À¸¸¿ø±Ç;
					if (°Å½º¸§µ· > 0)
					{
						¸¸¿ø±Ç = °Å½º¸§µ·/10000;
						°Å½º¸§µ· = °Å½º¸§µ· - 10000*¸¸¿ø±Ç;
					if (°Å½º¸§µ· > 0)
					{
						¿ÀÃµ¿ø±Ç = °Å½º¸§µ·/5000;
						°Å½º¸§µ· = °Å½º¸§µ· - 5000*¿ÀÃµ¿ø±Ç;
					if (°Å½º¸§µ· > 0)
					{Ãµ¿ø±Ç = °Å½º¸§µ·/1000;
					°Å½º¸§µ· = °Å½º¸§µ· - 1000*Ãµ¿ø±Ç;
					if (°Å½º¸§µ· > 0)
					{
						¿À¹é¿ø = °Å½º¸§µ·/500;
						°Å½º¸§µ· = °Å½º¸§µ· - 500*¿À¹é¿ø;
					if (°Å½º¸§µ· > 0)
					{
						¹é¿ø = °Å½º¸§µ·/100;
						°Å½º¸§µ· = °Å½º¸§µ· - 100*¹é¿ø;
					if (°Å½º¸§µ· > 0)
					{
						¿À½Ê¿ø = °Å½º¸§µ·/50;
						°Å½º¸§µ· = °Å½º¸§µ· - 50*¿À½Ê¿ø;	
					if (°Å½º¸§µ· > 0)
					{
					½Ê¿ø = °Å½º¸§µ·/10;
					}}}}}}}
					System.out.println("¿À¸¸¿ø±Ç "+¿À¸¸¿ø±Ç+"°³, ¸¸¿ø±Ç "+¸¸¿ø±Ç+"°³, ¿ÀÃµ¿ø±Ç "+¿ÀÃµ¿ø±Ç+"°³, Ãµ¿ø±Ç "+Ãµ¿ø±Ç+"°³, ¿À¹é¿ø "+¿À¹é¿ø+"°³, ¹é¿ø "+¹é¿ø+"°³, ¿À½Ê¿ø "+¿À½Ê¿ø+"°³, ½Ê¿ø "+½Ê¿ø+"°³");
					System.out.println("°¨»çÇÕ´Ï´Ù ¤Ç¤Ç¤Ç");
				}
			}
			else if (a.equals("Á¾·á"))
			{
				break;
			}			
		}
	}
}
