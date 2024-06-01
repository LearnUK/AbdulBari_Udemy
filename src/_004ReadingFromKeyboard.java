import java.util.Scanner;

public class _004ReadingFromKeyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("What is you name??");
        name = s.nextLine();
        System.out.println("Welcome "+name+"!!!");
    }
}