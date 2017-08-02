package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter radius of a circle: ");

        double radius = in.nextDouble();

        final double PI = 3.1415926535897;


        //bonus mission
        while (radius < 0) {
            System.out.println("Please enter a positive number: ");
            radius = in.nextDouble();
        }


        //results
        double area = PI * radius * radius;

        System.out.println("Area of a circle with radius of " + radius + " is: " + area);

    }
}
