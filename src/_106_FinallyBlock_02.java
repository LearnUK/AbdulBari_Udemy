public class _106_FinallyBlock_02 {
    static void meth1() throws Exception {
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Final Message");
        }
    }
    public static void main(String[] args) throws Exception {
        meth1();
    }
}
