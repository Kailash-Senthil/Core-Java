package org.myLearning.dev.learn;

public class VariableAndDatatypeLearning {
	/*
	 Variable:
	 A variable is a container which holds the value while the Java program is executed.
	 Variable is a name of memory location.
	 It is a combination of "vary + able" which means its value can be changed.
	 
	 Syntax:
	 dataType variableName = value;
	  
	 Types:
	 	1.local
	 	2.instance
	 	3.static.
	 	
| Feature             | **Local Variable**                                 | **Instance Variable**                      | **Static Variable**                    |
| ------------------- | -------------------------------------------------- | ------------------------------------------ | -------------------------------------- |
| **Defined in**      | Inside a method, constructor, or block             | Inside a class, but **outside** any method, | Inside a class, using `static` keyword |
					                                     constructor, or block                         but **outside** any method,constructor,
										                                           or block. It cannot be local.
												                           share it among all the instances of
												                           the class
																			 
| **Memory Location** | Stack                                              | Heap                                       | Method Area (shared across class)      |

| **Scope**           | Within the method/block only                       | Accessible through object                  | Accessible through class (or object)   |


| Location                 | Access Instance Var  | Access Static Var  |
| ------------------------ | -------------------  | -----------------  |
| **Instance Method**      | ✅ Yes               | ✅ Yes             |
| **Static Method**        | ❌ No (needs object) | ✅ Yes             |
| **Instance Initializer** | ✅ Yes               | ✅ Yes             |
   Normal Block
| **Static Initializer**   | ❌ No                | ✅ Yes             |
   Static Block 
   constructor            | ✅ Yes               | ✅ Yes             |   
	


| **Lifetime**        | Created when method starts, destroyed when it ends | Lives as long as the object exists         | Lives as long as the class is loaded   |

| **Default Value?**  | ❌ Must be initialized manually                     | ✅ JVM gives default values                 | ✅ JVM gives default values    
        
| **Accessed using**  | Just the variable name                             | `object.variableName`                      | `ClassName.variableName`
                                                                                                                       | `object.variableName`
                                                                                                                       
| **Belongs to**      | Method                                             | Object                                     | Class                                  |

	 	
	 */
	
	static int a = 10; // static variable
	int b = 20;  // instance variable
	public static void main(String[] args) {
		int c=50;//local variable
		VariableAndDatatypeLearning variableAndDatatypeLearning = new VariableAndDatatypeLearning();
		System.out.println("Local Variable c: " + c);
		System.out.println("Instance Variable c: " + variableAndDatatypeLearning.b);
		System.out.println("Static Variable c: " + variableAndDatatypeLearning.a);
		
		
		/*
		   Data Types:
		   		data types specify the different sizes and values that can be stored in the variable or constants.
		   		Java a strongly typed language.
		   		
		   Types:
		        1.Primitive Data Types
		        2.Non-Primitive Data Types
		        
		   Primitive Data Types:
		       		primitive data types are the building blocks of data manipulation
		       		1 byte = 8 bits
		       		n = no of bits
		       		formula:
		       		      -(2^n-1) to (2^n-1)-1
		       		1.Non Numeric Type
		       		2.Numeric Type
		       		Non Numeric Type:      Default Value:       Wrapper Class:    Size(Byte)      Real Time Usage:
		       		   boolean               false                 Boolean              1            true/false
                       char                  \u0000                Char                 2            single char(Unicode character)
                                        (lowest unicode char)
                       
                       Unicode:
                            to support the internationalisation and representation of characters from various languages and writing systems. 
                    Numeric Type:
                    1.Integer
                    2.Floating Point
                    Integer:                
                       byte                  0                     Byte                 1             2 digit
                       short                 0                     Short                2             4 digit
                       int                   0                     Int                  4             9 digit
                       long                  0                     Long                 8             19 digit
                    Floating Point:
                       float                 0.0f                  Float                4             7 decimal digit
                       double                0.0                   Double               8             15 decimal digit
                       
                    Wrapper Class:
                       classes of data type is called wrapper Class
                       jdk 1.5 feature
                       why??
                          Java is an object-oriented language, and some features (like collections or generics) require objects, not primitives. 
                          Allows primitives to act like objects.
                          // will see in later.
            
            Non-Primitive Data Types:
                    non-primitive data types are also known as reference data types. It is used to store complex objects rather than simple values.
                    Reference data types store references or memory addresses that point to the location of the object in memory.
                    
                    1. Class
                    2. Interface
                    3. Arrays
                    4. String
                    5. enum
                    //will see all the above separate topics 
		       		
		        		
		   
		   */
		
        byte myByte = 10;
        short myShort = 2000;
        int myInt = 123456789;
        long myLong = 123456789012345L;// end as L/l
        float myFloat = 3.14159265358979f;// end as f    3.14159265358979f => 3.1415927  (if more than 7 precision digits, 7th digit will round up)
        double myDouble = 3.14159265358979;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
	}

}
