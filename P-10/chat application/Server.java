import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class Server extends JFrame
{
	public static void main(String a[])
	{

			JFrame jf = new JFrame("Server side");
			JTextField t1;
			JLabel l1;

			l1 = new JLabel("Received :");
			t1 = new JTextField();


			l1.setBounds(1,100,60,30);


			t1.setBounds(70,100,200,30);

			jf.add(l1);

			jf.add(t1);

			jf.setSize(400,400);

			jf.setLayout(null);
			jf.setVisible(true);


		try{
				ServerSocket server = new ServerSocket(8001);
				Socket client = server.accept();
				DataInputStream fromclient = new DataInputStream(client.getInputStream());
				PrintWriter toclient = new PrintWriter(client.getOutputStream(),true);

				while(true)
				{
					Scanner sc = new Scanner(fromclient);
					double radius = sc.nextDouble();

					double area = radius * radius * Math.PI;
					toclient.println(area);
				}
			}

		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}