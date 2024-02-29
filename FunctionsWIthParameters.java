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

        System.out.println("Main method ended");
    }
}