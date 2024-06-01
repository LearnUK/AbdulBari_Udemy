
    class Super_overriding{
        public void display(){
            System.out.println("Hello from Super Class.");
        }
        public void display1(){
            System.out.println("Hello from Super Class - Display1.");
        }
    }
    class sub_overriding extends Super_overriding{
    @Override
    public void display(){
            System.out.println("Hello from Sub Class.");
        }
        public void display1(int x){
            System.out.println("Hello from Super Class - Display1.");
        }
    }
    public class _085_MethodOveRriding {
    public static void main(String[] args) {
        Super_overriding sup = new Super_overriding();
        sup.display();
        System.out.println("");
        sub_overriding sub = new sub_overriding();
        sub.display();
        System.out.println("============================");
        sup.display1();
        System.out.println("");
        sub.display1();
    }
}