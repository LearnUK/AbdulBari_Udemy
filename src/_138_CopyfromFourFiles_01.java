import java.io.*;
import java.util.Vector;

public class _138_CopyfromFourFiles_01 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream2.txt");
        FileInputStream fis3 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream3.txt");
        FileInputStream fis4 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt");

        OutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\Destination_Four_Files_01.txt");

        Vector<InputStream> v = new Vector<>();
        v.add(fis1);
        v.add(fis2);
        v.add(fis3);
        v.add(fis4);
        InputStream sis = new SequenceInputStream(v.elements());

        int b;
        while((b=sis.read())!=-1)
        {
            fos.write(b);
        }
        sis.close();
        fis1.close();
        fis2.close();
        fis3.close();
        fis4.close();
        fos.close();
    }
}