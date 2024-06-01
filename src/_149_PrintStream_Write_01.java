import java.io.*;

class StudentPrint {
    int rollNo;
    String name;
    String dept;
}

public class _149_PrintStream_Write_01 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\PrintStreamExample1.txt");
        PrintStream ps = new PrintStream(fos);

        StudentPrint s = new StudentPrint();
        s.rollNo =10;
        s.name = "John";
        s.dept = "CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

    }
}
