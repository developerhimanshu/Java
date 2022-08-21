class Mythread extends Thread{
    public Mythread(String name){
        super(name);
        setPriority(Thread.NORM_PRIORITY); 
    }
    public void run(){
        int count =0;
        while(true){
            count++;
            System.out.println(count);
            try{

                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args)throws Exception {
        Mythread t = new Mythread("My Thread 1");
        System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        System.out.println("state "+t.getState());
        t.start();  
        t.interrupt();
    }    
}
