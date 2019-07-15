

public class Algoritmisation {
    public static void main(String[] args) {
        int k = 3;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 21};

        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        int expected = 3 + 6 + 9 + 12 + 15 + 18 + 21;

        System.out.println(sum);
        System.out.println(expected);
        System.out.println(expected == sum);

    }
    }
}
