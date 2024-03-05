public class FunctionWithReturnType {

    // Method returning String value
    public static String display() {
        System.out.println("Java");
        return "SQL";
    }

    // Method returning variable
    public static String returnVariable() {
        String sub = "Linux";
        return sub;
    }

    // Method returning variable
    public static String returnParameter(String name, int age) {
        return name;
    }

    // Method returns parameters
    public static String returnMultiplrParameters(String name, int age) {
        return name + " " + age;
    }

    // Method returns expression.
    public static int totalMarks(int p, int c, int m, int o) {
        return p + c + m + o;
    }

    // Method to calculate
    public static double percantageOfMarks(int totalMarks) {
        return totalMarks / 4.0;
    }

    public static void main(String[] args) {
        System.out.println(display());
        System.out.println(returnVariable());
        System.out.println(returnParameter("Rahul"));
        System.out.println(returnMultiplrParameters("Raja", 45));
        System.out.println(totalMarks(50, 50, 50, 50));
        System.out.println(percantageOfMarks(totalMarks(50, 50, 50, 50)));
    }

}


