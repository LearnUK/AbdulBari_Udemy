import java.util.Scanner;

public class _037_Array_FindSecondMaxElementInArray_04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {10,20,30,65,40,50,45};
        int max1 = array1[0];
        for(int i = 0; i< array1.length; i++)
        {
            if(array1[i]>max1)
            {
                max1 = array1[i];
            }
        }
        System.out.println("Maximum number in Array is : "+max1);
    }
}