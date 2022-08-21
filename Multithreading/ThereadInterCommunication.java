class Customer{
    int amount = 1000;
    void withdraw(int amount){
        synchronized(this){
            System.out.println("Going to withdraw...");
            if(this.amount<amount){
                System.out.println("Less balance; waiting for deposit...");
                try{wait();}catch(Exception e){System.out.println(e);}
            }
            this.amount-=amount;
            System.out.println("withdraw completed...");
        }
    }
    void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("Deposit Completed...");
        notify();
    }
}

class ThreadInterCommunication{
    public static void main(String []args){
        final Customer c = new Customer();
        new Thread(){
            public void run(){c.deposit(1000);}
        }.start();
    }
}