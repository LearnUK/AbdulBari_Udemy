import java.util.Scanner;

public class _041_Array_InsertElementInArray_08 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        array1[0] = 0; array1[1] = 1; array1[2] = 2; array1[3] = 3; array1[4] = 5; array1[5] = 6;        array1[6] = 7;
        //int temp = array1[array1.length-1];
        System.out.println("Original Array is : ");
        for (int x : array1)
        {
            System.out.print(x+",");
        }
        System.out.println("");
       for (int i=array1.length-1; i>0; i--)
       {
           if(i>=5)
           {
               array1[i] = array1[i-1];
           }
       }
        array1[4] = 4;
        System.out.println("Array after right Rotation is :");
        for (int x : array1)
        {
            System.out.print(x+",");
        }
    }
}