public class _049_Array_DisplayTewDimensional_03 {
    public static void main(String[] args)
    {
        int array1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Length of Array1 is : "+array1.length);
        System.out.println("Displaying Array1");

        //x[] is taking Reference from Array1
        for (int x[] : array1)
        {
            //y is taking Element from x
            for (int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}