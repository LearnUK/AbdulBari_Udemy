import java.io.*;

public class _150_PrintStream_Read_01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\PrintStreamExample1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        StudentPrint s = new StudentPrint();
        s.rollNo = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Roll No : "+s.rollNo);
        System.out.println("Name : "+s.name);
        System.out.println("Dept : "+s.dept);

    }
}
