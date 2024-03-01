public class RecursiveFunction {

    public static void generateNumbers(int n) {
        System.out.println(n);
        if (n < 10)
            generateNumbers(++n);
    }

    public static void main(String[] args) {
        int n = 1;
        generateNumbers(n);

    }

}
