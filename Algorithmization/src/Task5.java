public class Task5 {
    public static void main (String[] args){
        int []arr = {(1), (1), (2), (3), (4)};

        for (int elem: arr){
            if (elem > java.util.Arrays.asList(arr).indexOf(elem)){
                System.out.println(elem);
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > i){
                System.out.println(arr[i]);
            }
        }

    }
}
