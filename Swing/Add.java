import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyClass extends JFrame implements ActionListener {
    JButton b, b2;
    JTextField tf1, tf2, tf3;
    JLabel l1, l2;

    public MyClass() {
        super("Addition");
        setLayout(new FlowLayout());
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        b = new JButton("ADD");
        b2 = new JButton("SUB");
        l1 = new JLabel("Enter 2 numbers:");
        l2 = new JLabel("Result:");
        tf3 = new JTextField(5);
        add(l1);
        add(tf1);
        add(tf2);
        add(b);
        add(b2);
        add(l2);r5
        add(tf3);
        b2.addActionListener(this);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        if (e.getSource() == b) {
            int value = num1 + num2;
            tf3.setText("  " + value);

        }
        if (e.getSource() == b2) {
            int value = num1 - num2;
            tf3.setText("  " + value);

        }

    }

}

public class Add {
    public static void main(String[] args) {
        MyClass f = new MyClass();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
