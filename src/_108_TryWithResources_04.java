import java.io.FileInputStream;
import java.util.Scanner;

public class _108_TryWithResources_04 {
    static FileInputStream fi;
    static Scanner sc;
    static void Divide() throws Exception {
        fi =new FileInputStream("C:/Users/jeetj/JavaProgramm/LearnJava_AbdulBari/TestFiles/Int.txt.txt");
       try{
           sc = new Scanner(fi);
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           System.out.println(a/c);
       }
        finally{
               fi.close();
               sc.close();
       }
    }
    public static void main(String[] args) throws Exception {
        try
        {
            Divide();
        }catch (Exception e){
            System.out.println(e);
        }
        int x = sc.nextInt();
        System.out.println(x);
    }
}
