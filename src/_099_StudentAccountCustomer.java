import java.util.Date;

class stdAccCust{
    private String rollNo;
    private String accNo;
    private String custId;
    private static int countRollNo=1, countAccNo=1, countCustId=1;
    private String generateRollNo(){
        Date d = new Date();
        String rn ="University"+(d.getYear()+1900)+"_"+countRollNo;
        countRollNo++;
        return rn;
    }
    public String Student(){
        rollNo = generateRollNo();
        return rollNo;
    }
    private String generateAccNo(){
        Date d = new Date();
        String acc ="Acc"+(d.getYear()+1900)+"_"+countAccNo;
        countAccNo++;
        return acc;
    }
    public String Account(){
        accNo = generateAccNo();
        return accNo;
    }
    private String generateCustNo(){
        Date d = new Date();
        String rn ="Cust"+(d.getYear()+1900)+"_"+countCustId;
        countCustId++;
        return rn;
    }
    public String CustomerId(){
        custId = generateCustNo();
        return custId;
    }
}
public class _099_StudentAccountCustomer {
    public static void main(String[] args) {
        stdAccCust s1 = new stdAccCust();
        System.out.println(s1.Student()+" "+s1.Account()+" "+s1.CustomerId());
        stdAccCust s2 = new stdAccCust();
        System.out.println(s2.Student()+" "+s2.Account()+" "+s2.CustomerId());
        stdAccCust s3 = new stdAccCust();
        System.out.println(s3.Student()+" "+s3.Account()+" "+s3.CustomerId());

    }
}