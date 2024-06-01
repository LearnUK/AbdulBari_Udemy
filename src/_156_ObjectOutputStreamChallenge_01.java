import java.io.*;
         class CustomerObject implements Serializable {
            String custID;
            String name;
            String phno;

            int count = 1;

            CustomerObject() {
            }

            CustomerObject(String n, String p) {
                custID = "C" + count;
                count++;
                name = n;
                phno = p;
            }

            public String toString() {
                return "Customer ID : " + custID + "\nName : " + name + "\nPhno : " + phno + "\n";
            }
        }

        public class _156_ObjectOutputStreamChallenge_01 {
            public static void main(String[] args) throws IOException {
                CustomerObject list[] = {new CustomerObject("Smith", "12345"),
                        new CustomerObject("John", "67890")};

                FileOutputStream fos = new FileOutputStream("C:\\Users\\jeetj\\JavaProgramm\\AbdulBari_Udemy\\CustomerList.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeInt(list.length);
                for (CustomerObject c : list) {
                    oos.writeObject(c);
                }
                oos.close();
                fos.close();
            }
        }