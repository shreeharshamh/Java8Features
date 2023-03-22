Exception Hierarchy
-------------------
For all exceptions and errors Throwable is the root class for Java Exception Hierarchy.

Throwable   -----> Exception -----> Recoverable
            -----> Error     -----> Non-Recoverable

Exceptions are caused by our program and are recoverable by programmer. Exceptions can be handled
by try-catch-finally block or throws keyword

Errors are caused do to lack of system resources but not by the program. They are non-recoverable 
by prgrammer.


Exception   -----> Runtime Exception
                -----> Arithmetic Exception
                -----> NullPointer Exception
                -----> IndexOutOfBounds Exception
                    -----> ArrayIndexOutOfBounds Exception
                    -----> StringIndexOutOfBounds Exception
                -----> IllegalArgument Exception
                    -----> NumberFormat Exception
            
            -----> Remote Exception
            
            -----> IO Exception
                -----> EndOfFileException
                -----> FileNotFoundException
            
            -----> Servlet Exception 
            -----> etc...

Error       -----> VMError
                -----> StackOverFlow Error
                -----> OutOfMemory Error
            -----> LinkageError
                -----> VerifyError
            -----> Assertion Error
            -----> ExceptionInInitialization