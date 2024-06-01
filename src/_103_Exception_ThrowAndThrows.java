public class _103_Exception_ThrowAndThrows {
    static int area(int l, int b) throws Exception {
        if(l<0 || b<0)
            throw new Exception("Length or Breadth can not be negative");
        int a = l*b;
        return a;
    }
    static void meth1(){
        try {
            System.out.println("Area is : "+area(10,5));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        meth1();
    }
}
