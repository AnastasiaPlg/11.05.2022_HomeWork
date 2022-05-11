public class TaskCycle5 {
    public static void main(String[] args) {
        int n = 0;
        int number = 0;
        do {
            System.out.print(number + " ");
            number = number - 5;
            n++;
        }
        while (n < 10);
    }
}
