import java.util.Scanner;
public class _045_Array_ReverseCopyArray_12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[10];
        System.out.println("Length of Array1 is "+array1.length);
        System.out.println("Original Array1 is : ");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
        System.out.println("");

        System.out.println("Original Array2 is : ");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
        System.out.println("");
        for (int i=array1.length; i>0; i--)
        {
            array2[array1.length-i] = array1[i-1];
        }
       System.out.println("Reverse of Array2 is :");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
    }
}