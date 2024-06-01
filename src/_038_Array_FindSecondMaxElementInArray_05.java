import java.util.Scanner;

public class _038_Array_FindSecondMaxElementInArray_05
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {2,9,6,4,7,33,4};
        int max1, max2;
        max1 = max2 = array1[1];
        for(int i=0; i<array1.length; i++)
        {
            if(array1[i]>max1) {
                max2 = max1;
                max1 = array1[i];
            }
            else if(array1[i]> max2 && array1[i]< max1) {
                max2 = array1[i];
            }
        }
        System.out.println("Max1 number in Array is "+max1+" and Max2 number is "+max2);
    }
}