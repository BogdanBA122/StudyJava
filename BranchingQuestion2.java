import java.util.Scanner;

public class BranchingQuestion2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Input a, b, c, d");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
        float result = (Math.max(Math.min(a, b), Math.min (c, d) ));
        System.out.println("Result = " + result);
    }
}
