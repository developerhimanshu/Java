import java.util.*;
class Atm{
    synchronized public void checkBalance(String name){
        System.out.print(name+" checking ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(" Balance");
    }
    synchronized public void withdraw(int amt, String name){
        System.out.print(name+" is withdrawing "+amt+" ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("amount");
    }
}
class Customer extends Thread{
        String name;
        int amt;
        Atm atm;
        Customer(String n, Atm a, int am){
            name = n;
            atm = a;
            amt = am;
        }
        void useAtm(){
            atm.checkBalance(name);
            atm.withdraw(amt, name);
        }
        public void run(){
            useAtm();
        }
}

public class Exercise {
    public static void main(String[] args) {
      Atm atm = new Atm();
      Customer c1 = new Customer("Smith", atm, 100);
      Customer c2 = new Customer("John", atm, 200);
      c1.start();
      c2.start();
    }
}
