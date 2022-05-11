public class TaskFromGit1 {
    public static void main(String[] args) {
        int n = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 999999; i++) {
            int n1 = i % 1000;
            int n2 = (i - n1) / 1000;
            for (int j = 2; j >= 0; j--) {
                sum1 = sum1 + (n1 / (int)Math.pow(10, j));
                n1 = n1 % (int)Math.pow(10, j);
                sum2 = sum2 + (n2 / (int)Math.pow(10, j));
                n2 = n2 % (int)Math.pow(10, j);
            }

            if (sum1 == sum2) {
                n++;
            }
            sum1 = 0;
            sum2 = 0;
        }
        System.out.println("Number of lucky tickets: " + n);
    }
}
