    class maximum1{
        public int max(int a, int b){
            return a>b?a:b;
        }
        public int max(int a, int b, int c){
            if(a>b && a>c) return a;
            else if(b>c) return b;
            return c;
        }
    }
public class _087_Polymorphism_MethodOverloading {
    public static void main(String[] args) {
        maximum1 m1 = new maximum1();
        System.out.println(m1.max(10,20));
        maximum1 m2 = new maximum1();
        System.out.println(m2.max(10,30,20));
    }
}