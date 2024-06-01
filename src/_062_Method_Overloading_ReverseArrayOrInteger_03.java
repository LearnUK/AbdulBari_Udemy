public class _062_Method_Overloading_ReverseArrayOrInteger_03 {

    static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev = rev*10 + n%10;
              n = n/10;
        }
        return rev;
    }
    static int [] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length-1, j=0; i>=0; i--, j++)
        {
            B[j] = A[i];
            //System.out.print(B[j]+" ");
        }
        return B;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse(123456789));
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array a is :");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        //System.out.println(a);
        //System.out.println(reverse(a));
        int c[] = reverse(a);
        System.out.println("Reverse of Array a is :");
        for (int i=0; i<reverse(c).length; i++)
        {
            System.out.print(reverse(c[i])+" ");
        }

    }
}