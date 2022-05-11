import java.util.Scanner;

public class TaskCC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the outdoor temperature: ");
        int t = scanner.nextInt();
        System.out.println();

        if (t > -5) {
            System.out.println("It's warmly");
        } else if (t <= -5 && t > -20) {
            System.out.println("It's normal");
        } else System.out.println("It's coldly");
    }
}
