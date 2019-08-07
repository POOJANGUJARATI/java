import java.util.*;
interface external
{
	public void getextmarks();
	public void gettw();
	public void gettotal();
}
class Sessional
{
	int sub[][]=new int[20][20];
	int total=0;
	double avg;
	public void getmarks()
	{
		Scanner s1=new Scanner(System.in);


		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.println("enter marks for sessional"+i+" sub"+j);
				sub[i][j]=s1.nextInt();
			}
		}
	}
	public void gettotal()
	{

		for(int i=1;i<=3;i++)
		{
				for(int j=1;j<=4;j++)
				{
					total=total+sub[i][j];
				}
		}
		avg=total/3;
	}
	public void display()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.println("sessional"+i+"marks for sub"+j+"="+sub[i][j]);

			}
		}
		System.out.println("total="+total);
		System.out.println("average of sessional="+avg);
	}

}

class Result extends Sessional
{
	int s[]=new int[5];
	int t[]=new int[5];
	int sum=0;
	double ftotal;
	double t1,st1,tt1;
	public void getextmarks()
	{

		super.getmarks();
		Scanner s1=new Scanner(System.in);

		for(int i=1;i<=4;i++)
		{
			System.out.println("enter makrs for sub"+i+"=");
			s[i]=s1.nextInt();

		}
	}
	public void gettwmarks()
	{
		Scanner s1=new Scanner(System.in);
		for(int i=1;i<=4;i++)
		{
			System.out.println("enter tw"+i);
			t[i]=s1.nextInt();
		}
	}
	public void display()
	{
		super.display();
		for(int i=1;i<=4;i++)
		System.out.println("marks of sub"+i+"="+s[i]);
		System.out.println("total of externl="+sum);
		System.out.println("termwork marks="+st1);

	}
	public void gettotal()
	{
		super.gettotal();
		for(int i=1;i<=4;i++)
		{
		  sum=sum+s[i];
		  tt1=tt1+t[i];
		  st1=(tt1*4)/100;
		}
		  ftotal=sum+st1+total;
	}

}

public class Marksheet
{
	public static void main(String args[])
	{
	/*Sessional s=new Sessional();
	s.sessional1();
	s.gettotal();
	s.display();*/
	Result r1=new Result();
	r1.getextmarks();


	r1.gettwmarks();
	r1.gettotal();
	r1.display();
	}
}





