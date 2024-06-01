public class _065_Method_Overloading_VariableArguments_SumOfElements05_01 {
    static int sumNumber(int... args) {
        System.out.println("");
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;

    }

    public static void main(String[] args) {
        int sum2 = sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}