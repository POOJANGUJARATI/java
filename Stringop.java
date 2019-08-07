import java.lang.String.*;
import java.util.*;
public class Stringop
{
	public static void main(String args[])
	{
		int f,g,h;
		char  e;
		char c[]={'a','b','c','d'};
	String str1;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter first string=");
	str1=s1.nextLine();
	String a=new String();
	System.out.println("first constructor="+a);
	String b=new String(c);
	System.out.println("second constructor="+b);
	int arr[]={65,66,67,68,69};
	String d=new String(arr,2,3);
	System.out.println("third constructor="+d);
	e=str1.charAt(2);
	System.out.println("charAt="+e);
	f=str1.length();


	System.out.println("length="+f);
	g=str1.compareTo("mansi");
	System.out.println("compare to="+g);




}
}