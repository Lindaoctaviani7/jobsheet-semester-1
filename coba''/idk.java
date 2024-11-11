public class idk {
    public static void public static void main(String[] args) {
        
    }
    import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class nganu extends JPanel implements ActionListener{
    private double angle = 0;  
    private Timer timer;

    public nganu() {
        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(centerX - 20, centerY - 20, 40, 40);
        
        g2d.setColor(Color.PINK);
        
        for (int i = 0; i < 6; i++) {
            g2d.rotate(Math.toRadians(angle + i * 60), centerX, centerY);
            g2d.fillOval(centerX - 10, centerY - 80, 20, 60);  
            g2d.rotate(Math.toRadians(-(angle + i * 60)), centerX, centerY);
        }
        
        g2d.setColor(Color.GREEN);
        g2d.fillRect(centerX - 5, centerY + 20, 10, 100); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angle += 2;  
        repaint();  
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bunga");
        nganu flower = new nganu();

        frame.add(flower);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
}
