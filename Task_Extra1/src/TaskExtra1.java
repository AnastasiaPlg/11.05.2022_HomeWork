import java.util.Arrays;

public class TaskExtra1 {
    public static void main(String[] args) {
        int[] ints = new int[11];
        ints[0] = 0;
        ints[1] = 1;
        for (int i = 2; i < 11; i++) {
            ints[i] = ints[i - 2] + ints[i -1];
        }
        System.out.println(Arrays.toString(ints));
    }
}
