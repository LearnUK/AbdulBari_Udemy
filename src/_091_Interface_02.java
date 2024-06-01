class Phone_concrete{
    void call(){System.out.println("Calling from Phone_concrete");}
    void sms(){System.out.println("SMS from Phone_concrete");}
}
interface Camera_interface{
    void click();
    void record();
}
interface music_interface{
    void play();
    void pause();
    void stop();
}
class SmartPhone_Interface extends Phone_concrete implements Camera_interface, music_interface{
    public void click() {System.out.println("Click from SmartPhone_Interface");}
    public void record() {System.out.println("Record from SmartPhone_Interface");}
    public void play() {System.out.println("Play from SmartPhone_Interface");}
    public void pause(){System.out.println("Pause from SmartPhone_Interface");}
    public void stop(){System.out.println("Stop from SmartPhone_Interface");}
    }
public class _091_Interface_02 {
    public static void main(String[] args) {
        SmartPhone_Interface s = new SmartPhone_Interface();
        s.call(); s.sms(); s.click(); s.record(); s.play(); s.pause(); s.stop();
        System.out.println("");

        Phone_concrete p = s;
        p.call(); p.sms();
        System.out.println("");

        Camera_interface c =s;
        c.click(); c.record();
        System.out.println("");

        music_interface m = s;
        m.pause(); m.play();m.stop();
    }

}
