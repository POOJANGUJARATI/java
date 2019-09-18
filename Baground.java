import java.util.*;
import java.awt.*;
import java.applet.Applet;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Baground extends Applet
{
	//String color;
	public void init()
	{
		//g.setColor(Color.getColor(getParameter("color")));
		setBackground(Color.green);
	}
	public void paint(Graphics g)
	{
		repaint();

	}
}


