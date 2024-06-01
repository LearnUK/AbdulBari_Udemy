public class _067_Method_Overloading_VariableArguments_MaximumNumber_05 {
    static int maxNumber(int...args)
    {
        System.out.println("");
        System.out.println("argument length: " + args.length);
        if(args.length==0)
        {
            return Integer.MIN_VALUE;
        }
        else{
            int max = args[0];
            for (int i=0; i<args.length; i++) {
                if(args[i]>max)
                    max = args[i];
            }
            return max;
        }
    }

    public static void main(String[] args) {

        int minimum = maxNumber();
        System.out.println("Minimum number is :" + minimum);

        int maximum = maxNumber(1, 3, 5);
        System.out.println("Maximum number is :" + maximum);
}
}