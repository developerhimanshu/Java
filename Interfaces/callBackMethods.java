class Store{
    Member mem[]= new Member[100];
    int count=0;
    void register(Member m){
        mem[count++]=m;
    }
    void inviteSale(){
        for(int i=0; i<count; i++)
        {
            mem[i].callBack();
        }
    }
}
interface Member{
    void callBack();
}
class Customer implements Member{
    String name;
    Customer(String n){
        name = n;
    }
    public void callBack(){System.out.println("Ok, I'll visit "+name);}
}
public class callBackMethods {
    public static void main(String []args){
        Store s = new Store();
        Customer c1 = new Customer("Himanshu");
        Customer c2 = new Customer("Karna");
        Customer c3 = new Customer("John");
        s.register(c1);
        s.register(c2);
        c1.callBack();
        c2.callBack();
        c3.callBack();

    }    
}
