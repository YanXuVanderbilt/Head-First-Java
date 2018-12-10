import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    
    int red = (int) (Math.random() *255);
    int green = (int) (Math.random() * 255);
    int blue = (int) (Math.random() * 255);
    Color startColor = new Color (red, green, blue);
    
    red = (int) (Math.random() * 255);
    green = (int) (Math.random() * 255);
    blue = (int) (Math.random() * 255);
    Color andColor = new Color(red, green, blue);
    
    GradientPaint gradient = new GradientPaint (70,70,startColor,150,150, andColor);
    g2d.setPaint(gradient);
    g2d.fillOval(70,70,300,300);
   }
}
  
public class SimpleGui0 {
  public static void main (String[] args) {
    MyDrawPanel DrawPanel = new MyDrawPanel();
    JFrame frame = new JFrame();
    frame.getContentPane().add(DrawPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    frame.setVisible(true);
    }
}