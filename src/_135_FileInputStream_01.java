import java.io.FileInputStream;

public class _135_FileInputStream_01 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis1 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt")){
            byte b[] = new byte[fis1.available()];
            fis1.read(b);
            String str = new String(b);
            System.out.println(str);
        }
        System.out.println("=====================");
        try(FileInputStream fis2 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt")){
           int x;
            do{
                x =fis2.read();
                if(x!=-1){
                    System.out.print((char)x);
                }
            }while(x!=-1);
            System.out.println("");
        }
        System.out.println("=====================");
        try(FileInputStream fis3 = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\FileOutPutStream4.txt")){
            int y;
            while((y= fis3.read())!=-1){
                    System.out.print((char)y);
                }
            }
        System.out.println("");
        System.out.println("=====================");
        }
    }
