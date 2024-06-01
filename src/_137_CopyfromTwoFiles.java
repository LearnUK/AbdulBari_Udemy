import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class _137_CopyfromTwoFiles {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream2.txt");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
}