package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        catchFNFException();
    }

    public static void catchFNFException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = scanner.nextLine();
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("abc.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
        printWriter.append(message);
        printWriter.close();        
    }
    
}