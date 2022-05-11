import java.util.Scanner;

public class TaskCC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int number = scanner.nextInt();
        System.out.println();
        String winter = "It's winter";
        String spring = "It's spring";
        String summer = "It's summer";
        String autumn = "It's autumn";
        if (number == 1) {
            System.out.println(winter);
        } else if (number == 2) {
            System.out.println(winter);
        } else if (number == 3) {
            System.out.println(spring);
        } else if (number == 4) {
            System.out.println(spring);
        } else if (number == 5) {
            System.out.println(spring);
        } else if (number == 6) {
            System.out.println(summer);
        } else if (number == 7) {
            System.out.println(summer);
        } else if (number == 8) {
            System.out.println(summer);
        } else if (number == 9) {
            System.out.println(autumn);
        }else if (number == 10) {
            System.out.println(autumn);
        } else if (number == 11) {
            System.out.println(autumn);
        } else if (number == 12) {
            System.out.println(winter);
        } else System.out.println("Error");


    }
}
