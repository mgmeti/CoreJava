class WhileStatements {
    public static void main(String[] args) {

        // while condition is true keep on executing while loop body stmts
        // stops when condition becomes false
        // Note: while loop must have stmt, which makes the condition become false
        // otherwise while ends in infinite loop
        int n = 3;

        while (n > 0) {
            System.out.println("Tick " + n);
            n--;
        }

        int i, j;
        i = 100;
        j = 200;

        while (++i < --j)
            ;

        System.out.println("Midpoint: " + i);

    }
}
