import java.awt.*;

class MyFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    MyFrame(){
        super("Flow Layout");
        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");
        // setLayout(new FlowLayout());
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(100);
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class FlowLayoutpractice{
    public static void main(String args[]){
            MyFrame f = new MyFrame();
            f.setSize(500, 500);
            f.setVisible(true);
    }
}

