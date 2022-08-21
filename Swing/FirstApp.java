// package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    JLabel l;
    JButton b;
    int count =0;
    MyFrame(){
        super("Swing Demo");
        setLayout(new FlowLayout());
        b = new JButton("Click");
        l = new JLabel("Clicked "+count +" times");
        add(l);
        add(b);
        add(new JButton("Cancel"));
        b.addActionListener(this);
        getRootPane().setDefaultButton(b);
    }
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("Clicked "+count+" Times");
    }
}

public class FirstApp {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
