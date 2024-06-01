import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class _141_ByteArrayOutputStream {
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream bos1 = new ByteArrayOutputStream(20);
        bos1.write('a');
        bos1.write('b');
        bos1.write('c');
        bos1.write('d');
        byte b[] = bos1.toByteArray();
        for(byte x:b) {
            System.out.println(x+" "+(char)x);
        }
        bos1.writeTo(new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\ByteOutputStream.txt"));
        bos1.close();
    }
}