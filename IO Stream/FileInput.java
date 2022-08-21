import java.io.*;
public class FileInput {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("test.txt");
            // byte b[] = new byte[fis.available()];
            // fis.read(b);
            // String str = new String(b);
            // // System.out.println(str);


            int x;
            do{
                x=fis.read();
                if(x!=-1)
                    System.out.print((char)x);
            }while(x!=-1);
            fis.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
