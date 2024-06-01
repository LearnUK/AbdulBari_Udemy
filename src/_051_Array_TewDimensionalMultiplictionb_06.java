public class _051_Array_TewDimensionalMultiplictionb_06 {
    public static void main(String[] args)
    {
        int array1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int array2[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
        int array3[][] = new int[3][3];

        for (int i=0; i<3;i++)
        {
            for (int j=0; j<3;j++)
            {
                array3[i][j]=0;
                for (int k=0; k<3;k++)
                {
                    array3[i][j]= array3[i][j] + array1[i][k] * array2[k][j];
                }
            }
        }
        for (int x[] : array3)
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