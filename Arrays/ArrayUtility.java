package org.myLearning.dev.learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayUtility {

	public static void main(String[] args) {;
		
        /* Sort 
        sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
        tim sort
        Arrays.sort(null)	Throws exception immediately	NullPointerException
        return nothing
         */
	      int[] arr = {5, 2, 9, 1, 7};
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr)); // [1, 2, 5, 7, 9]

        /*Binary Search (on sorted array)
        binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c)
        Arrays.binarySearch(null, key) if key is null also	Throws ullPointerException
        if key not present small number -->  -1 , big number --> -size+1
        return int
        */ 
        System.out.println("Index of 5: " + Arrays.binarySearch(arr, 5)); // 2

        /*Equals
        equals(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex, Comparator<? super T> cmp)
        should be same order
        returns false if one is null
        returns true if both is null
        even nested arrays are equals -> false
       */ 
        int[] arr2 = {1, 2, 5, 7, 9};
        System.out.println("Equals: " + Arrays.equals(arr,arr2)); // true

        /*deepEquals (used for nested arrays)
        deepEquals(Object[] a1, Object[] a2)
        returns false if one is null
        returns true if both is null         
         */ 
        Integer[][] nested1 = {{1, 2}, {3, 4}};
        Integer[][] nested2 = {{1, 2}, {3, 4}};
        System.out.println("Deep Equals: " + Arrays.deepEquals(nested1, nested2)); // true
        
        /* hashCode   
           returns hash code(int)
           if null -> 0
          */
        System.out.println("HashCode: " + Arrays.hashCode(arr));

        /*deepHashCode  (used for nested arrays)
          returns hash code(int)
          if null -> 0
         */ 
        
        System.out.println("Deep HashCode: " + Arrays.deepHashCode(nested1));
        
        /*
         Object.hashCode()
int[] a1 = {1, 2, 3};
int[] a2 = {1, 2, 3};

System.out.println(a1.hashCode());         // memory-based hash
System.out.println(a2.hashCode());         // different memory-based hash
Result: Different, even though values are same.

System.out.println(Arrays.hashCode(a1));   // content-based hash
System.out.println(Arrays.hashCode(a2));   // same as a1

         */
        
        /*toString 
         returns array as string
         if null -> "null"
         */ 
        System.out.println("ToString: " + Arrays.toString(arr));

        /*deepToString  (used for nested arrays) 
        returns array as string
         if null -> "null"
        */ 
        System.out.println("Deep ToString: " + Arrays.deepToString(nested1));

        /*
          compare (lexicographic comparison)
          if equals 0
          if comp1 is null or comes first  -> -1
          if comp2 is null or comes first  ->  1
         */
        int[] comp1 = {1, 2, 3};
        int[] comp2 = {1, 2, 4};
        System.out.println("Compare: " + Arrays.compare(comp1, comp2)); // -1

        /*
          negative number will convert positve using 2's complement
          compareUnsigned (lexicographic comparison)
          if equals 0
          if comp1 is null or comes first  -> -1
          if comp2 is null or comes first  ->  1
         
         */ 
        int[] unsigned1 = {1, 2, -3}; // -3 as unsigned = 4294967293
        int[] unsigned2 = {1, 2, 3};
        System.out.println("Compare Unsigned: " + Arrays.compareUnsigned(unsigned1, unsigned2)); // > 0

        /*copyOf
         Copies the specified array, truncating or padding with datatypes defaultValue (if necessary)
         Throws ullPointerException
         copyOf(U[] original, int newLength, Class<? extends T[]> newType)
String[] original = { "A", "B", "C" };
// Create a new array with length 5 and type String[]
String[] copy = Arrays.copyOf(original, 5, String[].class);
System.out.println(Arrays.toString(copy));
// Output: [A, B, C, null, null]  
    
         */ 
        int[] copy = Arrays.copyOf(arr, 7);
        System.out.println("Copy Of: " + Arrays.toString(copy)); // fills with 0 if size > arr.length

        /*
         copyOfRange
         Copies the specified range array, truncating or padding with datatypes defaultValue (if necessary)
         Throws ullPointerException
         copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType)
         
         */ 
        int[] range = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Copy Of Range: " + Arrays.toString(range)); // [2, 5, 7]

        /*fill
         */ 
        int[] filled = new int[5];
        Arrays.fill(filled, 8);
        System.out.println("Filled: " + Arrays.toString(filled)); // [8, 8, 8, 8, 8]

        // stream
        IntStream stream = Arrays.stream(arr);
        System.out.print("Stream: ");
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        /*
         asList
         Returns a fixed-size list backed by the specified array.
         Throws NullPointerException*/
        String[] strArr = {"Java", "Python", "C++"};
        List<String> list = Arrays.asList(strArr);
        System.out.println("As List: " + list);

        /* mismatch
          returns first mismatch elements index
          if both arrays are same return -1
          Throws NullPointerException*/
        int[] m1 = {1, 2, 3};
        int[] m2 = {1, 2, 4};
        System.out.println("Mismatch at index: " + Arrays.mismatch(m1, m2)); // 2

        /*parallelPrefix
         parallelPrefix(array,lambda expression or function);
         Cumulates, in parallel, each element of the given array in place, using the supplied function.
         throws NullPointerException
         */ 
        int[] prefix = {1, 2, 3, 4};
        Arrays.parallelPrefix(prefix, (x, y) -> x + y);
        System.out.println("Parallel Prefix (sum): " + Arrays.toString(prefix)); // [1, 3, 6, 10]

        /*parallelSetAll
         parallelSetAll(array,lambda expression or function);
         parallely Set all elements of the specified array, using the provided generator function to compute each element.
         @throws NullPointerException
         */ 
        int[] parallelSet = new int[5];
        Arrays.parallelSetAll(parallelSet, i -> i * i);
        System.out.println("Parallel SetAll (squares): " + Arrays.toString(parallelSet)); // [0, 1, 4, 9, 16]

        /*parallelSort
         parallelSort(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp)
         throws NullPointerException */ 
        int[] unsorted = {9, 2, 5, 1, 7};
        Arrays.parallelSort(unsorted);
        System.out.println("Parallel Sort: " + Arrays.toString(unsorted)); // [1, 2, 5, 7, 9]

        /*setAll
         Set all elements of the specified array, using the provided generator function to compute each element.
         setAll(int[] array, function)
         Throws NullPointerException 
         */ 
        int[] setAllArray = new int[4];
        Arrays.setAll(setAllArray, i -> i + 100);
        System.out.println("SetAll: " + Arrays.toString(setAllArray)); // [100, 101, 102, 103]
        
        
        /*
         Fork/Join framework introduced in Java 7 to process array elements concurrently.
         Splits the array into chunks.
		 Submits these chunks as tasks to the ForkJoinPool.commonPool().
		 Each chunk is processed by a separate thread in parallel.
		 Each thread applies your lambda expression like i -> i * i for its assigned indexes.
		 All results are written back into the original array.
         */

	}

}
