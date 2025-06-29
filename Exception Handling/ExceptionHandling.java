package org.myLearning.dev.learn;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {
	/*
	 Exception:
	 	An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 
	 Exception Handling:
	 	Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException,etc.
	 types:
	 	Checked (Compiletime) Exception:
	 		the compiler verifies that the code handles these exceptions either by catching them or declaring them in the method signature using the throws keyword.
	 		Example:
	 			IOException: An exception is thrown when an input/output operation fails, such as when reading from or writing to a file.
            	SQLException: It is thrown when an error occurs while accessing a database.
            	ParseException: Indicates a problem while parsing a string into another data type, such as parsing a date.
            	ClassNotFoundException: It is thrown when an application tries to load a class through its string name using methods like Class.forName(), but the class with the specified name cannot be found in the classpath.
		Unchecked (Runtime) Exception :
			runtime exceptions usually occur due to programming errors, such as logic errors or incorrect assumptions in the code.
			Example:
				NullPointerException: It is thrown when trying to access or call a method on an object reference that is null.
				ArrayIndexOutOfBoundsException: It occurs when we try to access an array element with an invalid index.
				ArithmeticException: It is thrown when an arithmetic operation fails, such as division by zero.
				IllegalArgumentException: It indicates that a method has been passed an illegal or inappropriate argument.
	Error:
		Errors are typically caused by issues outside the control of the application, such as system failures or resource exhaustion.
		Errors are not meant to be caught or handled by application code. 
		Example:
			OutOfMemoryError: It occurs when the Java Virtual Machine (JVM) cannot allocate enough memory for the application.
			StackOverflowError: It is thrown when the stack memory is exhausted due to excessive recursion.
			NoClassDefFoundError: It indicates that the JVM cannot find the definition of a class that was available at compile-time.
			
	try { 
    	//a block that may throw an exception.
    	//try block must be followed by either catch or finally. 
	} catch (Exception e) {  
    	// block that handled the exception   
	} finally {  
    	// execute cleanup code, such as closing or releasing resources.
    	//It is executed whether an exception is handled or not.  
	} 
	
	 The JVM firstly checks whether the exception is handled or not. 
	 If an exception is not handled, JVM provides a default exception handler that performs the following tasks:
		Prints the exception description.
		Prints the stack trace (Hierarchy of methods where the exception occurred).
		Causes the program to terminate.
	 But if the programmer handles the exception, the normal flow of the application is maintained, i.e., rest of the code is executed.
	 
	 
	 The finally block will not execute if the program exits (either by calling System.exit() or by causing a fatal error that causes the process to abort).
	 */
	  public static void main(String args[]){    
		   try{    
		      //code that may raise exception    
		      int data=100/0;    
		   }catch(ArithmeticException e){System.out.println(e);}    
		   //rest code of the program     
		   System.out.println("rest of the code...");    
		  }   
	  /*
	   try {   
	   } catch (ExceptionType e or Exception_class_Name ref) {    
	   }
	   
	   try {            
       } finally {
       } 
        
	   try {   
		} catch (IOException e) {    
		} catch (NumberFormatException e) {  
		} catch (Exception e) {   
		}  
	   
	   try {
       } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
       }
       
       
       try {   
    		try {   
    		} catch (ExceptionType1 e1) {   
    		}  
	   } catch (ExceptionType2 e2) {  
	   }  
	   
	   */
	  
  
	  
	  
	  /*
| **Aspect**     | `final`                         | `finally`                   | `finalize()`                        |
| -------------- | ------------------------------- | --------------------------- | ----------------------------------- |
| Keyword/Method | Keyword                         | Block (used with try-catch) | Method (from Object class)          |
| Applies to     | Variables, methods, classes     | Exception handling blocks   | Objects                             |
| Inheritance    | Prevents inheritance/overriding | Not related                 | Can be overridden                   |
| Execution      | At compile-time                 | At runtime after try/catch  | Before GC (JVM decides)             |
| Purpose        | Restriction                     | Resource cleanup            | Cleanup before destruction          |
| Example        | `final int x = 10;`             | `finally { close(); }`      | `protected void finalize() { ... }` |

*/

}



