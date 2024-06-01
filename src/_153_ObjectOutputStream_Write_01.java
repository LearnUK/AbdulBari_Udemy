import java.io.*;
class StudentDataStream implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    StudentDataStream(){}
    public StudentDataStream(int r,String n,float a,String d)
    {
        rollNo=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    public String toString()
    {
        return "\nStudent Details :"+
                "\nRoll "+rollNo+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}
public class _153_ObjectOutputStream_Write_01 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\ObjectOutputStreamExample1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        StudentDataStream s1 = new StudentDataStream(1,"John",89.9f,"CSE");
        oos.writeObject(s1);

        StudentDataStream s2 = new StudentDataStream(2,"Roy",99.7f,"CSE");
        oos.writeObject(s2);

        oos.close();
        fos.close();
    }
}
