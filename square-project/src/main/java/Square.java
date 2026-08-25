import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Square extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a square
        g.drawRect(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CSC 360 - Square");

        Square square = new Square();

        frame.add(square);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}