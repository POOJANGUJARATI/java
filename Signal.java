import java.util.*;
import java.awt.*;
import java.applet.Applet;


public class Signal extends Applet,Thread
{
	String threadname;
	private Thread t;

	public void run()
	{
		System.out.println("Starting");

		try{

				Thread.sleep(5000);
			}

	}

	public void init()
	{
		Label l;
		l = new Label("Trafic signal lights:");
		setBackground(Color.black);

	}

	public void paint(Graphics g)
	{
		//g.setColor(Color.black);
		g.drawOval(30,40,20,20);
		g.setColor(Color.red);
		g.fillOval(30,40,20,20);

		g.drawOval(30,70,20,20);
		g.setColor(Color.green);
		g.fillOval(30,70,20,20);

		g.drawOval(30,100,20,20);
		g.setColor(Color.yellow);
		g.fillOval(30,100,20,20);
	}

}

