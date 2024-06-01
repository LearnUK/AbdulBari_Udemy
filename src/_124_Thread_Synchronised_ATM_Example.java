class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " Checking ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }
    synchronized public void withdraw(String name,int amount) {
        System.out.print(name + " withdrawing ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);
    }
}
class CustomerSync1 extends Thread {
    String name;
    int amount;
    ATM atm;
    CustomerSync1(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class _124_Thread_Synchronised_ATM_Example {
    public static void main(String[] args) {
        ATM atm =new ATM();
        CustomerSync1 sc1 = new CustomerSync1("Smith", atm, 100);
        CustomerSync1 sc2 = new CustomerSync1("John", atm, 200);
        sc1.start();
        sc2.start();
    }
}
