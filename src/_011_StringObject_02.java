public class _011_StringObject_02
{
    public static void main(String[] args)
    {
        String str1 = "Java"; // Literal "Java" is created in String POOL
        String str2 = "Java"; // Literal "Java" is created in String POOL
        String str3 = new String("Java"); // New object created in HEAP
        String str4 = new String("Java"); // New object created in HEAP

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str2==str3);
        System.out.println(str3==str4);

    }
}
