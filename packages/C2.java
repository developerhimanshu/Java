package p2;
import p1.*;
import java.util.*;
import java.io.*;

public class C2 implements I1{
    public int div(int a, int b){
        try{
            return (a/b);
        }catch(Exception e){System.out.println(e);};
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        C1 d = new C1();
        C2 f = new C2();

        System.out.println("Enter 2 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum of a and b: "+d.sum(a, b));
        System.out.println("Diff of a and b: "+d.sub(a, b));
        System.out.println("Division of a and b: "+f.div(a, b));
    }
}