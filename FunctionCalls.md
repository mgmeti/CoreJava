#### Passing Object References to a Function:
##### Caller Function
    Function which is calling another function is known as caller function.
##### Called Function
    Function which is called by another function is known as called function.

Case 1:
    if A is function and B is another function, how B makes call to A?
    ANS: A();

Case 2:
    if A is function with int type parameter and B is another function, how B makes call to A?
    ANS: A(value); 
    B must pass int type value to A function.

Case 3:
    if A is function with double type parameter and B is another function, how B makes call to A?
    ANS: A(value); 
    B must pass double type value to A function.

Case 4:
    if A is a function with Demo1 class type parameter
    B is another function , how B Makes call to A
    ANS: A(object);
    B must pass object of Demo1 class type to A function.