package org.myLearning.dev.learn;

public class Arrays {
	
	/*
	 Arrays:
	 		Fixed-size container for elements of the same data type.
		Disadvantages:
			unused memory are waste.
			homogeneous.
	 	Types:
	 		1.Single Dimensional Array
			2.Multidimensional Array
			3.Anonymous Array
			4.Jagged Arrays
	 	
	 	
	 	
	 	Duplicate
	 	Fixed Size 
	 	Contiguous Memory
	 	Homogeneus
	 	null- insertion (Only object array supports)
	 	insertion order
	 	Serializable(I)
	 	Cloneable(I)
	 	RandomAcces(I) - No
	 	
	 	1D Data Structure:
	 	
	 	  a[k] = B(baseAddress) + W(Bytes) * k
	 	  example:
	 	  	a[0] = 1000 + 2 * 0 = 1000
	 	  
	 	2D Data Structure:
	 	
	 	  Row Major Formula:
	 	  a[i,j] = B + W(n(i-LBR) + (j-LBC)
	 	  example:
	 	  	a[0,0] = 1000 + 2 (3 * (0 - 0) + (0 - 0) = 1000
	 	  
	 	  Column Major Formula:
	 	  a[i,j] = B + W(m(j-LBR) + (i-LBC)
	 	  
	 	  LBC(lower bound Column)
	 	  LBR(lower bound Row)
	 	  
	 	  In java LBC and LBR is 0. Because java is starts from 0.
	 	  
	 */
	 public static int[] min(int arr[]){    //an array as a parameter  
	        return arr;    //return an Array
	    } 
	 
	 public static int[] printArray(int arr[]){   
		 return new int[]{10,30,50,90,60};
	 }

	public static void main(String[] args) {
		/* Single Dimensional Array
		 
		 Declaration:
				dataType[] arr; (or) 
				dataType []arr; (or)  
				dataType arr[] ;
		
		Instantiation:
				arrayRefVar=new datatype[size];  
	    */
		
		
		//declaration and instantiation of an array  
	    int a[]=new int[5];  
	    a[0]=10;//initialization    
	    a[1]=20;    
	    a[2]=70;    
	    a[3]=40;    
	    a[4]=50;    
	    //traversing array    
	    for(int i=0;i<a.length;i++){//length is the property of array    
	        System.out.println(a[i]);    
	    }  
	    
	    
	    //Declaration, Instantiation and Initialization
	    int b[]={33,3,4,5};//declaration, instantiation and initialization 
	    //traversal of an array using for-each loop    
	    for(int i:b)    
	        System.out.println(i);
	    
	    //receiving an array
	    int c[] = min(b); // an array as argument
	    for(int i:c)    
	        System.out.println(i);
	    
	    /*
	     Multidimensional Array
	     
	     Declaration:
	     	dataType[][] arrayRefVar; (or)  
			dataType [][]arrayRefVar; (or)  
			dataType arrayRefVar[][]; (or)  
			dataType []arrayRefVar[]; 
		
	     */
	    
	    //Instantiate Multidimensional Array:
		int[][] arr=new int[3][3];
		
		//initialize Multidimensional Array 
		
		arr[0][0]=1;  
		arr[0][1]=2;  
		arr[0][2]=3;  
		arr[1][0]=4;  
		arr[1][1]=5;  
		arr[1][2]=6;  
		arr[2][0]=7;  
		arr[2][1]=8;  
		arr[2][2]=9;  
		// Printing the 2D array  
		for (int i = 0; i < 3; i++) {    
	         for (int j = 0; j < 3; j++) {    
	              System.out.print(arr[i][j] + " ");    
	          }    
	          System.out.println();    
	    } 
		
        // Print array using for-each loop
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // new line after each row
        }
        
        /*
         Anonymous Array:
         	an array without a reference name, used directly in expressions like method calls.
         */
        
        printArray(new int[]{10,22,44,66});//passing anonymous array to method
        
        
			
	    /*
	     Jagged Arrays:
	     	an array of arrays where each row of the array can have a different number of columns.
	     */
        
        //declaring a 2D array with odd columns    
        int arr1[][] = new int[3][];    
        arr1[0] = new int[3];    
        arr1[1] = new int[4];    
        arr1[2] = new int[2]; 
        //int[][] jaggedArray = { {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };    Using Array Literals
        
        
        //initializing a jagged array    
        int count = 0;    
        for (int i=0; i<arr1.length; i++)    
            for(int j=0; j<arr1[i].length; j++)    
                arr1[i][j] = count++;    
     
