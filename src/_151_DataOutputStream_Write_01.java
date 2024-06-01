import java.io.*;

public class _151_DataOutputStream_Write_01 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\DatOutputStreamExample1.txt");
        DataOutputStream d = new DataOutputStream(fos);

        StudentPrint s = new StudentPrint();
        s.rollNo =10;
        s.name = "John";
        s.dept = "CSE";

        d.writeInt(s.rollNo);
        d.writeUTF(s.name);
        d.writeUTF(s.dept);
    }
}
