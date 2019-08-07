class Sum
{
	float a,b;
	int c,d;
	double n1,n2;
	int m;
	void sum()
	{
		m=0;
		System.out.println("\n called...");
	}
	int sum(int n1,int n2)
	{
		c=n1;
		d=n2;
		return (c+d);
	}
	double sum(double d1,double d2)
	{
			n1=d1;
			n2=d2;
			return (d1+d2);
	}
	int sum(int n)
	{
			c=d=n;
			return (c+d);
	}
	float sum(float f1,float f2)
	{
		a=f1;
		b=f2;
		return (a+b);
	}
};
public class Calculator
{
		public static void main(String args[])
		{
			Sum s1=new Sum();
			int var1=s1.sum(10,20);
			System.out.println("sum of int="+var1);
			Sum s2=new Sum();
			float var2=s2.sum(10.5f,6.8f);
			System.out.println("sum of float="+var2);
			Sum s3=new Sum();
			double var3=s3.sum(2.7894d,1.7890d);
			System.out.println("sum of double="+var3);
			Sum s4=new Sum();
			int var4=s4.sum(22);
			System.out.println("sum of int="+var4);
			Sum s5=new Sum();
			s5.sum();
		}
}