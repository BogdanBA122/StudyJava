import java.util.Scanner;

public class Cycles8Test {

    private static int getCountsOfDigits(long number) {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    private static int getNumeralsOfNumbers(long number) {

        int length = getCountsOfDigits(number);
        long j = 0;                 //  for count
        long k = 0;
        int numeral = 0;
        System.out.print("For the number " + number + " numerals are: ");

        for (int i = length - 1; i >= 0; i--) {
            numeral = (int) ((number / Math.pow(10, i)) - j);

            j = (long) (numeral * 10) + k * 10;
            k = j;

            System.out.print(numeral + " ");

        }
        System.out.println('\n');
        return (0);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To exit input -1");
        long number1 = 0;
        while (number1 != -1) {
            System.out.println("Input your number:");
            number1 = in.nextLong();

            int result = getNumeralsOfNumbers(number1);
        }
    }
}