        //printing the data of a jagged array     
        for (int i=0; i<arr1.length; i++){    
            for (int j=0; j<arr1[i].length; j++){    
                System.out.print(arr1[i][j]+" ");    
            }    
            System.out.println();//new line    
        } 
        
        
        /*
         ArrayIndexOutOfBoundsException:
         	ArrayIndexOutOfBoundsException is a runtime exception thrown by the Java Virtual Machine (JVM) when attempting to access an invalid index of an array.
         */
        
        int[] numbers = {10, 20, 30};

        System.out.println(numbers[0]); // 10
        System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        System.out.println(numbers[-2]); // ArrayIndexOutOfBoundsException
        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException
        
        
        /*Copying a Java Array
         
| Method                 | Type         | Notes                                |
| ---------------------- | ------------ | ------------------------------------ |
| `for` loop             | Manual       | Flexible but verbose                 |
| `clone()`              | Shallow copy | Easy syntax                          |
| `System.arraycopy()`   | Efficient    | Great for performance-critical tasks |
| `Arrays.copyOf()`      | Utility      | Simple and clean                     |Internally uses System.arraycopy()
| `Arrays.copyOfRange()` | Partial copy | Choose specific range to copy        |Internally uses System.arraycopy()
   int[] copy1 = original  does NOT copy the array — it just assigns the same reference to copy1.
   
   
Clone in 1D and 2D: 
Array Type	Clone Copies			Copy Type		Effect of Changes in Clone
1D Array	All elements			Deep copy		Changes in clone do not affect original
2D Array	Top-level array only	Shallow copy	Changes in inner arrays affect original (shared references)



| Feature                          | Shallow Copy                | Deep Copy    |
| -------------------------------- | --------------------------- | ------------ |
| Copies nested objects?           | No                          | Yes          |
| Changes in copy affect original? | Yes (nested objects shared) | No           |
| Complexity                       | Simple                      | More complex |
| Memory Usage                     | Less                        | More         |

   

System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
src: Source array
srcPos: Starting position in the source array
dest: Destination array
destPos: Starting position in the destination array
length: Number of elements to copy
         
         */
        
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[3];

        System.arraycopy(original, 1, copy, 0, 3);  
        // Copies elements from original[1] to copy[0], total 3 elements 
        // Copy -> [2, 3, 4]

       /*
		

| Feature                            | Object Array (`String[]`, `Integer[]`)             | Normal Array (`int[]`, `char[]`)  |
| ---------------------------------- | -------------------------------------------------- | --------------------------------- |
| **Stores**                         | References to objects                              | Raw primitive values              |
| **Supports `null`**                | ✅ Yes (can store `null` as a value)                | ❌ No (primitives can't be `null`) |
| **Methods available**              | ✅ Yes (e.g., `equals()`, `toString()`, etc.)       | ❌ No (primitives are not objects) |
| **Polymorphism**                   | ✅ Yes (e.g., `Object[] arr = new String[5];`)      | ❌ No                              |
| **Autoboxing/Unboxing needed**     | Yes, for wrapper types (`Integer`, `Double`, etc.) | No                                |
| **Memory usage**                   | More (due to object overhead)                      | Less                              |
| **Performance**                    | Slightly slower (indirect access via reference)    | Faster (direct memory access)     |
| **Useful in Collections/Generics** | ✅ Yes                                              | ❌ Not supported                   |

			
		String Array (String also object array)
Behavior	                 	 Explanation
✅ null values allowed			 A String[] can hold null elements. Example: arr[0] = null; is valid.
✅ Lexicographical sorting	     Arrays.sort() sorts strings alphabetically using Unicode ordering.
⚠️ Reference comparison risk	     Comparing strings with == checks reference, not content. Use .equals() instead.
✅ Strings are immutable	         Strings in the array can’t be changed (they can be replaced, but not modified).


1. String[] strAr1=new String[] {"Ani", "Sam", "Joe"}; //inline initialization  
2. String[] strAr2 = {"Ani", "Sam", " Joe"};  
3. String[] strAr3= new String[3]; //Initialization after declaration with specific size  
   strAr3[0]= "Ani";  
   strAr3[1]= "Sam";  
   strAr3[2]= "Joe";  
        
        */
        
        /*
         Arrays Default Values
| **Data Type**           | **Default Value** | **Notes**                       |
| ----------------------- | ----------------- | ------------------------------- |
| `byte[]`                | `0`               | Zero byte                       |
| `short[]`               | `0`               | Zero short                      |
| `int[]`                 | `0`               | Zero int                        |
| `long[]`                | `0L`              | Zero long                       |
| `float[]`               | `0.0f`            | Zero float                      |
| `double[]`              | `0.0d`            | Zero double                     |
| `char[]`                | `'\u0000'`        | Null character (`\0`, ASCII 0)  |
| `boolean[]`             | `false`           | Default boolean                 |
| `String[]` / `Object[]` | `null`            | Default for all reference types |
         */
	    

	}

}
