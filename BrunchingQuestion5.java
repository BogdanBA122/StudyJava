import java.util.Scanner;

public class BrunchingQuestion5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("X =");

        double x = in.nextDouble();
        double result;

        if (x <= 3) {
            result = getFunctionResult(x);
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("F(x) = " + result);
    }

    private static double getFunctionResult(double x) {
        return Math.abs(x) - 3 * x + 9;
    }
}
