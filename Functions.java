public class Functions {
    //Functions without parameters and return types


    public static void test2() {
        // test the function
        System.out.println("runnung test2() method");
    }

    // main function
    /*
     * function declaration
     * <access specifier> <access modifier> return-type function-name(<parameter>)
     * function body
     * {
     * //TO DO SOMETHING
     * <return VALUE;>
     * }
     * 
     */
    public static void main(String[] args) {

        System.out.println("Main method started");

        // Calling a function
        
        test1();
        test2();
        disp();
        square();

        System.out.println("Main method ended");

    }

    public static void test1() {
        // test the function
        System.out.println("running test1() method");
    }

    public static void disp() {
        System.out.println("Running disp() method");
        test1();
        test2();

    }

    public static void square() {
        System.out.println("Finding Square of number");
        int n = 5;
        int res = n * n;
        System.out.println("Squre of " + n + " is " + res);
    }
}
