package ExceptionHandling;

public class DefaultExceptionHandling3 {
    public static void main(String[] args) {
        doStuff();
        System.out.println(10/0);
    }
    public static void doStuff() {
        System.out.println("doStuff() method call");
        doMoreStuff();
    }
    public static void doMoreStuff() {
        System.out.println("doMoreStuff() method call");
    }
}

/*
 * Output:
 * doStuff() method call
    doMoreStuff() method call
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionHandling.DefaultExceptionHandling3.main(DefaultExceptionHandling3.java:)
 */
