class A extends Thread{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("From thread1 "+i);    
        }
    }
}
class B extends Thread{
    public void run()
    {
        for(int j=1; j<=10; j++)
        {
            System.out.println("From thread2 "+i);
        }
    }
}

class C extends Thread{
    public void run()
    {
        for(int k=1; k<=10; k++)
        {
            System.out.println("From thread3 "+i);
        }
    }
}
public class ConcurrentPrint {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        ob1.start();
        ob2.start();
        ob3.start();
    }
    
}
