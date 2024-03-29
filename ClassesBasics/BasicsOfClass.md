
### Class and Object:-


Basics:
        Demo d = new Demo();

        Here:
            Demo -> ClassName
            d    -> Object Reference
            new  -> new operator
            Demo()  -> Constructor
            =   -> assignment operator
            ;   -> statement terminator



Re-Instantiation of reference variables

    Demo d1 = new Demo();

    s.o.p(d1) // Address of the object

    d1 = new Demo();

    s.o.p(d1); // Address of the new object
    (Think: What will happen with old object address?)

    Demo d2 = d1; // Storing value of d1 in d2

    // d1 and d2 are having address of same object
    // non-static variables changes in object by d1 or d2 will be reflected in both variables.


Note:
1. Non static variables of objects are independent.
2. The changes od non-static variables in a object can not alter the non-static variables of other objects.
3. static - One copy per class
4 non-static - one copy per object






