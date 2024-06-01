class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension of Rectangle cannot be NEGATIVE";
    }
}
public class _104_OwnException_ThrowAndThrows {
    static int area(int l, int b) throws NegativeDimensionException {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException {
            System.out.println("Area is : "+area(10,-5));
    }
    public static void main(String[] args) {
        try {
            meth1();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
