public class _035_Array_SumOfArrayElement_02
{
    public static void main(String[] args) {

    int[] array = {10,20,30,40,50};
    //Array For Loop
        int sum = 0;
        int sum1 = 0;
        for(int i=0; i<array.length; i++)
    {
        System.out.println("Element index "+i+" in Array is : "+array[i]);
        sum = sum + array[i];
    }
        System.out.println("Sum of All the elements in Array is : "+sum);
        System.out.println("");
    //Array For Each Loop
        for (int x : array)
        {
            System.out.println("Element of Array is : "+x);
            sum1 = sum1 + x;
        }
        System.out.println("Sum of All the elements in Array is : "+sum1);
    }
}