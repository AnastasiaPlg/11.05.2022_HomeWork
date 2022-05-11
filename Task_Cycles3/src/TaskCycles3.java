import java.util.Scanner;

public class TaskCycles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int number = scanner.nextInt();
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Summary of numbers from 1 to " + number + " is " + sum);
    }
}
