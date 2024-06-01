import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _136_FileInputOutputExample_ReadWrite {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream5.txt");

        int b;
        while((b=fis.read())!=-1){
            if(b>=65 && b<=90) {
                fos.write(b+32);
            }
            else
                fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
