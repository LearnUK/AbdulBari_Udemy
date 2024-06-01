public class _049_Array_DisplayTewDimensional_02 {
    public static void main(String[] args)
    {
        int array1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Length of Array1 is : "+array1.length);
        System.out.println("Displaying Array1");
        for (int i=0; i<array1.length; i++)
        {
            for (int j=0; j<array1[0].length;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}