import com.sun.xml.internal.messaging.saaj.util.CharWriter;

import java.io.*;

public class _143_CharArrayOutputStream {
    public static void main(String[] args) throws Exception{
        CharArrayWriter cr1 = new CharArrayWriter(20);
        cr1.write('a');
        cr1.write('b');
        cr1.write('c');
        cr1.write('d');
        char c[] = cr1.toCharArray();
        for(char x:c) {
            System.out.println(x);
        }
        cr1.writeTo(new FileWriter("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\CharOutputStream.txt"));
        cr1.close();
    }
}