import java.util.Scanner;

public class _042_Array_InsertElementInArray_09 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        array1[0]=5; array1[1]=9; array1[2]=6; array1[3]=10; array1[4]=12; array1[5]=7;

        int index =3;
        int n=6;
        int x = 15;

        System.out.println("Original Array is : ");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
        System.out.println("");
       for (int i=n; i>index; i--)
       {
            array1[i] = array1[i-1];
       }
       array1[index] = x;
       System.out.println("Array after right Rotation is :");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
    }
}