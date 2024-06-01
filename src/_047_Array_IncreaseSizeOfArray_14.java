public class _047_Array_IncreaseSizeOfArray_14 {
    public static void main(String[] args)
    {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[2*array1.length];
        System.out.println("Length of Array1 is "+array1.length);
        System.out.println("Length of Array2 is "+array2.length);
        System.out.println("Original Array1 is : ");
        for (int y : array1)
        {
            System.out.print(y+",");
        }
        System.out.println("");

        System.out.println("Original Array2 is : ");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
        System.out.println("");
        for (int i=0; i<array1.length-1; i++)
        {
            array2[i] = array1[i];
        }
       System.out.println("Array2 after copy from Array1 is :");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
        System.out.println("");
        array1=array2;
        System.out.println("Length of Array1 is "+array1.length);
        System.out.println("Array1 after copy from Array2 is : ");
        for (int y : array1)
        {
            System.out.print(y+",");
        }

        array2 =null;

        System.out.println("Length of Array2 after setting it to NULL is : "+array2.length);
        System.out.println("Array1 after copy from Array2 is : ");
        for (int y : array2)
        {
            System.out.print(y+",");
        }
    }
}