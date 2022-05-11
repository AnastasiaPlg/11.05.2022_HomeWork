public class TaskFromGit4 {
    public static void main(String[] args) {
        int n = 0;
        String number;
        for (int i = 1; i <= 100000; i++) {
            number = i + "";
            if (number.indexOf("13") >=0 || number.indexOf("4") >=0) {
                n++;
            }
        }
        System.out.println("Number of combat vehicles to exclude: " + n);
    }
}
