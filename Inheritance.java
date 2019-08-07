import java.util.*;
class Account
{

		public String name;
		public int acno;
		public String b;
		public String type;

		Account(String type)
		{
			this.type=type;
		}
		void getcustinfo()
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("enter customer name=");
			name=s1.next();
			System.out.println("enter account no=");
			acno=s1.nextInt();
			System.out.println("enter branch name=");
			b=s1.next();
		}
		void displayinfo()
		{
			System.out.println("name="+name);
			System.out.println("acno="+acno);
			System.out.println("branch="+b);
			System.out.println("type="+type);
		}
}

class Saving extends Account
{
	final static float Rate=3.5F;
	public int amount;
	public int year;
	float interest;
	public String type;
	public Saving(String type)
	{
		super(type);
	}
		public void getsavinginfo()
		{
			super.getcustinfo();
			Scanner s1=new Scanner(System.in);
			System.out.println("enter amount=");
			amount=s1.nextInt();
			System.out.println("enter year=");
			year=s1.nextInt();
		}
		public void callntAmt()
		{

			interest=(amount*Rate*year)/100;
		}

		void displayinfo()
		{
			super.displayinfo();
			System.out.println("Interest="+interest);
		}
}

class FixedDeposit extends Account
{
	public double interest;
	public int year;
	public int amount;
	public void getFDinfo()
	{
		super.getcustinfo();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter amount=");
		amount=s1.nextInt();
		System.out.println("enter year=");
		year=s1.nextInt();


	}
	public FixedDeposit(String type)
	{
		super(type);
	}
	public void callntAmt()
	{
		if(year<=2)
		{
				interest=(amount*6.5*year)/100;
		}
		else if(year>2 &&year<=5)
		{
				interest=(amount*7.5*year)/100;
		}
		else if(year>5 && year<=10)
		{
			interest=(amount*8.5*year)/100;
		}
		else
		{
			interest=(amount*9*year)/100;
		}

}
	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("Interest="+interest);
	}
}

public class Inheritance
{
	public static void main(String args[])
	{
		Account a1=new Account("saving");
		//Saving s1=new Saving("a");
		//s1.getinfo();
		//s1.callntamount();
		//System.out.println("Saving Account Details...");
		//s1.dispinfo();
		FixedDeposit f1=new FixedDeposit("fixed");
		f1.getFDinfo();
		f1.callntAmt();
		System.out.println("FixedDeposit Account Details...");
		f1.displayinfo();

	}
}


