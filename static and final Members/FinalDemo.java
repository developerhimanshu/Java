final class Test{
    public final void show(){
        System.out.println("hello");
    }
}
// class Test1 extends Test{  Can't inherit final class
    // public void show();  We can't override final method from test
// }
public class FinalDemo {
    public static void main(String[]args){
        final float PI=3.1425f;
        System.out.println(PI);
    }
}
