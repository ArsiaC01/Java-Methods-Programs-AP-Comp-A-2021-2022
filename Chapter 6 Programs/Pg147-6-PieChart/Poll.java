// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
import java.awt.*;
import javax.swing.*;

public class Poll extends JFrame
{
  public Poll()
  {
	
    super("Vote for Tami, Brian, or Liz");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    PollDisplayPanel chart = new PollDisplayPanel("Tami", "Brian", "Liz");
    PollControlPanel controls = new PollControlPanel(chart);
    c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args)
  {
	
      Poll w = new Poll();
      w.setBounds(300, 300, 400, 400);
      w.setDefaultCloseOperation(EXIT_ON_CLOSE);
      w.setVisible(true);
	 
      /*
	  PollDisplayPanel votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");
	  votingMachine.vote1();
	  votingMachine.vote2();
	  votingMachine.vote2();
	  System.out.println(votingMachine);
	  */
  }
}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.