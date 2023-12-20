
import java.awt.*;
import javax.swing.*;

class ShapePanel extends JPanel {
    String shape = "";
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        switch (shape) {
            case "Circle":
                g2d.drawOval(5, 10, 150, 150);
                g2d.drawLine(75, 85, 154, 85);
                break;
            case "Rectangle":
                g2d.drawRect(5, 45, 180, 90);
                break;
            case "Square":
                 g2d.drawRect(10, 10, 150, 150);
                 break;
        }
    }
public void setShape(String shape) {
        this.shape = shape;
        repaint();
    }
}
