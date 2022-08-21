import java.awt.*;

class Main extends Frame{
  Label l;
  Button b;
  TextField tf;
  public Main(){
    super("New Program");
    setLayout(new FlowLayout());
    l = new Label("Name");
    tf = new TextField(30);
    b = new Button("OK");
    add(l);
    add(tf);
    add(b);
  }
  public static void main(String[] args) {
      Main f = new Main();
      f.setSize(400, 500);
      f.setVisible(true);
  }

}