import java.io.*;

public class _144_BufferedStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\BufferedInputString.txt");
        BufferedInputStream bis1 = new BufferedInputStream(fis1);

        int x;
        while((x= bis1.read())!=-1)
        {
            System.out.print((char) x);
        }
        fis1.close();
        bis1.close();

        FileInputStream fis2 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\BufferedInputString.txt");
        BufferedInputStream bis2 = new BufferedInputStream(fis2);
        System.out.println("");
        System.out.println("File : "+fis2.markSupported());
        System.out.println("Buffer : "+bis2.markSupported());

        System.out.print((char)bis2.read());
        System.out.print((char)bis2.read());
        bis2.mark(10);
        System.out.print((char)bis2.read());
        System.out.print((char)bis2.read());
        System.out.print((char)bis2.read());
        System.out.print((char)bis2.read());
        bis2.reset();
        System.out.print((char)bis2.read());
        System.out.print((char)bis2.read());
        System.out.println("");

        fis2.close();
        bis2.close();

    }
}