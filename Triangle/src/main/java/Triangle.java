import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangle extends JPanel {

    private int x = 250;
    private int y = 200;

    private boolean dragging = false;
    private int offsetX;
    private int offsetY;

    public Triangle() {

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (isInsideTriangle(e.getX(), e.getY())) {
                    dragging = true;
                    offsetX = e.getX() - x;
                    offsetY = e.getY() - y;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragging = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragging) {
                    x = e.getX() - offsetX;
                    y = e.getY() - offsetY;
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] xPoints = {x, x - 60, x + 60};
        int[] yPoints = {y - 60, y + 60, y + 60};

        g.drawPolygon(xPoints, yPoints, 3);
    }

    private boolean isInsideTriangle(int mouseX, int mouseY) {

        Polygon triangle = new Polygon(
                new int[]{x, x - 60, x + 60},
                new int[]{y - 60, y + 60, y + 60},
                3
        );

        return triangle.contains(mouseX, mouseY);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("CSC 360 - Triangle");

        Triangle triangle = new Triangle();

        frame.add(triangle);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}