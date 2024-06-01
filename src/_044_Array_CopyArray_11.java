import java.util.Scanner;

public class _044_Array_CopyArray_11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[10];

        System.out.println("Original Array1 is : ");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
        System.out.println("");

        System.out.println("Original Num Array2 is : ");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
        System.out.println("");

        for (int i = 0; i < array1.length; i++)
        {
            array2[i] = array1[i];
        }
       System.out.println("Array2 after Copy from Array1 is :");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
    }
}