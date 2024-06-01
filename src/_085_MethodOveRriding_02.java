
    class TV{
        public void switchON(){
            System.out.println("TV is Switched ON");
        }
        public void changeChannel(){
            System.out.println("TV channel is changed.");
        }
    }
    class SmartTV extends TV{
    @Override
    public void switchON(){
        System.out.println("Smart TV is Switched ON");
    }
    @Override
    public void changeChannel(){System.out.println("Smart TV channel is changed.");}
        public void browse(){System.out.println("Smart TV Browsing.");}
    }
    public class _085_MethodOveRriding_02 {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.switchON();
        tv1.changeChannel();
        System.out.println("");
        SmartTV Stv1 = new SmartTV();
        Stv1.switchON();
        Stv1.changeChannel();
        System.out.println("");
        TV tv2 = new SmartTV();
        tv2.switchON();
        tv2.changeChannel();
        System.out.println("");
    }
}