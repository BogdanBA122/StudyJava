import java.util.Scanner;

public class BrunchingQuestion4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hole size:");
        float A = in.nextFloat();
        float B = in.nextFloat();

        System.out.println("Brick size:");
        float x = in.nextFloat();
        float y = in.nextFloat();
        float z = in.nextFloat();

        if (((x <= A && y <= B) || ((x <= A && z <= B))) || ((y <= A && z <= B))){
            System.out.println("You may try.It'll work.");
        } else {
            System.out.println("No way, dude");
        }
    }


}

