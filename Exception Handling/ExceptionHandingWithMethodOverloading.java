package org.myLearning.dev.learn;

import java.io.*; 

public class ExceptionHandingWithMethodOverloading {
	
}

/*Exception Handling with Method Overriding 
many rules are available

Rule 1: 
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
*/

   
class Parent{ 
	//define method
	void msg() {
		System.out.println("parent method");
	}
}
    

class TestExceptionChild extends Parent{
	// overriding the method in child class  
	// gives compile time error
	void msg() throws IOException {
		System.out.println("TestExceptionChild"); 
	}
	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg(); 
	}
}
	

/*
 Rule 2: 
 	If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
 */
 
class Parent1{ 
	//define method
	void msg() {
		System.out.println("parent method");
	}
}
	    
	class TestExceptionChild1 extends Parent1{    
	  void msg()throws ArithmeticException {    
	    System.out.println("child method");    
	  }    
	  
	  public static void main(String args[]) {    
	   Parent1 p = new TestExceptionChild1();    
	   p.msg();    
	  }    
	}  
	
	
	
/*
 Rule 3: 
 	If the superclass method declares an exception, subclass overridden method can declare the same subclass exception or no exception but cannot declare parent exception.
 */
	
	
	    class Parent2{    
		  void msg()throws ArithmeticException {  
		    System.out.println("parent method");  
		  }    
		}    		    
		class TestExceptionChild2 extends Parent2{
			void msg()throws Exception {  
			    System.out.println("child method");  
			  }
			  public static void main(String args[]) {
				  Parent2 p = new TestExceptionChild2();    		     
				   try {    
				   p.msg();    
				   }  
				   catch (Exception e){
					   
				   }
			  }
		}


		
		
/*
 Rule 4:
 	subclass overridden method declares same exception ??  yes
 Rule 5:
 	subclass overridden method declares subclass exception??  yes
 Rule 6:
 	subclass overridden method declares no exception??  yes
 
 */
 */