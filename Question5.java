import java.util.Scanner;

public class Question5 {

    public static final int SEC_IN_HOUR = 3600;
    public static final int SEC_IN_MIN = 60;

    public static void main (String[] args) {
        System.out.println("Input seconds");

        Scanner in = new Scanner (System.in);
        int timeInSeconds = in.nextInt();

        int hour = timeInSeconds / SEC_IN_HOUR;
        int minutes = timeInSeconds % SEC_IN_HOUR / SEC_IN_MIN;
        int seconds = timeInSeconds - (hour * SEC_IN_HOUR) - (minutes * SEC_IN_MIN);

        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}
