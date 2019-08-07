import java.util.*;

class Rectangle
{
	int length,bredth;
	Rectangle(int l,int b)
	{
		length=l;
		bredth=b;
		System.out.println("area of rectangle="+length*bredth);
	}
};
class Triangle
{
	float ll,bb;
	Triangle(float l2,float l3)
	{
		ll=l2;
		bb=l3;
		System.out.println("area of triangle="+0.5*ll*bb);
	}
};
class Circle
{
	 final double PI= 3.14;
	float rr;
	Circle(float r)
	{
		rr=r;
		System.out.println("area of circle="+PI*rr*rr);
	}
};
public class Shape
{
	public static void main(String args[])
	{
			int l,b;
			float a,c;
			float r;
		  Scanner obj1 = new Scanner(System.in);
		  System.out.println(" enter length=");
		   l=obj1.nextInt();
		  System.out.println(" enter bredth=");
		   b=obj1.nextInt();
		  Rectangle r1=new Rectangle(l,b);
		   System.out.println(" enter length=");
		   a=obj1.nextFloat();
		   System.out.println(" enter bredth=");
		   c=obj1.nextFloat();
		   Triangle t1=new Triangle(a,c);
		   System.out.println("enter r=");
		   r=obj1.nextFloat();
		   Circle c1=new Circle(r);
	}
}


