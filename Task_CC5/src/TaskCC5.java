import java.util.Scanner;

public class TaskCC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rainbow color number: ");
        int number = scanner.nextInt();
        System.out.println();

        switch (number) {
            case 1 : {
                System.out.println("It's red");
                break;
            }
            case 2 : {
                System.out.println("It's orange");
                break;
            }
            case 3 : {
                System.out.println("It's yellow");
                break;
            }
            case 4 : {
                System.out.println("It's green");
                break;
            }
            case 5 : {
                System.out.println("It's blue");
                break;
            }
            case 6 : {
                System.out.println("It's dark blue");
                break;
            }
            case 7 : {
                System.out.println("It's violet");
                break;
            }
            default :
                System.out.println("Error");
        }
    }
}
