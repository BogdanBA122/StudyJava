import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args) {
        double arr[] = {(-0.42), (0), (123), (54.3), (7), (32), (12), (23)};
        double sum = 0;

        for (int i = 3; i < arr.length; i++) {
            for (int j = 2; j<i; j++){
                if (i%j == 0) {
                    break;
                }
                else {sum+=arr[i];
                    System.out.println( i);
                break;}
            }
        }
        System.out.println(sum + arr[1]);
    }
}
