public class _056_Method_PassingObjectAsParameter_03_02 {

    static void change(int a[],int index, int value)
    {
        a[index] = value;
    }

    static void change2(int b, int value)
    {
        b = value;
        System.out.println("Value returned from Method change2 is : "+b);
    }

    public static void main(String[] args)
    {
        int A[] = {2,3,4,5,6,8,9};
        System.out.println("Array A before update is : ");
        for(int x:A)
        {
            System.out.print(x+ " ");
        }
        System.out.println("");
        change(A,3,99);
        System.out.println("Array A after update is : ");
        for(int x:A)
        {
            System.out.print(x+ " ");
        }
        System.out.println("");
        int B =10;
        change2(B,20);
        System.out.println("Value of B from Main Method is : "+B);
    }
}