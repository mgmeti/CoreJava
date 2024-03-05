public class FunctionWithChaining {
    public static int totalMarks(int physicsMarks, int chemistryMarks, int mathsMarks, int optionalMarks) {
        return physicsMarks + chemistryMarks + mathsMarks + optionalMarks;
    }

    public static void percantageOfMarks(int p, int c, int m, int o) {
        int sum = totalMarks(p, c, m, o);
        double perc = sum / 4.0;
        System.out.println(perc);
    }

    public static void main(String[] args) {
        percantageOfMarks(50, 50, 50, 50);

    }

}
