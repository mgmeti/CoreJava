/**
 * FunctionsWithParameters
 */
public class FunctionsWithParameters {

    /*
     * Product price = Rs 50 and Quantites are 10
     * Total price = 50 * 10 = 500
     */
    public static void totalPrice(double price, int qty) {
        double total = price * qty;
        System.out.println("The total price for given price per qty " + price + " and number of quantities " + qty
                + " is: " + total);

    }

    
    // Function to get sum of two integers
    public static void sumOfIntegers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of given integers " + num1 + ", " + num2 + " is: " + sum);
    }

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

    public static void areaOfRectangle(double breadth, double width) {
        double area = breadth * width;
        System.out.println("Area of rectangle of width " + width + " and breadth " + breadth + " is " + area);

    }

    public static void areaOfTriangle(double base, double height) {
        double area = base * height * 0.5;
        System.out.println("Area of triangle of base " + base + " and height " + height + " is " + area);

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


        
        // Area of reactangle of width = 10 and breadth = 15
        double width = 10.0;
        double breadth = 15.0;
        areaOfRectangle(breadth, width);

        // Area of triangle of base = 10 and height = 25
        double base = 10.0;
        double height = 25.0;
        areaOfTriangle(base, height);

        // Get sum of integers
        int a = 100;
        int b = 200;
        sumOfIntegers(a, b);
        
        // Get total price for qty 10 with per qty price Rs 50
        double price = 50.0;
        int qty = 10;
        totalPrice(price, qty);

        System.out.println("Main method ended");
    }
}