public class FlowControls {
    public static void main(String[] args) {
        // Flow control statements
        // To control the flow of execution
        // decision making and looping statements
        // Decision --> if, switch statements
        // Looping --> for, while loop statements

        // IF statements
        // if, if-else, if else-if else, else-if ladder, nested-if statements
        // if --> to choose path A or not
        // if-else --> to choose a path between two options only
        // if-else-if-else -->

        /*
         * if (condition)
         * {
         * //Block of code to run
         * //when condition is true
         * }
         * else
         * {
         * //Block of code to run
         * //when condition is false
         * 
         * }
         * 
         * condition --> is an expression which results in boolean value
         * 
         */
        System.out.println("Program Started");
        int x = 10;
        int y = 20;
        int z = 30;

        // if-else
        if (x > y) {
            System.out.println("X is greater than Y");
        } else {
            System.out.println("X is not greater than Y");
        }

        if (x > y) {
            System.out.println("X is greater than Y");
        } else if (y > z) {
            System.out.println("y is  greater than Z");
        } else {
            System.out.println("Z is greater than Y");
        }

        
        // Nested if statements

        if (x > y) {
            if (x > z) {
                System.out.println("X is greater than Y and Z");
            } else {
                System.out.println("X is greater than Y and less than Z");
            }
        } else {
            if (y > z) {
                System.out.println("y is greater than x and Z");
            } else {
                System.out.println("y is greater than x and less than Z");
            }
        }

        System.out.println("Program ended");
    }

}
