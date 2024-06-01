public class _018_Switch_NUmberToDay01
    {
        public static void main(String[] args) {

            //Scanner sc = new Scanner(System.in);
            //System.out.print("Enter a number for Day : ");
            //int day = sc.nextInt();
            int day = 4;
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thu");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Invalid Day number. Enter number between 1 to 7");
                    break;
            }
        }
    }