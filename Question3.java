import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers:");
        System.out.println("x = ");
        int x = in.nextInt();
        System.out.println("y = ");
        int y = in.nextInt();
        double result = (((Math.sin(x) + Math.cos (y)) / Math.cos(x) - Math.sin (y)) * Math.tan(x*y));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Result = " + df.format(result));
        }
    }