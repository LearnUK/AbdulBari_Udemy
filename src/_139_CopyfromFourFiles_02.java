import java.io.*;

public class _139_CopyfromFourFiles_02 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream2.txt");
        FileInputStream fis3 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream3.txt");
        FileInputStream fis4 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\Destination_Four_Files_02.txt");
        SequenceInputStream sis1 = new SequenceInputStream(fis1, fis2);
        SequenceInputStream sis2 = new SequenceInputStream(fis3, fis4);
        SequenceInputStream sis = new SequenceInputStream(sis1, sis2);

        int b=sis.read();
        while((b=sis.read())!=-1)
        {
            fos.write(b);
        }
        fis1.close();
        fis2.close();
        fis3.close();
        fis4.close();
        fos.close();
        sis1.close();
        sis2.close();
        sis.close();
    }
}