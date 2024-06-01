public class _063_Method_Overloading_ValidateMethod_04 {

    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }


    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args)
    {
        System.out.println(validate(9));
        System.out.println(validate("Test"));
    }
}