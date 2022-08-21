class Display{
    void wish(String name){
        System.out.println("hello");
        try{
            Thread.sleep(500);
            System.out.println(name);
        }catch(Exception e){System.out.println(e);}
    }
}

class MyThread1 extends Thread{
    Display d;
    String name;
    MyThread1(Display d, String name){
        this.d=d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

class MyThread2 extends Thread{
    Display d;
    String name;
    MyThread2(Display d, String name){
        this.d = d;
        this.name = name;
    }
    public void run()
    {
        d.wish(name);
    }
}

public class Hello {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread1 mt1 = new MyThread1(d, "Himanshu");
        mt1.start();
        MyThread2 mt2 = new MyThread2(d, "Sachin");
        mt2.start();
    }    
}
