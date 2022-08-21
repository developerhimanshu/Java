public class ExceptionDemo {
    
    public static void main(String[] args) {
       int a, b, c;
        try{
            a = 10; b=0;

            c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            // System.out.println("Denominator can't be zero!");
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
 