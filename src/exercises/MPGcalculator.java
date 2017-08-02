package exercises;
import java.util.Scanner;

public class MPGcalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = in.nextDouble();

        System.out.println("How many galons have you used?");
        double galons = in.nextDouble();

        double mpg = miles / galons;

        System.out.println("Your MPG is: " + mpg);

    }
}
