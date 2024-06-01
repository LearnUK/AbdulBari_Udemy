public class _059_Method_FindGreatestElementInArray_01 {

    static int maxElement(int a[])
    {
        int max=a[0];
        for(int i=0; i< a.length;i++)
        {
            if(a[i] > max)
                max = a[i];
        }
        System.out.println("Maximum Element in Array is : "+max);
        return max;
    }

    public static void main(String[] args)
    {
        int A[] = {2,3,4,5,9,7};
        System.out.println("Element in Array A are : ");
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+ " ");
        }
        System.out.println("");
        maxElement(A);
    }
}