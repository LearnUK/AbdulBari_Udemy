class parent1{
    parent1(){
        System.out.println("Parent Constructor with no Parameter");
    }
    parent1(int i){
        System.out.println("Parent Constructor with Parameter "+i);
    }
}
class child1 extends parent1{
    child1(){
        System.out.println("Child Constructor with no Parameter");
    }
    child1(int j){
        //super(j);
        System.out.println("Child Constructor with Parameter "+j);
    }
    child1(int i, int j){
        super(i);
        System.out.println("Child Constructor with Parameter "+j);
    }
}

public class _080_OOP_Inheritance_ConstructorWithParameter_03 {
    public static void main(String[] args) {
        child1 c1 = new child1();
        System.out.println("");
        child1 c2 = new child1(10);
        System.out.println("");
        child1 c3 = new child1(10,20);
    }
}
