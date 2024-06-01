import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _134_FileOutputStream_WithResources_02 {
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt")){
            String str = "Lets learn Java Programming";
            byte b[] = str.getBytes();
            fos.write(b);
    }
}}
