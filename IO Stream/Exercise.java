//have to write a program to copy the contents of one file to another
import java.io.*;
public class Exercise {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("source1.txt");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            fis.close();
            FileOutputStream fos = new FileOutputStream("source2.txt");
            String str2 = str.toLowerCase();
            fos.write(str2.getBytes());
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
}
