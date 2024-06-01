import java.io.*;

public class _152_DataInputStream_Read_01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\DatOutputStreamExample1.txt");
        DataInputStream di = new DataInputStream(fis);

        StudentPrint s = new StudentPrint();
        s.rollNo = di.readInt();
        s.name = di.readUTF();
        s.dept = di.readUTF();

        System.out.println("Roll No : "+s.rollNo);
        System.out.println("Name : "+s.name);
        System.out.println("Dept : "+s.dept);

    }
}
