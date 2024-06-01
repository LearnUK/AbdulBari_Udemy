import java.util.Scanner;

public class _043_Array_DeleteElementFromArray_10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        array1[0]=5; array1[1]=9; array1[2]=6; array1[3]=10; array1[4]=12; array1[5]=7;

        int index=3;
        int n=5;

        System.out.println("Original Array is : ");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
        System.out.println("");
        for (int i = index+1; i < array1.length; i++)
        {
            array1[i-1] = array1[i];
        }
       System.out.println("Array after Deleting Element is :");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
    }
}