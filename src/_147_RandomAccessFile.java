import java.io.IOException;
import java.io.RandomAccessFile;

public class _147_RandomAccessFile {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\RandomAccessFile.txt","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()-12);
        System.out.println(rf.getFilePointer());
    }
}
