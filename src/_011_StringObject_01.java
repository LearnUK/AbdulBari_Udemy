public class _011_StringObject_01
{
    public static void main(String[] args)
    {
        // String coming out of char Array
        char c[] = {'A','B','C','D'};
        System.out.println(c);
        String str1 = new String(c);/// String(char [])
        System.out.println(str1);

        // String coming out of byte Array
        byte b[] ={65,66,67,68};
        //System.out.println(((char) b));
        String str2 = new String(b);
        System.out.println(str2);

        // String coming out of String Array
        String str3 = new String("Java");
        System.out.println(str3);

        String str4 = "Java";
        System.out.println(str4);
    }
}
