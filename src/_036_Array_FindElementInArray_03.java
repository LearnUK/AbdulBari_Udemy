import java.util.Scanner;

public class _036_Array_FindElementInArray_03
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2,9,6,4,7,33,4};
        System.out.println("Element in Array are "+ array);
        System.out.print("Enter the number to search in Array : ");
        int find= sc.nextInt();
        for(int i = 0; i< array.length; i++)
        {
            if(array[i]==find) {
                System.out.println("Element " +find+ " is found in Array at index " + i);
                System.exit(0);//break;
            }
//            else {
//                System.out.println("Element "+find+" is not available in Array");
//                break;
//            }
        }
        System.out.println("Element "+find+" is not available in Array");
    }
}