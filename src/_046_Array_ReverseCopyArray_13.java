import java.util.Scanner;

public class _046_Array_ReverseCopyArray_13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[10];
        System.out.println("Length of Array1 is "+array1.length);
        System.out.println("Original Num Array1 is : ");
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
        for (int i=array1.length-1, j=0; i>=0; i--,j++)
        {
            array2[j] = array1[i];
        }
       System.out.println("Reverse of Array2 is :");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
    }
}