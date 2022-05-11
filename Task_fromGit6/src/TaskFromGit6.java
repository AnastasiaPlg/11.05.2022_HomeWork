import java.util.Scanner;

public class TaskFromGit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        System.out.println();
        int n = 0;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number!");
                n = 1;
                break;
            }
        }
        if (number == 1 || n == 0) {
            System.out.println(number + " is a prime number!");
        }

    }
}
