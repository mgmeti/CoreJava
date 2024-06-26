#### Datatype:
Java is a strongly typed programming language.

1. Primitive Datatype
2. Non-Primitive Datatype

#### Primitive Datatype:
                    It is basic level datatype.
                    It is a predefined and available in the form keywords.
                    There are 8 Primitive Datatype.
    1. Integer Group - byte, short, int, long.
        Datatype - width
        -------------------
        byte - 1 byte (8 bits [2^8])
        short - 2 bytes (16 bits [2^16])
        int - 4 bytes (32 bits [2^32])
        long - 8 bytes (64 bits [2^64])

    2. Floating Point Numbers Group - float, double.
        Datatype - width
        -------------------
        float - 4 bytes
        double - 8 bytes
    3. Character Group - char
    4. Boolean Group - true, false.


Syntax:
    byte a, b; // declaration of  variables
    short c, d;
    int e, f; 
    long g,h;
    float highTemp, lowTemp; // Single precision
    double pi; // double precision

Note:
The datatypes like byte, shrot and literal numbers are auto-upgraded(data type widening) to int datatype before calculations.

1. Width of a datatype should not be thought of as the amount of storage it consumes but 
    rather as the behaviour it defines for variables and expressions of that type.
2. Java run-time environment is free to use whatever size it wants as long as the types behaves as you declared.
3. bytes and shorts are stored as 32-bit values to improves performance because that is the word size of most cumputer currently in use.

1. Strongly typed language (Statically typed)
    It means every variable, expression has a type and every type is strictly defined.
    The java compiler checks for type compatibility of expression and parameters.

2. Loosely typed language (Dynamically typed)
