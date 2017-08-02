package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter Length of rectangle:");
        double length = in.nextDouble();

        System.out.println("Please enter Height of rectangle:");
        double height = in.nextDouble();

        double area = length * height;

        System.out.println("Area of rectangle is: " + area);

    }


}
