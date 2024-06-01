import java.util.Scanner;

public class _017_FindTypeofWebsiteAndProtocol
{
    public static void main(String[] args)
    {
        String url1 = "http://www.google.com";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a URL");
        String url=scan.nextLine();

        String protocol=url.substring(0, url.indexOf(":"));

        if(protocol.equals("http"))
            System.out.println("Protocol in URL is : "+"'"+protocol+"'"+" Hypertext Transfer Protocol");
        else if(protocol.equals("Protocol in URL is : "+"'"+protocol+"'"+" ftp"))
            System.out.println("Protocol in URL is : "+"'"+protocol+"'"+" File Transfer Protocol");
        else if(protocol.equals("https"))
            System.out.println("Protocol in URL is : "+"'"+protocol+"'"+" Hypertext Transfer Protocol Secure");

        String typeOfUrl =url.substring(url.lastIndexOf(".")+1);

        if(typeOfUrl.equals("com"))
            System.out.println("Type of Url "+"'"+typeOfUrl+"'"+" is : Commercial");
        else if(typeOfUrl.equals("org"))
            System.out.println("Type of Url "+"'"+typeOfUrl+"'"+" is : Organisation");
        else if(typeOfUrl.equals("net"))
            System.out.println("Type of Url "+"'"+typeOfUrl+"'"+" is : Network");
    }
 }

