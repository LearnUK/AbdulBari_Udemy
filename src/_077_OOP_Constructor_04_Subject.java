class subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getSubId(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}

    public void setMaxMarks(int mm){ maxMarks = mm;}
    public void setMarksObtain(int m){ marksObtain =m;}

    boolean isQualified(){return marksObtain >=maxMarks/10*4;}
    public String toString(){
        return "\nSubject ID : "+subId+" \nName : "+name+" \nMarks Obtained : "+marksObtain;
    }
    public subject(String subId, String name, int maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
}

class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private subject sub[];

    public Student(String roll,String name)
    {
        this.rollNo=roll;
        this.name=name;
    }
    public Student(String roll,String name,int ns)
    {
        this.rollNo=roll;
        this.name=name;
        this.numOfSub=ns;
    }

    public String getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public subject[] getSubjects(){return sub;}

    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }
    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }
}

public class _077_OOP_Constructor_04_Subject {
    public static void main(String[] args) {
        subject sub[] = new subject[3];
        sub[0] = new subject("s101", "Data Structure", 100);
        sub[1] = new subject("s102", "Algorithm", 100);
        sub[2] = new subject("s103", "Operating Systems", 100);
        for(subject s:sub)
        {
            System.out.println(s);
        }
    }
}
