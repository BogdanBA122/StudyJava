public class Task4 {
    public static void main(String[] args) {
        double arr[] = {(231), (-65.93), (0), (2), (324), (-87), (54)};
        double max = 0;
        double min = 0;

        for (double elem : arr) {
            if (elem > max) {
                max = elem;
            }
            if (elem < min) {
                min = elem;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = min;
            } else if (arr[i] == min) {
                arr[i] = max;
            }
            System.out.println(arr[i]);
        }

    }


}
