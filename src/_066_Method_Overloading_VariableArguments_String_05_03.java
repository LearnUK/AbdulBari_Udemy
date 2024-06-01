public class _066_Method_Overloading_VariableArguments_String_05_03 {
    static void showList(String ...s)
    {
        for (int i=0; i<s.length; i++)
        {
            System.out.println(i+". "+s[i]);
        }
    }

    public static void main(String[] args) {
        showList("John","Smith","Raj","Roy");

    }
}