public class ArraysExamples {
    public static void main(String[] args) {
        System.out.println("Program Started");


        
        // Both declaration and initialization are combined in one line code
        // datatype[] arrayName = new datatype[array-size];

        int[] arr; // Array Declaration

        arr = new int[5];// Array initialization

         // int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // arr[5] = 6;//java.lang.ArrayIndexOutOfBoundsException: 5

         // int[] arr1 = {1, 2, 3, 4, 5};

         // # of elements in given array
        System.out.println("No Of Elements (Array size): " + arr.length);

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

          // Print array in reverese order
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
         // Print even index elements of an array
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.println("Element at index " + j + " is : " + arr[j]);
            }
        }



       // String array
        // create a string array with size 5
        String[] strArray = new String[5];
        // stores default null values initially

        System.out.println("Before storing values in array");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();

        // store values
        strArray[0] = "Ram";
        strArray[1] = "Sita";
        strArray[2] = "laxman";
        strArray[3] = "Bharath";
        strArray[4] = "Hanuman";

        // # of elements in given array
        System.out.println("No Of Elements (Array size): " + strArray.length);

        System.out.println("Array elements:");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + ", ");
        }
        System.out.println();
        
        // Print array in reverese order
        for (int j = strArray.length - 1; j >= 0; j--) {
            System.out.print(strArray[j] + ", ");
        }

         // Print even index elements of an array
        for (int i = 0; i < strArray.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Element at index " + i + " is : " + strArray[i]);
            }
        }


        System.out.println("Program Ended");
    }

}

