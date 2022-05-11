public class TaskExtra3 {
    public static void main(String[] args) {
        int[][] ints = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ints[i][j] = (i + 1) * (j + 1);
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
