enum Dept{
    CS,IT,CIVIL,ECE,MECH
}
enum Dept1{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");

    String head;
    String location;

    private Dept1(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }

}
public class _128_Enum_Class {
    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println("ordinal : "+d.ordinal());
        System.out.println("getClass : "+d.getClass());
        System.out.println("name : "+d.name());
        System.out.println("String : "+d.toString());
        Dept list[] = Dept.values();
        System.out.println("Length of list : "+list.length);
        for (Dept x:list) {
            System.out.println(x);
        }
        System.out.println(list.getClass());
        System.out.println("======");

        Dept1 d1=Dept1.CS;
        System.out.println(d1.getHeadName());
        System.out.println(d1.getLocation());
    }
}
