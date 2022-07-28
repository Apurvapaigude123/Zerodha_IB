package Practice;

import java.applet.Applet;
import java.awt.Graphics;
//<applet code=face height =250 width=200>
//</applet>

public class face extends Applet{
	public static void main(String[] args) {
		
	}
	public void paint(Graphics g)
	{
		g.drawOval(30, 30, 110, 114);
		g.drawOval(47, 65, 20, 10);
		g.drawOval(100, 65, 20, 10);
		g.fillOval(68, 81, 10, 110);
		g.fillOval(121, 81, 10, 10);
		g.drawOval(85,100, 30, 30);
		g.fillArc(60, 125, 80, 140, 180, 180);
		g.drawOval(25, 92, 15, 30);
		g.drawOval(160, 92, 15, 30);
	}

}
