import java.util.Scanner;

public class _040_Array_RotateArrayToRight_07 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int temp = array1[array1.length-1];
        System.out.println("Original Array is : ");
        for (int x : array1)
        {
            System.out.print(x+",");
        }
        System.out.println("");

        for (int i = array1.length-1; i>0; i--)
        {
            array1[i] = array1[i-1];
        }
            array1[0] = temp;
        System.out.println("Array after right Rotation is :");
        for (int x : array1)
        {
            System.out.print(x+",");
        }
    }
}