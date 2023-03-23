Exception Hierarchy
-------------------
For all exceptions and errors Throwable is the root class for Java Exception Hierarchy.

Throwable   -----> Exception -----> Recoverable
            -----> Error     -----> Non-Recoverable

Exceptions are caused by our program and are recoverable by programmer. Exceptions can be handled
by try-catch-finally block or throws keyword

Errors are caused do to lack of system resources but not by the program. They are non-recoverable 
by prgrammer.

Partially Checked
Exception   -----> Runtime Exception                    Unchecked Exception
                -----> Arithmetic Exception
                -----> NullPointer Exception
                -----> IndexOutOfBounds Exception
                    -----> ArrayIndexOutOfBounds Exception
                    -----> StringIndexOutOfBounds Exception
                -----> IllegalArgument Exception
                    -----> NumberFormat Exception
            
            -----> Remote Exception
            
            -----> IO Exception                         Checked Exception
                -----> EndOfFileException
                -----> FileNotFoundException
            
            -----> Servlet Exception                    Checked Exception
            -----> etc...

Unchecked
Error       -----> VMError
                -----> StackOverFlow Error
                -----> OutOfMemory Error
            -----> LinkageError
                -----> VerifyError
            -----> Assertion Error
            -----> ExceptionInInitialization

1. IO Exception             Checked (Fully Checked)
2. Runtime Exception        Unchecked
3. Interrupted Exception    Checked (Fully Checked)
4. Error                    Unchecked
5. Throwable                Checked (Partially Checked)
6. ArithmeticException      Unchecked
7. NullPointerException     Unchecked
8. Exception                Checked (Partially Checked)
9. FileNotFoundException    Checked (Fully Checked)