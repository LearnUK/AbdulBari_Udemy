public class _086_DynamicMethodDispatch {
    static class Super_DynamicMethodDispatch{
        public void display(){
            System.out.println("Hello from Super Class.");
        }
    }
    static class Sub_DynamicMethodDispatch extends Super_DynamicMethodDispatch{
        @Override
        public void display(){
            System.out.println("Hello from Sub Class.");
        }
    }

    public static void main(String[] args) {
        Super_DynamicMethodDispatch sup = new Sub_DynamicMethodDispatch();
        sup.display();
    }
}