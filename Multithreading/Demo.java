class Customer{
    int bal =1000;
    public synchronized void withdraw(int amt){
        System.out.println("Going to withdraw...");
        if(bal<amt){
            System.out.println("The balance is low please weight for the next thread....");
            try{
                wait();
            }catch(Exception e){System.out.println(e);}
        }
        bal -=amt;
        System.out.println("withdrawl successfull... Balance remaining: "+bal);
    }
    public synchronized void deposit(int amt){
        System.out.println("Going to deposit");
        bal+=amt;
        System.out.println("Balance Deposited...Toal balance is: "+bal);
        notify();
    }
}

class MyThread1 extends Thread{
    Customer c;
   MyThread1(Customer c){
        this.c = c;
    }
    public void run(){
        c.withdraw(1500);
    }
}

class MyThread2 extends Thread{
    Customer c;
     MyThread2(Customer c){
        this.c = c;
    }
    public void run(){
        c.deposit(1000);
    }
}
public class Demo {
    public static void main(String[] args) {
        Customer c = new Customer();
        MyThread1 t1 = new MyThread1(c);
        t1.start();
        MyThread2 t2 = new MyThread2(c);
        t2.start();
    }
}
