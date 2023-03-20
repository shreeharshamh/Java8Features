Functional Interface
--------------------
is the interface is the one which has Single Abstract Method.
To invoke Lambda Expression, compulsorily Functional Interface is required.
Lambda Expression are anonymous function 
    No name
    No return type
    No modifiers
Example for Lambda Expression
program to add two numbers

public void int (int a, int b) {
    return a + b;
}
above method in Lambda Expression is as follows :
(int a, int b) -> { a + b; }
(a, b) -> a + b;                compiler get the type automatically
                                brases are optional if there is only one statement
(a, b) -> { return a+b; }       without curly brases you cannot use return statement.

examples of Single Abstract Method (SAM)
----------------------------------------
Runnable        = run()
Callable        = call()
Comparable      = compareTo()
Comparator      = compare()
ActionListener  = actionPerformed()


default and static methods in Functional Interface
--------------------------------------------------
We can have default and static methods as many as we want in a Functional Interface
Example
-------
@FunctionalInterface
interface interf {
    public void m1();               // SAM
    default void m2();              // default method
    public static void m3() {       // static method

    }


}