public class LogicalOperators {
    public static void main(String[] args) {
        /*
         * AND, OR, NOT
         * AND (&&) -> true only when both variables are true otherwise false.
         * 
         * OR (||)-> False only when both variables are false otherwise true.
         * 
         * NOT (!)-> Used to negate the given variable.
         * 
         */

        // Q1-> Find EVEN or ODD and number should be greater than 10

        int num = 12;

        if (num > 10 && num % 2 == 0) {
            System.out.println("Number is Even");
        } else if (num > 10 && num % 2 != 0) {
            System.out.println("Number is ODD");
        } else {
            System.out.println("Invalid Number");
        }

        // Q2 -> n is a integer
        // when n is 9 -->FIZZ
        // when n is 5 -->BUZZ
        // when n is 15 -->FIZZBUZZ

        int n = 90;

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (n % 3 == 0) {
            System.out.println("FIZZ");
        } else if (n % 5 == 0) {
            System.out.println("BUZZ");
        }

    }
}
