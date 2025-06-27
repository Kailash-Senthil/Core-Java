package org.myLearning.dev.learn;

public class HelloWorldProgram {
	/*
	Valid Java main() method signature:
		public static void main(String[] args)  
	   	public static void main(String []args)  
       		public static void main(String args[])  
       		public static void main(String... args)  
       		static public void main(String[] args)  
       		public static final void main(String[] args)  
       		final public static void main(String[] args)  
       		final strictfp public static void main(String[] args)  	
       
       What does String[] args mean?
       		String[] → An array of String objects
       		args → The name of the variable (short for arguments).
       		String[] args allows the program to receive command-line arguments when it's run.
       		
       		Why is it an array?
       		 		Because you might pass zero, one, or many arguments to a Java program via the command line. Java collects these arguments into an array so you can easily loop over them or access them by index.
       				java MyProgram hello world 123
					public static void main(String[] args) {
    					System.out.println(args[0]); // hello
    					System.out.println(args[1]); // world
    					System.out.println(args[2]); // 123
					}
			
		    Why String?
			        All command-line arguments are passed as text, so they are received as String values, even if they represent numbers. It's up to you to parse them if needed.
			        int number = Integer.parseInt(args[2]); // Converts "123" to int
			        
			   
			        
			        
       String[] args;   // Preferred modern style
       String args[];   // Still valid (older C-style syntax)
             
       
       String[] args;   // This is the clearest, as it groups the brackets with the type
       String []args;   // This still means the same thing: an array of Strings



       ... (called the ellipsis) is the varargs operator:
             It allows the method to accept zero or more arguments of the specified type
             		
             public void printNames(String... names) {
    			for (String name : names) {
        			System.out.println(name);
    			}
			 }

			 printNames(); // prints nothing
			 printNames("Alice");
			 printNames("Alice", "Bob", "Charlie");
			 
		
       [access modifier] [non-access modifiers] return_type method_name(params)
             Java allows you to reorder modifiers like public, static, final, etc. — as long as they appear before the return type (void in this case
             example:
             	public static void main(String[] args)
             	static public void main(String[] args)
             	final public static void methodName() { }
             	synchronized private final void doSomething() { }



	strictfp(strict floating point):
		Java is a platform-independent language, but not all hardware handles floating-point math (like float and double) the same way. Some CPUs (especially older x86 chips) use extended precision (80-bit), while others use 64-bit double precision.
		This could lead to small differences in floating-point results when the same Java program is run on different machines.
		Enter strictfp:
			When you use strictfp, you force Java to follow strict IEEE 754 rules, disabling any extra precision that a platform might try to use.
			Modern JVMs are usually already very consistent, so strictfp is niche.
		Where can you use strictfp?
			On classes
			On interfaces
			On methods
			You cannot use strictfp on block or variables or constructors.
			Examples:
			   strictfp class MyClass { ... }
                           strictfp interface MyInterface { ... }
                           strictfp void doMath() { ... }
	*/

	public static void main(String[] args) {
		System.out.println("Hello World");

	}

}
