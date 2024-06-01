import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _154_ObjectInputStream_Read_01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\ObjectOutputStreamExample1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        StudentDataStream s1 =(StudentDataStream)ois.readObject();
        System.out.println(s1);

        StudentDataStream s2 =(StudentDataStream)ois.readObject();
        System.out.println(s2);

    }
}
