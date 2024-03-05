public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Program Started");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i);
        }
        System.out.println();
        // Print all the even number present in 1 to 100.
        int a = 95;
        int b = 100;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Usage of break keyword and it's impact on flow of execution
        for (int i = 1; i <= 9; i++) {
            // break; Unreachable Error
            // System.out.println(i);
            // break; Dead code Problem
            if (i == 5 || i == 7) {
                // break;
                continue;
            }
            System.out.println(i);
        }



        // Initialization of i and increment/decrement statements are optional,
        // we can keep initialization statement out of for loop structure
        // we can keep increment statement in loop body statement.
        // if loop body is not having increment/decrement, then loop become
        // infinite!!!!!.
        int i = 1;
        for (; i <= 5;) {
            System.out.print(++i);
            // i++;
        }

         // specifying condition is optional, if we don't specify it, by default condtion
        // will be always true
        int i = 1;
        for (;;) {
            System.out.println(i++);
            // i++;
            if (i == 11) {
                break;
            }
        }

        System.out.println("Program Ended");

    }

}
