import java.io.*;
import java.io.RandomAccessFile;

public class _148_FileClass {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy");
        System.out.println(f.isDirectory());
        String ListOfFiles[] = f.list();
        for(String x : ListOfFiles) {
            System.out.println(x+" "+f.getPath());
        }

        File FileList[] = f.listFiles();
        for(File y : FileList) {
            System.out.println(y.getName());
        }

    }
}
