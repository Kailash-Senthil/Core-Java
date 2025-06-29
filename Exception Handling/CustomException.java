package org.myLearning.dev.learn;

/*
Custom (User-Defined) Exception:
	Rule 1:
		This exception extends either the Exception class (for checked exception) or the RuntimeException class (for unchecked exceptions)
	Rule 2:
		need to write the constructor that takes a String as the error message, and it is called the parent class constructor.
		optional to add methods to provide additional details about the exception.
Why?
	It represents application-specific errors.
	To catch and provide specific treatment to a subset of existing Java exceptions.
	These are the exceptions related to business logic and workflow. It is useful for users and developers to understand the exact problem in a meaningful way.
	It provides clear, descriptive error messages for better debugging.	
*/
//This is a CHECKED exception
class MyCheckedException extends Exception {
public MyCheckedException(String message) {
   super(message);
}
}
//This is an UNCHECKED exception
class MyUncheckedException extends RuntimeException {
 public MyUncheckedException(String message) {
     super(message);
 }
}
public class CustomException {
	public void riskyMethod() throws MyCheckedException {
	    throw new MyCheckedException("Checked exception occurred");
	}	
	public void riskyMethods() {
	    throw new MyUncheckedException("Unchecked exception occurred");
	}
}






