import java.util.Scanner;

public class TaskCC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int number = scanner.nextInt();
        System.out.println();
        String winter = "It's winter";
        String spring = "It's spring";
        String summer = "It's summer";
        String autumn = "It's autumn";

        switch (number) {
            case 1 : {
                System.out.println(winter);
                break;
            }
            case 2 : {
                System.out.println(winter);
                break;
            }
            case 3 : {
                System.out.println(spring);
                break;
            }
            case 4 : {
                System.out.println(spring);
                break;
            }
            case 5 : {
                System.out.println(spring);
                break;
            }
            case 6 : {
                System.out.println(summer);
                break;
            }
            case 7 : {
                System.out.println(summer);
                break;
            }
            case 8 : {
                System.out.println(summer);
                break;
            }
            case 9 : {
                System.out.println(autumn);
                break;
            }
            case 10 : {
                System.out.println(autumn);
                break;
            }
            case 11 : {
                System.out.println(autumn);
                break;
            }
            case 12 : {
                System.out.println(winter);
                break;
            }
            default : System.out.println("Error");
        }
    }
}
