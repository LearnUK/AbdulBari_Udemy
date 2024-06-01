public class _102_ExceptionHanding_MultipleCatchBlocks {
    public static void main(String[] args) {
        int A[] ={15,6,9,12,5,15,0};
        try{
            for(int i=0; i< A.length; i++){
                System.out.println(A[i]/A[i+1]);
            }
            System.out.println(A[10]);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
