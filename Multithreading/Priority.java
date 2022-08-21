class A extends Thread{
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("From A: "+i+" ");
        }
    }
}   
class B extends Thread{
    public void run()
    {
        for(int j=1; j<=10; j++)
        {
            System.out.println("From B: "+j+" ");
        }
    }
}

class C extends Thread{
    public void run()
    {
        for(int k=1; k<=10; k++){
            System.out.println("From c: "+k+" ");
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("\nGetting Thread A Name: "+ a.getName());
        System.out.println("Getting Thread B Name:"+b.getName());
        System.out.println("Getting Thread C Name: "+c.getName());
        a.setName("Thread_1");
        b.setName("Thread_2");
        c.setName("Thread_3");

        System.out.println("\nGetting Thread A Name after setting: "+ a.getName());
        System.out.println("Getting Thread B Name after setting:"+b.getName());
        System.out.println("Getting Thread C Name after setting: "+c.getName());

        System.out.println("Getting Thread A priority: "+a.getPriority());
        System.out.println("Getting Thread B priority: "+b.getPriority());
        System.out.println("Getting Thread C priority: "+c.getPriority());

        a.setPriority(1);
        b.setPriority(9);
        c.setPriority(7);

        System.out.println("Getting Thread A priority after setting: "+a.getPriority());
        System.out.println("Getting Thread B priority after setting: "+b.getPriority());
        System.out.println("Getting Thread C priority after setting: "+c.getPriority());

    }    
}
