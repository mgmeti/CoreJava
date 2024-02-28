public class ArraysExamples {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int[] arr; // Array Declaration

        arr = new int[5];// Array initialization

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // arr[5] = 6;//java.lang.ArrayIndexOutOfBoundsException: 5

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Program Ended");
    }

}
