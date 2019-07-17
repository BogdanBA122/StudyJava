public class Task2 {
    public static void main(String[] args) {
        double arr[] = {(-43), (-2.5), (3), (5), (7), (8), (9), (15), (56)};

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Input numbers: ");
        double z = in.nextDouble();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= z) {
                arr[i] = z;
            }
            System.out.println(arr[i]);
        }
    }
}
