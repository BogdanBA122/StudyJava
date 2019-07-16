import java.util.Scanner;

public class Cycles7 {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Input m: ");
        int m = in.nextInt();
        System.out.print("Input n: ");
        int n = in.nextInt();

        int smallestNumber = Math.min(m, n);
        int biggestNumber = Math.max (m, n);

            for (int j = biggestNumber; j >= smallestNumber; j--){
                System.out.println("Dividers of number " + j + " are: ");

                for (int i = j-1; i > 1; i--){
                int remainderOfTheDivision = j % i;

                if (remainderOfTheDivision == 0){
                    int divider = i;
                    System.out.print(i + " ");
                }
                }
                System.out.print('\n');
        }

//
        }
    }

