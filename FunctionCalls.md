####  Object Communication

##### Caller Function
    Function which is calling another function is known as caller function.
##### Called Function
    Function which is called by another function is known as called function.
##### Passing Object References to a Function:
Case 1:
    if 'A' is function and 'B' is another function, how 'B' makes call to 'A'?
    ANS: A();

Case 2:
    if 'A' is function with int type parameter and B is another function, how 'B' makes call to 'A'?
    ANS: A(value); 
    'B' must pass int type value to 'A' function.

Case 3:
    if 'A' is function with double type parameter and 'B' is another function, how 'B' makes call to 'A'?
    ANS: A(value); 
    'B' must pass double type value to 'A' function.

Case 4:
    if 'A' is a function with Demo1 class type parameter
    'B' is another function , how B Makes call to 'A'
    ANS: A(object);
    'B' must pass object of Demo1 class type to 'A' function.


Demo1 class has test() method and x member variable.
Sample1 class has operateOn(Deom1 arg) method.
MainClass has main method which is  calling operateOn method by passing object directly and also with object refernces.

```java
System.out.println("Main Method starts");
	Sample1 s1 = new Sample1();
	// Passing Demo1 object to Sample1 classes's operateOn method
	s1.operateOn(new Demo1()); // passing object directly
	
	System.out.println("=======================");
	Demo1 d1 = new Demo1();
	s1.operateOn(d1); // passing object reference to function
		
System.out.println("Main Method ends");
```

##### Returning Object References from a Function:

case 5:
    if 'A' is function with void return type, what it means?
    ANS: 'A' function returns nothing to caller function.

case 6:
    if 'A' is function with int return type, what it means?
    ANS: 'A' function returns int value to caller function.
         Caller function should recieve int value and store it in int type variable.

case 7:
    if 'A' is function with  object of String return type, what it means?
    ANS: 'A' function returns object of String to caller function.
         Caller function should recieve String object and store it in String object reference variable.
case 8:
    if 'A' is function with object of Demo1 return type, what it means?
    ANS: 'A' function returns object of Demo1 to caller function.
         Caller function should recieve Demo1 object and store it in Demo1 object reference variable.

class Sample2 has getObject() method with object of Demo1 return type
MainClass has main method which is  calling getObject() by using Sample2 object's reference.
Main method should have Demo1 reference to store object returned by getObject() method of Sample2 class type

```java
Sample2 s2 = new Sample2();
	Demo1 d = s2.getObject();
	d.test();

```
  


Question:
An HR in an organization is responsible to update the salary of the given employee, 
based on the performance rating.
Below table gives the information about how match the employee should get increment.

Rating    inceremet perc(%)
1           50
2           40
3           35
4           25
5           20
other       5

Using relevent principles, write a solution in java


entity -> employee
attributes: empid,  name, dept, salary, rating
behavours: display salary


entity -> sub class Hr
behaviours: updateSalary




