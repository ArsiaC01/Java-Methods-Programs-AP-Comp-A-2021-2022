// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame implements ActionListener
{
  private EasySound rooster, cow;
  private int time, counter = 0;
  Color theColor = Color.WHITE;
  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    cow = new EasySound("moo.wav");

    Container c = getContentPane();
    
    time = 0;
    Timer clock = new Timer(30, this); 
    clock.start();
  }
  
  public void actionPerformed(ActionEvent e)
  {
    time++;
    Container c = getContentPane();

    if ((time % 50) == 0)
    {
    	if (theColor == Color.BLACK)
    	{
    		rooster.play();
            c.setBackground(Color.WHITE);
            theColor = Color.WHITE;
    	}
    	else
    	{
    		cow.play();
        	c.setBackground(Color.BLACK);
            theColor = Color.BLACK;
    	}
    }
    repaint();
    
  }

  public static void main(String args[])
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.