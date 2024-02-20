public class Operators {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x value is: " + x);// 10

        // Shorthand operator: +=, /=, -=, *=, %=
        // Only one operator should be present in an expression
        // and one of the variable should be left hand side of
        // expression
        // x = x + y; should use shorthand like x +=y.
        //x = x + y + z; should not use shorthand for ths expression.

        x = x + 1; // 11
        x += 1;// 12
        System.out.println("x value is: " + x); // 12

        x = x - 1;// 11
        x -= 1;// 10

        System.out.println("x value is: " + x); // 10

        x = x * 2;// 20
        x *= 2;// 40

        System.out.println("x value is: " + x); // 40

        x = x / 2;// 20
        x /= 2;// 10
        System.out.println("x value is: " + x); // 10

    }

}
