import java.util.Scanner;

public class Question2 {
     public static void main(String[] args) {

          Scanner in = new Scanner(System.in);
          System.out.println("Input numbers:");
          System.out.print("a = ");
          double a = in.nextDouble();
          System.out.println("b = ");
          double b = in.nextDouble();
          System.out.println("c = ");
          double c = in.nextDouble();
          double z = ((b + Math.sqrt(Math.pow(b,2) + 4*a*c) / (2*a))) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
          System.out.println("Result = " + z);
     }
}