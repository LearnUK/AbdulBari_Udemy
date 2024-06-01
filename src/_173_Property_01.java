import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class _173_Property_01 {
    public static void main(String[] args) throws  Exception{
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor","i7");
        p.setProperty("OS","Windows11");
        p.setProperty("Model","Inspiron");
        p.store(new FileOutputStream("C:/Users/jeetj/JavaProgramm/AbdulBari_Udemy/UserOutput/property.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("C:/Users/jeetj/JavaProgramm/AbdulBari_Udemy/UserOutput/property.xml"), "Laptop");

        Properties pd = new Properties();
        pd.loadFromXML(new FileInputStream("C:/Users/jeetj/JavaProgramm/AbdulBari_Udemy/UserOutput/PersonalDetails.xml"));
        System.out.println(pd);
        System.out.println(pd.getProperty("Name"));
        System.out.println(pd.getProperty("Age"));
        System.out.println(pd.getProperty("Location"));
        System.out.println(pd.getProperty("Gender"));

        Properties pd1 = new Properties();
        pd1.load(new FileInputStream("C:/Users/jeetj/JavaProgramm/AbdulBari_Udemy/UserOutput/Drink.txt"));
        System.out.println(pd1);
        System.out.println(pd1.getProperty("Brand"));
        System.out.println(pd1.getProperty("Qty"));
    }

    }
