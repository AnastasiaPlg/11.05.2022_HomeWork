import java.util.Scanner;

public class TaskExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        float money = scanner.nextFloat();
        System.out.println();
        System.out.print("Enter the term of the deposit in months: ");
        int months = scanner.nextInt();
        System.out.println();

        float interestRate = 0.07f;

        float sum = money;

        for (int i = 1; i <= months; i++) {
            sum = sum * (1 + interestRate);
        }

        System.out.println(String.format("Your amount of money at the end of the deposit time: %.2f", sum));
    }
}
