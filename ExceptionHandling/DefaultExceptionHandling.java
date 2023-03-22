package ExceptionHandling;

/*
 * Demonstration of DefaultExceptionHandling
 * Once the Main thread is initiated, a runtime stack is allocated in the jvm
 * from line 18, when the Main() calls doStuff() method, runtime stack is allocated for doStuff() in jvm
 * from line 22, when doStuff() calls doMoreStuff(), runtime stack is allocated for doMoreStuff() in jvm
 * line 26 : "Exception in thread "main" java.lang.ArithmeticException : / by zero " at doMoreStuff()
 * method inside which exception is raised is responsible to create Exception Object
 * 
 * jvm will check for handling code in method inside which exception is raised. If there is no
 * handling code, then the program will terminate abnormally without executing remaining code
 * and corresponding entry in stack will also be removed.
*/
public class DefaultExceptionHandling {
    
    public static void main(String[] args) {
        doStuff();    
    }

    public static void doStuff() {
        doMoreStuff();
    }
    
    public static void doMoreStuff() {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(10/2);
            e.printStackTrace();
        }
    }

    /* Output will have Runtime Exception :
     *Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DefaultExceptionHandling.doMoreStuff(DefaultExceptionHandling.java:21)
        at DefaultExceptionHandling.doStuff(DefaultExceptionHandling.java:17)
        at DefaultExceptionHandling.main(DefaultExceptionHandling.java:13)
     */
}
