public class _012_StringMethods_01
{
    public static void main(String[] args)
    {
        String str1 = "Java";// Literal "Java" is created in String POOL
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        String str2 = "   Welcome   ";
        System.out.println(str2.trim());

        String str3 = "Welcome";
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3,6));

        String str4 = "netbeanse";
        System.out.println(str4.charAt(0));
        System.out.println(str4.startsWith("net"));
        System.out.println(str4.endsWith("beans"));
        System.out.println(str4.indexOf("e"));
        System.out.println(str4.indexOf("e",2));
        System.out.println(str4.lastIndexOf("e"));
        System.out.println(str4.lastIndexOf("e",2));

        String str5 = "java";
        System.out.println(str5.equals(str1));
        System.out.println(str1.equalsIgnoreCase(str5));
        System.out.println(str1.compareTo(str5));
        System.out.println(str1.compareToIgnoreCase(str5));

        String str6 = new String("java");
        System.out.println(str5.equals(str6)); // Compares the literal or Constant value
        System.out.println(str5==str6); // Compares the Reference
        System.out.println(str6.compareTo(str5));
        System.out.println(str5.concat(str6));

        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        int j = str.indexOf(".");
        System.out.println(str.indexOf("@"));
        System.out.println(str.indexOf("."));
        System.out.println("Username is : "+str.substring(0,i));
        System.out.println("Domain is : "+str.substring(i+1,j));

        int b = 1000110;
        String str7 = String.valueOf(b);
        System.out.println(str7);
        //check for Binary number
        System.out.println(str7.matches("[01]*"));
        //check for HE=exadecimal number
        String str8 = "B2345AZ";
        System.out.println(str8.matches("[0-9A-F]+"));

        //Remove Special Character from String
        String str10 = "a!#$B&^c1:2$3";
        System.out.println(str10.replaceAll("[^a-zA-Z0-9]",""));

        //Remove extra spaces from String
        String str11 = "   abc    de  fgh  ijk   ";
        System.out.println(str11.replaceAll("\\s+","").trim());

        //Find number of words in String
        String str12 = str11.replaceAll("\\s+"," ").trim();
        System.out.println(str11.replaceAll("\\s+"," ").trim());
        String words[] = str12.split("\\s");
        System.out.println(words.length);


    }
}
