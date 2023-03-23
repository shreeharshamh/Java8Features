package ExceptionHandling;

class CountingThread extends Thread {
    public void run() {
        for(int i=0; i<=20; i++) {
            if(i%2 == 0) {
                System.out.print(i + " ");           
            }
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

public class InterruptedExceptionHandling {
    public static void main(String[] args) {
       CountingThread countingThread = new CountingThread();
       countingThread.start(); 
       countingThread.interrupt();
    }

    
}