/*
Exception Propagation:
			An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method. 
			If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack.
			This is called exception propagation.
*/

//By default Unchecked Exceptions are forwarded in calling chain (propagated).

class TestExceptionPropagation1{  
	  void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}
//exception handled
//normal flow...


//By default, Checked Exceptions are not forwarded in calling chain (propagated).
class TestExceptionPropagation2{  
	  void m(){  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
	   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
	}  


//compiletime error


/*
Exception propagation is the behavior that allows exceptions to be passed along the call stack until they are caught or cause the program to terminate.
throw and throws work together to facilitate this behavior.
 
throw: Used to throw an exception at runtime — it’s the mechanism to trigger and propagate exceptions.

throws: Used in the method signature to declare that a method might propagate an exception to the caller. it’s part of exception declaration and propagation.
 */


    class ThrowsControlFlow {
    public static void caller() {
        try {
            risky();
        } catch (Exception e) {
            System.out.println("Handled IOException");
        }
    }

    public static void risky() throws IOException, SQLException {
    	/*
    	 declared checked exception
    	 can't throws unchecked exception
    	 Multiple exceptions declared
    	 throw null; // converts into NullPointerException at runtime
    	 */

    }
    
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Throwing exception");
            /*
              throw new RuntimeException("Unchecked");
              Or
              throw new IOException("Checked");  // Must be declared or handled if checked
              Cannot throw multiple exceptions here at once
              can't throw null
             */
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}


/*


| Aspect                                        | `throw`                                                                              | `throws`                                                                   |
| --------------------------------------------- | ------------------------------------------------------------------------------------ | -------------------------------------------------------------------------- |
| **What it does**                              | Actually **throws** an exception instance (object) at runtime                        | Declares that a method **may throw** one or more exceptions to its caller  |
| **Where used**                                | Inside method body                                                                   | In method signature (declaration)                                          |
| **Syntax example**                            | `throw new IOException("Error");`                                                    | `public void read() throws IOException { ... }`                            |
| **Purpose**                                   | To **actively throw** an exception                                                   | To **inform callers** about checked exceptions they must handle or declare |
| **Type of exceptions involved**               | Any exception object (checked or unchecked)                                          | Only checked exceptions (unchecked exceptions don’t require declaration)   |
| **Effect on program flow**                    | Transfers control immediately to nearest matching catch block or JVM if none         | Forces caller to handle or propagate the declared exceptions               |
| **Supports exception chaining?**              | ✅ Yes, by creating new exception objects with a cause (`new Exception(msg, cause)`)  | ❌ No, it only declares exceptions, does not throw or chain                 |
| **Can be used to re-throw exceptions?**       | ✅ Yes, you can throw a caught exception or new one                                   | ❌ No, it does not throw exceptions itself                                  |
| **Can throw multiple exceptions at once?**    | ❌ No, only one exception object per `throw` statement                                | ✅ Yes, can declare multiple exceptions separated by commas                 |
| **When checked exceptions must be declared?** | Not applicable here; `throw` throws the exception, declaration happens with `throws` | ✅ Must be declared for checked exceptions in method signature              |
| **Can be used for unchecked exceptions?**     | ✅ Yes, you can throw unchecked exceptions too                                        | ❌ No need to declare unchecked exceptions (but allowed)                    |
| **Compiler enforcement**                      | Compiler checks if thrown checked exceptions are declared or handled                 | Compiler requires method to declare checked exceptions thrown              |
| **Typical use cases**                         | Throwing new or re-thrown exceptions inside methods                                  | Declaring potential exceptions in method signature                         |
| **Can it throw `null`?**                      | ❌ Throws `NullPointerException` if argument is `null`                                | Not applicable                                                             |
| **Can be used outside method body?**          | ❌ No, only inside executable code blocks                                             | ✅ Yes, only in method signature                                            |

 */
