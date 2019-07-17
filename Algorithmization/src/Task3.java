public class Task3 {
    public static void main(String[] args) {
        double arr[] = {(-3), (2), (0), (0), (4), (3), (12), (-654), (23), (1), (2), (4)};
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Negative numbers: " + negative + '\n' + "Positive numbers: " + positive + '\n' + "Zeros: " + zero);
    }
}
