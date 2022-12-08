package gui;
import config.*;
import javax.swing.JLabel;
import java.awt.*;

//zeichnen der Gegenstände auf der Zeichenfläche
public class Draw extends JLabel{ 

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON ); 

        g.setColor(Color.BLACK);
        g.fillRect(Var.x, Var.y, 25, 25); 

        repaint();

    }
}
