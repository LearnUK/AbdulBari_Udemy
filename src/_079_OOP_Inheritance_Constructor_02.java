class parent{
    parent(){
        System.out.println("Parent Constructor");
    }
}
class child extends parent{
    child(){
        System.out.println("Child Constructor");
    }
}
class grandChild extends child{
    grandChild(){
        System.out.println("GrandChild Constructor");
    }
}
public class _079_OOP_Inheritance_Constructor_02 {
    public static void main(String[] args) {
        grandChild gc = new grandChild();
    }
}
