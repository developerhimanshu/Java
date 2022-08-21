import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4;
    JTextField t1, t2, t3;
    JLabel l1, l2;

    public MyFrame(){
        super("Calculator");
        setLayout(new FlowLayout());
        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MUL");
        b4 = new JButton("MOD");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);
        l1 = new JLabel("Enter 2 Numbers:");
        l2 = new JLabel("Result");

        add(l1);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l2);
        add(t3);

        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        if(e.getSource()==b1){
            int value = num1 +num2;
            t3.setText(""+value);
        }
        if(e.getSource()==b2){
            int value = num1 -num2;
            t3.setText(""+value);
        }
        if(e.getSource()==b3){
            int value = num1 *num2;
            t3.setText(""+value);
        }
        if(e.getSource()==b4){
            int value = num1 %num2;
            t3.setText(""+value);
        }
    }
}

public class Calculator {
    public static void main(String []args){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
