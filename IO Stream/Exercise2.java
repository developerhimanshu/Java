
//Read data from 2 files and append them into third file
import java.io.*;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("source1.txt");
            FileInputStream fis2 = new FileInputStream("Source2.txt");

            FileOutputStream fos = new FileOutputStream("destination.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int b;
            while ((b = sis.read()) != -1) {
                fos.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
