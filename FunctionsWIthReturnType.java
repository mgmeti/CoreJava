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
    public static String returnParameter(String name) {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(display());
        System.out.println(returnVariable());
        System.out.println(returnParameter("Rahul"));
    }

}
