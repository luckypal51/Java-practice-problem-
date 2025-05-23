package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EquationPlotter extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.MAGENTA);
        g2.setStroke(new BasicStroke(1));

        int w = getWidth();
        int h = getHeight();

        // Translate origin to center
        g2.translate( w/2,  w/2);

        // Scale to make it fit nicely
        double scale = 100;

        for (double t = 0; t <= 12 * Math.PI; t += 0.01) {
            double v = Math.exp(Math.cos(t)) - 2 * Math.cos(4 * t) - Math.pow(Math.sin(t / 12), 5);
            double x = Math.sin(t) * v;
            double y = Math.cos(t) * v;

            int px = (int) (x * scale);
            int py = (int) (-y * scale);  // Flip y to make it upright

            g2.fill(new Ellipse2D.Double(px, py, 2, 2));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Equation Plotter: y = x²");
        EquationPlotter panel = new EquationPlotter();
        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

