/**
 * FunctionsWithParameters
 */
public class FunctionsWithParameters {

    public static void square(int num) {
        int res = num * num;
        System.out.println("Squre of " + num + " is " + res);

    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        square(15);
        square(25);

        System.out.println("Main method ended");
    }
}