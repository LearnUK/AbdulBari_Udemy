import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

public class _107_FinallyBlock_03 {
    static FileInputStream fi;
    static Scanner sc;
    static void Divide() throws Exception {
        fi =new FileInputStream("C:/Users/jeetj/JavaProgramm/LearnJava_AbdulBari/TestFiles/Int.txt.txt");
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/b);

        fi.close();
        sc.close();
    }
    public static void main(String[] args) throws Exception {
        Divide();
        int x = sc.nextInt();
        System.out.println(x);
    }
}
