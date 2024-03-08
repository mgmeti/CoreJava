//A new datatype called as Box
// This is just a template
// No physical reality for BOX

class Box {
    double width
    double height
    double depth
}

//This create an instance of box and this will have physical existence
// It will be having it's own variables and values
// Box myBox = new Box();

class BoxDemo{
    public static void main(String[] args){
        Box myBox = new Box();
        double volume;

        //Assign values to myBox's instance varibales
        myBox.width=10;
        myBox.height = 20;
        myBox.depth =15;

        //Compute volume of box
        volume = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is "+ volume);

    }
}