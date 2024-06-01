
class Data1<T>{
    private T obj;
    public void setData(T v){
        obj =v;
    }
    public T getData(){
        return obj;
    }
}
public class _159_Generic_01<T> {

    public static void main(String[] args) {
        Data1<Integer> d1 = new Data1<Integer>();
        d1.setData(10);
        System.out.println(d1.getData());

        Data1<String> d2 = new Data1<String>();
        d2.setData("Hi");
        System.out.println(d2.getData());
    }
}
