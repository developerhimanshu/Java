class OddEven {
    boolean odd =true;
    int count = 1;
    synchronized public void printOdd(){
        while(!odd){
            System.out.println("Waiting for even: ");
            try{wait();}catch(Exception e){}
        }
        System.out.println("odd Thread: "+count);
        count++;
        odd = false;
        notify();
    }

    synchronized public void printEven(){
        while(odd){
            System.out.println("Waiting for Odd: ");
            try{wait();}catch(Exception e){}
        }
        System.out.println("Even Thread: "+count);
        count++;
        odd = true;
        notify();

    }
}

class Odd extends Thread{
    OddEven oe;
    int x;
     public Odd(OddEven o, int t){
        oe = o;
        x   = t;
     }
    public void run(){
        int i=0;
        while(i<x){
            oe.printOdd();
            i++;
        }
     }
     
}
class Even extends Thread{
    OddEven oe;
    int x; 
     public Even(OddEven o, int p){
        oe = o;
        x = p;
     }
     public void run(){
        int i = 0;
        while(i<x){
            oe.printEven();i++;
        }
     }
}

public class OddEven1{
    public static void main(String args[]){
        OddEven oe = new OddEven();
        Odd o = new Odd(oe, 20);
        Even e = new Even(oe, 20);
        o.start();
        e.start();
    }

}