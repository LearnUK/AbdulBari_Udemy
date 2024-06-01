import java.io.*;

public class _140_ByteArrayInputStream {
    public static void main(String[] args) throws Exception{
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis1 = new ByteArrayInputStream(b);
        int x;
        while((x=bis1.read())!=-1)
        {
            System.out.println((char) x);;
        }
        bis1.close();
        ByteArrayInputStream bis2 = new ByteArrayInputStream(b);
        String str2 = new String(String.valueOf(bis2.read(b)));
        System.out.println(str2);
        System.out.println(bis2.markSupported());
    }
}