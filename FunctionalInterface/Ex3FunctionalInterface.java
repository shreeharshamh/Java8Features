 package FunctionalInterface;

/*
 * Program to demonstrate working of FunctionalInterface and Lambda Function 
 */

interface Calculator {
    public void add(int a, int b);
}

public class Ex3FunctionalInterface {
    public static void main(String[] args) {
        Calculator c = (a, b) -> System.out.println("Sum : " + (a + b));
        c.add(55, 63);
        c.add(98, 54);
    }
}