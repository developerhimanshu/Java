import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCanvas extends Canvas{
    public MyCanvas()
    {
        setBackground(Color.gray);
        setSize(500, 500);
    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillOval(120, 120, 150, 150);
        g.setColor(Color.white);
        g.fillOval(160, 160, 15,15);
        g.fillOval(210, 160, 15, 15);
        g.drawArc(180, 210, 40, 40, 180, 180);
    }
}
class CanvasPractice extends JFrame{
    CanvasPractice()
    {
        JFrame f = new JFrame("Canvas Example");
        MyCanvas c = new MyCanvas();
        f.add(c);
        f.setLayout(null);
        f.setSize(800, 800);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new CanvasPractice();
    }
}