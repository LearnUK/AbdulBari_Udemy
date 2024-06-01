import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

public class _142_CharArrayReader {
    public static void main(String[] args) throws Exception{
        char c[] = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr1 = new CharArrayReader(c);
        int x;
        while((x=cr1.read())!=-1)
        {
            System.out.println((char) x);;
        }

        CharArrayReader cr2 = new CharArrayReader(c);
        String str2 = new String(String.valueOf(cr2.read(c)));
        System.out.println(str2);
       // System.out.println(str2.toUpperCase(c));

        cr1.close();
        cr2.close();
    }
}