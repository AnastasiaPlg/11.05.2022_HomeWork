public class TaskFromGit3 {
    public static void main(String[] args) {
        int n = 0;
        StringBuilder lineHoursTime;
        StringBuilder lineMinutesTime;
        for (int i = 0; i <= 23; i++) {
            String line1 = i + "";
            if (line1.length() == 1) {
                lineHoursTime = new StringBuilder("0" + line1);
            } else lineHoursTime = new StringBuilder(line1);
            for (int j = 0; j <= 59; j++) {
                String line2 = j + "";
                if (line2.length() == 1) {
                    lineMinutesTime = new StringBuilder("0" + line2);
                } else lineMinutesTime = new StringBuilder(line2);

                if(lineHoursTime.toString().equals(lineMinutesTime.reverse().toString())) {
                   n++;
                }
            }
        }
        System.out.println("Number of mirror combinations: " + n);
    }
}
