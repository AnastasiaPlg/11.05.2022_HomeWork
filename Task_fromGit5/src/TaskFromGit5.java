import java.util.Scanner;

public class TaskFromGit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.println("The sum of the digits of a number " + number + " is " + findSum(number));

    }

    private static int findSum(int n) {
        int lengthOfNumber = (n + "").length();
        int sum = 0;
        for (int i = lengthOfNumber - 1; i >= 0; i--) {
            sum = sum + (n / (int)Math.pow(10, i));
            n = n % (int)Math.pow(10, i);
        }
        return sum;
    }
}
