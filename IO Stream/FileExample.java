import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("test.txt");
            String str = "Learn Javat Programming";
            byte b[]=str.getBytes();

            // fos.write(b, 6, str.length()-10);  //write using offset
            // for(byte x:b)
                // fos.write(x); //This will wirte byte by byte
            // fos.write(str.getBytes());
            fos.write(b);
            fos.close();
        }
        catch(Exception e){}
    }

}
