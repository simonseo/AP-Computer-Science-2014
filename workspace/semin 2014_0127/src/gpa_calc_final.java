import java.util.Scanner;
public class gpa_calc_final {
	public static void main(String args[])
	{
		
		int gpa1; int gpa2; int gpa3; int gpa4; int gpa5;
		Scanner gradescan = new Scanner(System.in);
		System.out.println("Enter your 국어 score");
		float grade1 = gradescan.nextFloat();
		System.out.println("Enter your 수학 score");
		float grade2 = gradescan.nextFloat();
		System.out.println("Enter your 사회 score");
		float grade3 = gradescan.nextFloat();
		System.out.println("Enter your 과학 score");
		float grade4 = gradescan.nextFloat();
		System.out.println("Enter your 영어 score");
		float grade5 = gradescan.nextFloat();
///GRADE 1111111111111111111111111111111111111111111111111
		if (grade1 >= 89.5)
		{
			gpa1 = 5;
		}
		else if (grade1 >= 79.5)
		{
			gpa1 = 4;
		}
		else if (grade1 >= 69.5)
		{
			gpa1 = 3;
		}
		else if (grade1 >= 59.5)
		{
			gpa1 = 2;
		}
		else
		{
			gpa1 = 1;
		}
	///GRADE 222222222222222222222222222222222222222222
		if (grade2 >= 89.5)
		{
			gpa2 = 5;
		}
		else if (grade2 >= 79.5)
		{
			gpa2 = 4;
		}
		else if (grade2 >= 69.5)
		{
			gpa2 = 3;
		}
		else if (grade2 >= 59.5)
		{
			gpa2 = 2;
		}
		else
		{
			gpa2 = 1;
		}
///GRADE 3333333333333333333333333333333333333333333333
		if (grade3 >= 89.5)
		{
			gpa3 = 5;
		}
		else if (grade3 >= 79.5)
		{
			gpa3 = 4;
		}
		else if (grade3 >= 69.5)
		{
			gpa3 = 3;
		}
		else if (grade3 >= 59.5)
		{
			gpa3 = 2;
		}
		else
		{
			gpa3 = 1;
		}
///GRADE 44444444444444444444444444444444444444444444444	
		if (grade4 >= 89.5)
		{
			gpa4 = 5;
		}
		else if (grade4 >= 79.5)
		{
			gpa4 = 4;
		}
		else if (grade4 >= 69.5)
		{
			gpa4 = 3;
		}
		else if (grade4 >= 59.5)
		{
			gpa4 = 2;
		}
		else
		{
			gpa4 = 1;
		}
///GRADE 555555555555555555555555555555555555555555555555
		if (grade5 >= 89.5)
		{
			gpa5 = 5;
		}
		else if (grade5 >= 79.5)
		{
			gpa5 = 4;
		}
		else if (grade5 >= 69.5)
		{
			gpa5 = 3;
		}
		else if (grade5 >= 59.5)
		{
			gpa5 = 2;
		}
		else
		{
			gpa5 = 1;
		}
		double gpa = (gpa1+gpa2+gpa3+gpa4+gpa5)/5.0;
		System.out.print(gpa1+", ");
		System.out.print(gpa2+", ");
		System.out.print(gpa3+", ");
		System.out.print(gpa4+", ");
		System.out.println(gpa5);
		System.out.println("Your GPA is: "+gpa);
	}
}
