import java.lang.*;
import java.util.*;
public class Stringop
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		//String s2=new String();//2
		byte[] b={66,67,68,69};
		String s1=new String(b);//1
		System.out.println(s1);
		char[] c1={'a','b','c','d','e'};
		String s3=new String(c1);//3
		System.out.println(s3);
		int[] u = {78,100,101,109,112};
		String s = new String(u,1,3);//4
		System.out.println(s);
		System.out.println("enter string=");
		String c=a.nextLine();
		int len=c.length();//1
		System.out.println("length="+len);
		char ch=c.charAt(3);//2
		System.out.println("character="+ch);
		String str1=c.substring(3);//3
		System.out.println("substring="+str1);
		String str2=c.substring(5,7);//4
		System.out.println("substring with range="+str2);
		int index=c.lastIndexOf('a');//5
		System.out.println("last index="+index);
		int o=c.compareTo("mansinukani");//6
		System.out.println("compare="+o);
		int q=c.compareToIgnoreCase("mansinuknai");//7
		System.out.println("compare="+q);
		System.out.println("to upper="+c.toUpperCase());//8
		System.out.println("to lower="+c.toLowerCase());//9
		System.out.println("to replace="+c.replace('a','k'));

	}
}