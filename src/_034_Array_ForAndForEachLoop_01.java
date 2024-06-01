public class _034_Array_ForAndForEachLoop_01
{
    public static void main(String[] args)
    {
        int[] array1 = {10,20,30,40,50};
        //Array For Loop
        for(int i=0; i<array1.length; i++)
        {
            System.out.println("Element index "+i+" in Array is : "+array1[i]);
        }
        System.out.println("");
        //Array For Each Loop
        for (int x : array1)
        {
            System.out.println("Element of Array is : "+x);
        }
    }
}
