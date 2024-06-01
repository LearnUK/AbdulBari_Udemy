class CoffeeMachine_Singleton {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    static private CoffeeMachine_Singleton my = null;
    static int counter = 0;

    private CoffeeMachine_Singleton() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.50f;
    }

    static CoffeeMachine_Singleton getInstance() {
            if (my == null)
                my = new CoffeeMachine_Singleton();
        return my;
    }
}
public class _098_SingletonClass_01 {
    public static void main(String[] args) {
        CoffeeMachine_Singleton c1 = CoffeeMachine_Singleton.getInstance();
        CoffeeMachine_Singleton c2 = CoffeeMachine_Singleton.getInstance();
        CoffeeMachine_Singleton c3 = CoffeeMachine_Singleton.getInstance();
        CoffeeMachine_Singleton c4 = CoffeeMachine_Singleton.getInstance();

        System.out.println(c1+" "+c2+" "+c3+" "+c4);
        if (c1==c2 && c1==c3)
            System.out.println("Same");
    }
}