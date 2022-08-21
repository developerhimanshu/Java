// import java.lang.*;
class myThread extends Thread{
    public void run()
    {
        int i=1; 
        while(true){
            System.out.println(i+" Hello");
            i++;
            if(i==100)break;
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        myThread m = new myThread();
        m.start();
        int i;
        i=1;
        while(true){
            System.out.println(i+" world");
            i++;
            if(i==100)break;
        }    
    }
    
}
