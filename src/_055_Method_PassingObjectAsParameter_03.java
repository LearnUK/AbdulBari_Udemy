import java.util.Scanner;

public class _055_Method_PassingObjectAsParameter_03 {

    static void update(int a[])
    {
        a[0] = 25;
    }

    public static void main(String[] args)
    {
        int A[] = {2,3,4,5};
        System.out.println("Array A before update is : ");
        for(int i=0; i<A.length; i++)
        {
            System.out.println(A[i]+ " ");
        }
        System.out.println("");
        update(A);
        System.out.println("Array A after update is : ");
        for(int i=0; i<A.length; i++)
        {
            System.out.println(A[i]+ " ");
        }
    }
}