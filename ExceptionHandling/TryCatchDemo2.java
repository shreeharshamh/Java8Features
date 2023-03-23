package ExceptionHandling;

public class TryCatchDemo2 {
    public static void main(String[] args) {
     
        System.out.println("statemet-1");
     
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        System.out.println("statemet-2");
    }
    
}
