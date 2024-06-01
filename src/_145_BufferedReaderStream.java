import java.io.*;

public class _145_BufferedReaderStream {
    public static void main(String[] args) throws IOException {
        FileReader fis1 = new FileReader("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\BufferedInputString.txt");
        BufferedReader bis1 = new BufferedReader(fis1);

        int x;
        while((x= bis1.read())!=-1)
        {
            System.out.print((char) x);
        }
        fis1.close();
        bis1.close();

        FileReader fis2 = new FileReader("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\BufferedInputString.txt");
        BufferedReader bis2 = new BufferedReader(fis2);
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
        System.out.println(" "+"String : "+bis2.readLine());

    }
}