import java.util.Arrays;

public class _052_Array_SortArray {
    public static void main(String[] args)
    {
        String array1[] = {"java","python","perl","c++","unix"};
        System.out.println("Printing Array1 before Sort");
        for (String x: array1)
        {
            System.out.println(x);
        }
        System.out.println("");

        System.out.println("Sorting Array1");
        Arrays.sort(array1);Arrays.sort(array1);
        for (String x: array1)
        {
            System.out.println(x);
        }
    }
}