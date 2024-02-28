public class Functions {

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
        test1();
        test1();
        test1();
        test2();
        test2();
        test2();

        System.out.println("Main method ended");

    }

    public static void test1() {
        // test the function
        System.out.println("running test1() method");
    }
}
