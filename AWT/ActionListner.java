
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;


class MyFrame extends Frame implements ActionListener{
    int count =0;
    Label l;
    Button b;
    MyFrame()
    {
        super("Button Demo");
        l  =new Label(" "+count);
        b = new Button("click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);

    }
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText(" "+count);
    }
}
public class ActionListner{
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 500);
        f.setVisible(true);
    }
}
