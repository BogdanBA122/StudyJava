import java.util.Scanner;

public class Question1v {
    public static void main (String[] args){
        int angle1 = 0;
        int angle2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input angles:");
        angle1 = in.nextInt();
        angle2 = in.nextInt();
        if (angle1 + angle2 == 90) {
            System.out.println("It's rectangular triangle");
        }
        else if (angle1 + angle2 < 180) {
                    System.out.println("Triangle exist");
                }
            else {
                System.out.println("Triangular doesn't  exist");
            }
        }
    }

