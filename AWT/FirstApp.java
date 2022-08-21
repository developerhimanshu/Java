import java.awt.*;
class FirstApp{
    public static void main(String []args){
      Frame f = new Frame("my App");
      f.setLayout(new FlowLayout());
      Button b = new Button("click");
      Label l = new Label("Name");
      TextField t = new TextField(20);
      f.add(b);
      f.add(l);
      f.add(t);



      f.setSize(300, 300);
      f.setVisible(true);

        }

    }