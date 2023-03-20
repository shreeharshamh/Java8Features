package FunctionalInterface;
/*
 * Demonstration to show that the Threads operate simulataneously
 * Multi Threading example
 */

class MyRunnable implements Runnable {
    public void run() {
        for(int i=0; i<10; i++) System.out.println("Child Thread " + i);
    }
}

class Ex4RunnableFunctionalInterface {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main Thread " + i);
        }
        Runnable r1 = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("Runnable Thread " + i);
            }
        };
        r1.run();
        
    }
}