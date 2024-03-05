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

        // Unary operators
        // Works only on one variable
        // ++(increment operator)
        // Pre-increment --> ++Z
        ++x;
        System.out.println("x value is: " + x); // 11

        // Post-increment --> Z++
        x++;
        System.out.println("x value is: " + x);// 12

        // --(decrement operator)
        // Pre-decrement --> --Z
        --x;
        System.out.println("x value is: " + x);// 11

        // Post-decrement --> Z--
        x--;
        System.out.println("x value is: " + x);// 10

        // Note: Code Review and analysis
        // Done by the co-developers
        // Code Snippet round in interview used test capability of above skill

        int a = 0;
        int b = 0;

        b = a++; // First assign and then increment(post-increment)
        System.out.println("a value is: " + a); // 1
        System.out.println("b value is: " + b);// 0

        a = 0;
        b = 0;

        b = ++a; // First increment and then assign(pre-increment)
        System.out.println("a value is: " + a);// 1
        System.out.println("b value is: " + b);// 1

        a = 0;
        b = 0;

        b = a++ + a;
        System.out.println("a value is: " + a);// 1
        System.out.println("b value is: " + b);// 1

        a = 0;
        b = 0;

        b = ++a + a;
        System.out.println("a value is: " + a);// 1
        System.out.println("b value is: " + b);// 2

        a = 0;
        b = 0;

        b = a++ + a + ++a;
        System.out.println("a value is: " + a);// 2
        System.out.println("b value is: " + b);// 3

        a = 0;
        b = 0;

        b = a++ + a++ + ++a + ++a + a++ + ++a + ++a + a++ + ++a;
        System.out.println("a value is: " + a);// 9
        System.out.println("b value is: " + b);// 41

        a = 0;

        a = a++; // 0
        a = a++;// 0
        a = a++;// 0
        a = a++;// 0
        a = a++;// 0
        System.out.println("a value is: " + a);// 0

        a = 0;
        a = ++a;
        a = ++a;
        a = ++a;
        a = ++a;
        a = ++a;

        System.out.println("a value is: " + a);// 5
        

    }

}


