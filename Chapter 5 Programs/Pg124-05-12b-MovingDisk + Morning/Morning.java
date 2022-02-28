// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame implements ActionListener
{
  private EasySound rooster;
  private int time;
  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    
    time = 0;
    Timer clock = new Timer(30, this); 
    clock.start();
  }
  
  public void actionPerformed(ActionEvent e)
  {
    time++;
    if ((time % 50) == 0)
    	rooster.play();
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