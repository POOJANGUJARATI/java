import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Client extends JFrame implements ActionListener
{
	public static void main(String a[])
	{


			Socket client = new Socket("localhost",8001);
			DataInputStream fromserver = new DataInputStream(client.getInputStream());
			PrintWriter toserver = new PrintWriter(client.getOutputStream(),true);



			JFrame jf = new JFrame("client side");
			JTextField t1,t2;
			JLabel l1,l2;
			JButton calbtn = new JButton("submit");


			l1 = new JLabel("Client:");
			l2 = new JLabel("Response :");
			t1 = new JTextField();

			t2 = new JTextField();

			l1.setBounds(1,100,60,30);
			l2.setBounds(1,150,60,30);


			t1.setBounds(55,100,200,30);
			t2.setBounds(55,150,200,30);

			jf.add(l1);
			jf.add(l2);

			jf.add(t1);
			jf.add(t2);
			jf.add(calbtn);
			calbtn.addActionListener(this);

			jf.setSize(400,400);

			jf.setLayout(null);
			jf.setVisible(true);


		if (getSource() == calbtn)
		{
			System.out.println("Enter the radius:");
			Scanner sc = new Scanner(System.in);

			double radius = sc.nextDouble();
			toserver.println(radius);

			Scanner sc1 = new Scanner(fromserver);
			double area = sc1.nextDouble();
			System.out.println(area);

		}
	}


}
