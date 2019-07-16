import java.util.Scanner;

public class Cycles5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("E = ");
        int e = in.nextInt();
        double res = 0, member_i = 0;

        do {
            int i = 1;
            i++;
            member_i = ((1 / Math.pow(2, i) + (1 / Math.pow(3, i))));
            res += member_i;
        }
        while (Math.abs(member_i) >= e);
        System.out.println("Result = " + res);
    }
}


