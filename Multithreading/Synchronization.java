class MyThread1 extends Thread {
    Mydata d;

    MyThread1(Mydata dt) {
        d = dt;
    }

    public void run() {
        d.display("Hello World");
    }
}

class MyThread2 extends Thread {
    Mydata d;

    MyThread2(Mydata data) {
        d = data;
    }

    public void run() {
        d.display("Welcome");
    }
}

class Mydata {

   void display(String str){
        synchronized(this){
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}
}

public class Synchronization {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        MyThread1 t = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t.start();
        t2.start();
    }
}
