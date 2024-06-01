public class _050_Array_CreateTewDimensionalJaggedArray_04 {
    public static void main(String[] args)
    {
        int array1[][];
        array1 = new int[3][];
        array1[0] = new int[2];
        array1[1] = new int[4];
        array1[2] = new int[3];
        System.out.println("Length of Array1 is "+array1.length);
        System.out.println("Length of Array[0] is "+array1[0].length);
        System.out.println("Length of Array1 is "+array1[1].length);
        System.out.println("Length of Array1 is "+array1[2].length);
        //x[] is taking Reference from Array1
        for (int x[] : array1)
        {
            //y is taking Element from x
            for (int y : x)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}