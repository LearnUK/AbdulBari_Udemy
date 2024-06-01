
class MyArray<T>{
    T A[]= (T[]) new Object[10];
    int length =0;

    public void append(T v){
        A[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class _160_Generic_Array<T> {

    public static <E> void show(E[] list){
        for(E x: list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyArray<Integer> ma1 = new MyArray<>();
        ma1.append(10);
        ma1.append(20);
        ma1.append(30);
        ma1.display();
        System.out.println("==================");

        MyArray<String> ma2 = new MyArray<>();
        ma2.append("Hi");
        ma2.append("Hello");
        ma2.append("Welcome");
        ma2.display();
        System.out.println("==================");

        MyArray ma3 = new MyArray<>();
        ma3.append(10);
        ma3.append("Hello");
        ma3.append(30);
        ma3.display();

        show(new String[]{"Hi","Hello","Bye"});
        show(new Integer[]{10,20,30,40});
     }
}
