public class _126_WrapperClass_01 {
    public static void main(String[] args) {
        int a = 10;
        Integer b =a;
        int z = b;
        Integer c = Integer.valueOf(1);
        System.out.println(c);
        Integer d = Integer.valueOf("1");
        System.out.println(d);
        Integer e = Integer.valueOf("100",2);
        System.out.println(e);
        System.out.println("Byte value of b is "+b.byteValue());
        System.out.println("Hashcode value of b is "+b.hashCode());
        System.out.println(b.intValue());
        //System.out.println(b.);
        System.out.println(Integer.reverse(2));
    }
}
