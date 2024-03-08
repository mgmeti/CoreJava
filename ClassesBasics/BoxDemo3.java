class BoxWithMethod {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume " + width * depth * height);
    }

}

public class BoxDemo3 {
    public static void main(String[] args) {

        // Declare two Box objects
        BoxWithMethod myBox1 = new BoxWithMethod();
        BoxWithMethod myBox2 = new BoxWithMethod();

        // Assign values to myBox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Assign different values to myBox2's instance variables
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();
        myBox2.volume();
    }
}
