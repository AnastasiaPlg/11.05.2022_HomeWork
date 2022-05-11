public class TaskFromGit2 {
    public static void main(String[] args) {
        int n = 0;

        for (int i = 1; i <= 50000; i++) {
            String number = i + "";
            if (number.indexOf("2") >= 0) {
                n++;
            }
        }
        System.out.println("Number of tablets to remake: " + n);
    }
}
