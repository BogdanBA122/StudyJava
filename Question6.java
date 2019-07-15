import java.util.Scanner;

public class Question6 {

    private static final Scanner IN = new Scanner(System.in);
    private static float readFloat(){
        return IN.nextFloat();
    }

    public static void main(String[] args) {
        System.out.println("Input x and y: ");

        float x = readFloat();
        float y = readFloat();

        boolean isXInRange = x >= -4 && x <= 4;
        boolean isYInRange = y <= 0 && y >= -3;

        if (isXInRange && isYInRange) {

            System.out.println("true");

        } else if ((x >= -2 && x <= 2) && (y > 0 && y < 4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
