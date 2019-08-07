import java.util.*;
import java.lang.String.*;
class Str
{
	String s,s2,s4,s6,s8;
	char ch;
	int l1,m,n;
	String(String s1)
	{
		s=s1.toLowerCase();
		s2=s1.toUpperCase();
		ch=s1.charAt(4);
		l1=s1.length();

	}
	String(String s1,String s3)
	{
		s4=s1.concat(s3);
		System.out.println("equal to="+s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	String(String s1,int m,int n)
	{
			System.out.println("substring="+s1.substring(m,n));
	}
	void display()
	{
		System.out.println("lowercase string="+s);
		System.out.println("uppercase string="+s2);
		System.out.println("at position="+ch);
		System.out.println("Length="+l1);

	}

	void show()
	{
		System.out.println("concated String="+s4);
	}
}
public class Stringmethods
{
	public static void main(String args[])
	{
	    String str1,str2;
	    Scanner s1=new Scanner(System.in);
	    System.out.println("enter string=");
	    str1=s1.nextLine();
	    System.out.println("enter second string=");
	    str2=s1.nextLine();
	    //System.out.println("string="+str1);
	    Str a=new Str(str1);
	    Str b=new Str(str1

 	}
}
