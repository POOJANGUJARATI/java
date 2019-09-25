import java.io.*;
import java.net.*;
import java.util.*;
public class Clientcube
{
	public static void main(String ar[])	{
		try	{
			Socket client = new Socket("localhost",8001);
			DataInputStream fromserver = new DataInputStream(client.getInputStream());
			PrintWriter toserver = new PrintWriter(client.getOutputStream(),true);

			while(true)			{
				System.out.println("Enter the numer for cube:");
				Scanner sc = new Scanner(System.in);

				double n1 = sc.nextDouble();
				toserver.println(n1);

				Scanner sc1 = new Scanner(fromserver);
				double cube = sc1.nextDouble();
				System.out.println(cube);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
