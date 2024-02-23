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
        System.out.println("Program Ended");

    }

}
