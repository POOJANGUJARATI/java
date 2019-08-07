import java.util.*;
import java.util.Scanner;

class Result extends SessionalExam implements External,Practical
{
	//super.getmarks();
	//super.gettotal();

	float getextmarks()
	{
			Scanner s2 = new Scanner(System.in);
			System.out.println("enter a cpp external marks : ");
			cpp = s2.nextFloat();
			System.out.println("enter a isp external marks : ");
			isp = s2.nextFloat();
			System.out.println("enter a maths external marks : ");
			maths = s2.nextFloat();
			System.out.println("enter a agile external marks : ");
			agile = s2.nextFloat();
			float exttotal = cpp + isp + maths + agile;
			return exttotal;
			//System.out.println("total of external exams is : " +exttotal);
	}
	float gettw()
	{
			Scanner s3 = new Scanner(System.in);
			System.out.println("enter a termwork of cpp : ");
			cpp = s3.nextFloat();
			System.out.println("enter a termwork of isp : ");
			isp = s3.nextFloat();
			System.out.println("enter a termwork of maths : ");
			maths = s3.nextFloat();
			System.out.println("enter a termwork of agile : ");
			agile = s3.nextFloat();
			float twtotal = cpp+isp+maths+agile;
			return twtotal;
			//System.out.println("total of termwork is : " +twtotal);
	}
	float getpractmarks()
	{
			Scanner s4 = new scanner(system.in);
			System.out.println("enter a practical marks of cpp : ");
			cpp = s4.nextFloat();
			System.out.println("enter a practical marks of isp : ");
			isp = s4.nextFloat();
			System.out.println("enter a practical marks of maths : ");
			maths = s4.nextFloat();
			System.out.println("enter a practical marks of agile : ");
			agile = s4.nextFloat();
			float practtotal = cpp+isp+maths+agile;
			return practtotal;
			//System.out.println("total of practical is :" +practotal);


	}
	public static void main(String a[])
	{
		Result s = new Result();
		s.getmarks();
		s.gettotal();
		s.getextmarks();
		s.gettw();
		s.getpractmarks();
		float resu =
		System.out.println("Result is: ");
	}


}
class SessionalExam
{
	public int cpp;
	public int isp;
	public int maths;
	public int agile;

	int getmarks()
	{

		Scanner s1= new Scanner(System.in);
		System.out.println("enter a c++  marks: ");
		cpp = s1.nextInt();
		System.out.println("enter a isp marks: ");
		isp = s1.nextInt();
		System.out.println("enter a maths  marks: ");
		maths = s1.nextInt();
		System.out.println("enter a agie  marks: ");
		agile = s1.nextInt();

	}
	float gettotal()
	{
		float total = cpp + isp + maths + agile;
		return total;
		//System.out.println("total is : " +total);
	}

}
interface External
{
	//public float PHP;
	//public float isp;

	float getextmarks();
	/*{
			Scanner s2 = new Scanner(System.in);
			System.out.println("enter a PHP external marks : ");
			PHP = s2.nextFloat();
			System.out.println("enter a isp external marks : ");
			isp = s2.nextFloat();
	}*/
	float gettw();
	/*{
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter a termwork of PHP : ");
		PHP = s3.nextFloat();
		System.out.println("enter a termwork of isp : ");
		isp = s3.nextFloat();
	}*/
}
interface Practical
{
		//public float java;
		//public float linux;

	float getpractmarks();
	/*{
		Scanner s4 = new scanner(system.in);
		System.out.println("enter a practical marks of java : ");
		java = s4.nextFloat();
		System.out.println("enter a practical marks of linux : ");
		linux = s4.nextFloat();
	}*/
}