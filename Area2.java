import java.util.*;
abstract class Geometry
{
	static final float PI=3.14F;
	public abstract void perimeter();
}
class Square extends Geometry
{
	public float l,p;
	Square(float ll)
	{
		l=ll;
	}
		public void perimeter()
		{
			p=4*l;
		}
		public void display()
		{
			System.out.println("perimeter of Square="+p);
		}
}

class Circle extends Geometry
{
	public float d,p;
	Circle(float dd)
	{
		d=dd;
	}
	public void perimeter()
	{
			p=PI*d;
	}
	public void display()
	{
				System.out.println("perimeter of circle="+p);
	}
}
public class Area2
{
	public static void main(String args[])
	{
		float l,d;
		Scanner s3=new Scanner(System.in);
		System.out.println("enter l=");
		l=s3.nextFloat();
		Square s1=new Square(l);
		s1.perimeter();
		//System.out.println("perimeter of square");
		s1.display();
		System.out.println("enter d=");
		d=s3.nextFloat();
		Circle c1=new Circle(d);
		c1.perimeter();
		//System.out.println("perimeter of circle");
		c1.display();
	}
}