import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _133_FileOutputStream_01 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos1 = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream1.txt");
            String str1 = "Java";
            fos1.write(str1.getBytes());
            fos1.close();
            System.out.println("Text written to the file");

            FileOutputStream fos2 = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream2.txt");
            String str2 = "Learn Java Programming";
            byte b2[] = str2.getBytes();
            for(byte x:b2) {
                fos2.write(x);
            }
            fos2.close();
            System.out.println("Text written to the file");

            FileOutputStream fos3 = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream3.txt");
            String str3 = "Learn Java Programming";
            byte b3[] = str2.getBytes();
            fos3.write(b3, 6, str3.length()-6);
            fos3.close();
            System.out.println("Text written to the file");
        }
       catch (FileNotFoundException e){
           System.out.println(e);
       } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
