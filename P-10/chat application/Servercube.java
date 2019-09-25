import java.io.*;
import java.net.*;
import java.util.*;

public class Servercube{
	public static void main(String ar[])	{
		try		{
			ServerSocket server = new ServerSocket(8001);
			Socket client = server.accept();
			DataInputStream fromclient = new DataInputStream(client.getInputStream());
			PrintWriter toclient = new PrintWriter(client.getOutputStream(),true);

			while(true)			{
				Scanner sc = new Scanner(fromclient);
				double n1 = sc.nextDouble();
				//System.out.println(radius);

				double cube = n1 * n1 * n1;
				toclient.println(cube);
				//System.out.println(area);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}