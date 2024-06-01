import java.io.*;
import java.util.Scanner;

public class _157_ObjectInputStreamChallenge_01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\CustomerList.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        CustomerObject list[] = new CustomerObject[length];
        for(int i=0; i<length;i++){
            list[i] =(CustomerObject) ois.readObject();
        }
        System.out.println("Enter Name of Customer : ");
        String name = sc.nextLine();
        for (int i=0; i<length; i++){
            if(name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
        }
        ois.close();
        fis.close();
    }
}

