// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  private final Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();
    int height = getHeight();
    int xCenter = width/2, yCenter = (3*height)/4;
 
    int largeRadius = width / 4;
    int smallRadius = height / 4;
    int mediumRadius = (int)Math.sqrt(smallRadius * largeRadius);
    int skyRadius = largeRadius - 3 * mediumRadius + 3  * smallRadius;

    g.setColor(Color.RED);
    g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);

    g.setColor(Color.GREEN);
    g.fillArc( xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius * 2, mediumRadius * 2, 0, 180 );
    
    g.setColor(Color.MAGENTA);
    g.fillArc( xCenter - smallRadius, yCenter - smallRadius, smallRadius * 2, smallRadius * 2, 0, 180 );
    
    g.setColor(Color.CYAN);
    g.fillArc( xCenter - skyRadius, yCenter - skyRadius, skyRadius * 2, skyRadius * 2, 0, 180 );

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}