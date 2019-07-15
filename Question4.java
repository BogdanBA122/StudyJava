import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//
//        while(!isNextDouble) {
//           in.nextLine();
//            System.out.println("Re enter");
//           isNextDouble = in.hasNextDouble();
//        }
//
//        System.out.println(in.nextDouble());
//

        boolean isNextDouble;

        String doubleNum;
        do {
            System.out.println("enter number");
            isNextDouble = in.hasNextDouble();
            doubleNum = in.nextLine();
        } while (!isNextDouble);

        double num = Double.valueOf(doubleNum.replace(',', '.'));

        double number1 = num;

        int intNum = (int) number1;
        int relative = (int) ((number1 - intNum) * 1000) + 1;


        // double relative = number1 % 1;
        double result = relative + intNum / 1000.0;

        System.out.println(result);

    }
}


