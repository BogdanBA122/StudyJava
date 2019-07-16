import java.util.Scanner;




public class Cycles8 {
    public static int getCountsOfDigits(long number) {
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    public static void main (String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Input 2 numbers:");
        long number_1 = in.nextInt();
        long number_2 = in.nextInt();

        long j = 0;                 //  for count
        long k = 0;                 //  for count

        int length_1 = getCountsOfDigits(number_1);
        int length_2 = getCountsOfDigits(number_2);

        System.out.print("For the number: " + number_1 + " numerals are: ");

        for (int i = length_1 - 1; i >= 0; i-- )
        {   int  numeral = (int) ((number_1 / Math.pow(10, i)) - j );

            j = (long) (numeral * 10) + k * 10;
            k = j;

            System.out.print (numeral + " ");
        }

        j = 0;
        k = 0;

        System.out.print( '\n'+ "For the number: " + number_2 + " numerals are: ");

        for (int i = length_2 - 1; i >= 0; i-- ) {

            int  numeral = (int) ((number_2 / Math.pow(10, i)) - j );

            j = (long) (numeral * 10) + k * 10;
            k = j;

            System.out.print (numeral + " ");
        }



    }
}
