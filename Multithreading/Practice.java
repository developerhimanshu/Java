/* 
class ThreadSleep1 extends Thread{
    public void run(){
        for(int i=1; i<5; i++)
        {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
*/
/* 
class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Inside the run() method");
    }

}
*/

class MyData{
    int value; 
    boolean flag = true;
     synchronized public void set(int v){
        while(flag!=true){
            try{ wait(); }catch(Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }
     synchronized public int get(){
        int x=1;
    
        while(flag!=false){
            try{
                wait();
            }catch(Exception e){System.out.println(e);}

        }
        x=value;
        flag=true;
        notify();
        return x;
    }

}

class Producer extends Thread{
    MyData d;
    public Producer(MyData dat){d = dat;}
    public void run(){
    int i=1;
    while(true)
    {
        d.set(i);
        System.out.println("producer : "+i);
        i++;
    } 
}
}

class Consumer extends Thread{
    MyData d;
    public Consumer(MyData dat){d = dat;}
    public void run()
    {
        int value;
        while(true){
            value = d.get();
            System.out.println("consumer: "+value);
        }
    }
}

public class Practice {
    public static void main(String[] args) {
       MyData d = new MyData();
       Producer p = new Producer(d);
       Consumer c = new Consumer(d);
       p.start();
       c.start();
    }
}
