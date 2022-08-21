import java.util.*;

public class DivideTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try{
            System.out.println("Successfull division: result is: "+(x/y));

        }catch(ArithmeticException ae){
            System.out.println("Avoid division by zero "); 
        }
    }
    
}
