/**
 * FunctionsWithParameters
 */
public class FunctionsWithParameters {

    public static void square(int num) {
        int res = num * num;
        System.out.println("Squre of " + num + " is " + res);

    }

    public static void cube(int num) {
        int res = num * num * num;
        System.out.println("Cube of " + num + " is " + res);

    }

    /*
     * write a program to find the following calculations
     * Diameter of a circle
     * Area of a circle
     * Circumference of a circle
     * 
     * Write functions for each calculations
     * 
     */

    public static void diameterOfCircle(double radius) {
        double dia = 2 * radius;
        System.out.println("Diameter of circle of radius " + radius + " is " + dia);

    }

    public static void areaOfCircle(double radius) {
        final double pi = 22.0 / 7;
        double area = pi * radius * radius;
        System.out.println("Area of a circle of radius " + radius + " is " + area);

    }

    public static void circumferenceOfCircle(double radius) {
        final double pi = 22.0 / 7;
        double circum = 2 * pi * radius;
        System.out.println("Circumference of a circle of radius " + radius + " is " + circum);

    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        // Passing int value to function parameter
        square(2);
        square(15);
        square(25);
        cube(2);
        cube(15);
        cube(25);

        // Copying x value to a function parameter
        int x = 10;
        square(x);
        cube(x);

        // Get Circle properties for radius 12.25cm.
        double r = 12.25;
        diameterOfCircle(r);
        areaOfCircle(r);
        circumferenceOfCircle(r);

        System.out.println("Main method ended");
    }
}