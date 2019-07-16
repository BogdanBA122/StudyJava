import java.util.Scanner;

public class Cycles1 {
    public static  void main (String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();
        int b = 0;

        for ( int i = 0; i <= number; i++ ) {

            b = b + i;
        }
        System.out.println(b);


    }
}
