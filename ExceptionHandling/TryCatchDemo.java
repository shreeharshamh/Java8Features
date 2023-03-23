package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * Using try-catch block to handle java.lang.ArithmeticException : / by zero
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("try-catch demo");
        try {
            System.out.println(10/0);   // Risky Code
        } catch (ArithmeticException e) { 
            System.out.println(e);              // Handling code
        } finally {
            PrintWriter printWriter;
            try {
                printWriter = new PrintWriter("abc.txt");
                printWriter.println("Hello World");
            }  catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main Thread ended.");
    }    
}

/*
 * OUTPUT
 *  try-catch demo
 *  java.lang.ArithmeticException: / by zero
 *  Main Thread ended.
 */