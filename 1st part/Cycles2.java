import java.util.Scanner;

public class Cycles2 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int a, b = 0;
        float x = 0;

        System.out.print("Input the step:");
        int step = in.nextInt();
        System.out.println("Input a, b");
        a = in.nextInt();
        b = in.nextInt();

        for (x = a; x <= b; x += step) {
            if (x <= 2){
            System.out.println("x=" + x + '\n' + "y=" + (-x));

            } else {
            System.out.println("x=" + x + '\n' + "y=" + x);
            }

        }
    }
}
