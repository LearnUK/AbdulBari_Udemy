interface member_interface{
    void callback();
}
class customer_interface implements member_interface{
    String name;
    customer_interface(String n){
        name =n;
    }
    public void callback() {System.out.println("Ok, I will visit "+name);}
}
class store_interface {
    member_interface mem[] = new member_interface[100];
    int count =0;
    void register(member_interface m)
    {
        mem[count++]=m;}
    void inviteSale(){
        for(int i=0; i<count; i++){
            mem[i].callback();
        }
    }
}
public class _092_Interface_03 {
    public static void main(String[] args) {
        store_interface s = new store_interface();
        customer_interface c1 = new customer_interface("John");
        customer_interface c2 = new customer_interface("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
