class WhileStatements {
    public static void main(String[] args) {
        /*
        while condition is true, keep on executing while loop body stmts
        stops when condition becomes false
        Note: while loop must have stmt, which makes the condition become false
        otherwise while ends in infinite loop
        */
        // Print tick with number for n times.    
        int n = 3;

        while (n > 0) {
            System.out.println("Tick " + n);
            n--;
        }

        //Find the mid number between i and j.
        int i, j;
        i = 100;
        j = 200;

        //pre-increment of i, j and check with condition like i < j.
        while (++i < --j) ; // null statement 

        System.out.println("Midpoint: " + i);

    }
}
