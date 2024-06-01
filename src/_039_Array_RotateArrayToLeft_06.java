import java.util.Scanner;

public class _039_Array_RotateArrayToLeft_06 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int temp = array1[0];
        System.out.println("Original Array is : ");
        for (int x : array1)
        {
            System.out.print(x+",");
        }
        System.out.println("");

        for (int i = 1; i < array1.length; i++)
        {
            array1[i-1] = array1[i];
        }
            array1[array1.length-1] = temp;
        System.out.println("Array after Left Rotation is :");
        for (int x : array1)
        {
            System.out.print(x+",");
        }
    }
}