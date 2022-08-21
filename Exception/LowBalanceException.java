import java.util.*;

class LowException extends Exception{
    public LowException(String message){
        super(message);
    }
}
class LowBalanceException{
    double balance;
    LowBalanceException(double balance){
        this.balance = balance;
    }

    void withdraw(double amt) throws LowException{
        if(amt>balance){
            throw new LowException("Insufficient Funds");
        }else{
         balance-=amt;
         System.out.println("Withdraw Completed...");   
         System.out.println("Balance is: "+balance);   
        }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LowBalanceException lb = new LowBalanceException(1000);
            try{
                double amt = sc.nextDouble();
                lb.withdraw(amt);
            }catch(LowException le){
                System.out.println(le.getMessage());
            }
        }
}