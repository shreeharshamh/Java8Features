package ExceptionHandling;

public class DefaultExceptionHandling2 {
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff() {
        doMoreStuff();
        System.out.println(10/0);
    }
    public static void doMoreStuff() {
        System.out.println("Hello");
    }

    /*
     * Output:
     * Hello
     * Exception in thread "main" java.lang.ArithmeticException : / by zero
     *          at DefaultExceptionHandling2.doStuff(DefaultExceptionHandling2.java:)
     *          at DefaultExceptionHandling2.main(DefaultExceptionHandling2.java:)
     * 
     */

}
