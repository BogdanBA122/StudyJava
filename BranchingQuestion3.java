import java.util.Scanner;

public class BranchingQuestion3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input x1 y1");

        float x1 = in.nextFloat();
        float y1 = in.nextFloat();

        System.out.println("input x2 y2");

        float x2 = in.nextFloat();
        float y2 = in.nextFloat();

        System.out.println("input x3 y3");

        float x3 = in.nextFloat();
        float y3 = in.nextFloat();

        float v = (y3 - y1) / (y2 - y1);
        float v1 = (x3 - x1) / (x2 - x1);

        boolean result = v == v1;
        System.out.println("Tha fact that points are on one line is " + result + ".");
    }
}
