package org.myLearning.dev.learn;

public class OperatorsLearning {
	/*
	 Operators:
	 	operator is a symbol that is used to perform operations on variables and values
	 	types:
           	1.Unary Operator
			2.Arithmetic Operator
			3.Relational Operator
			4.Ternary(conditional) Operator
			5.Assignment Operator
			6.Bitwise Operator
			7.Logical Operator
			8.Shift Operator
			
	 Operand:
	   		An operand is a literal value or variable or expression on which an operator acts.
	   	    int result = 10 + (5 * 2);
            Operands: 10, 5, 2
			Operators: +, *
			This expression evaluates to 10 + (5 * 2) → 20
			
	 Java Operator Precedence Table:
	 
	 | **Precedence** | **Operators**                          | **Description**                          | **Associativity** |               |               |
| -------------- | -------------------------------------- | ---------------------------------------- | ----------------- | ------------- | ------------- |
| 1              | `()` `[]` `.`                          | Method call, array access, member access | Left to right     |               |               |
| 2              | `++` `--` (postfix)                    | Post-increment/decrement                 | Left to right     |               |               |
| 3              | `++` `--` `+` `-` `~` `!` (prefix)     | Unary operators                          | Right to left     |               |               |
| 4              | `*` `/` `%`                            | Multiplicative                           | Left to right     |               |               |
| 5              | `+` `-`                                | Additive                                 | Left to right     |               |               |
| 6              | `<<` `>>` `>>>`                        | Bitwise shift                            | Left to right     |               |               |
| 7              | `<` `<=` `>` `>=` `instanceof`         | Relational                               | Left to right     |               |               |
| 8              | `==` `!=`                              | Equality                                 | Left to right     |               |               |
| 9              | `&`                                    | Bitwise AND                              | Left to right     |               |               |
| 10             | `^`                                    | Bitwise XOR                              | Left to right     |               |               |
| 11             | '|'                                    | Bitwise OR                               | Left to right     |               |
| 12             | `&&`                                   | Logical AND                              | Left to right     |               |               |
| 13             | '||'                                   | Logical OR                               | Left to right     |
| 14             | `?:`                                   | Ternary conditional                      | Right to left     |               |               |
| 15             | `=`, `+=`, `-=`, `*=`, `/=`, `%=` etc. | Assignment                               | Right to left     |               |               |

	 */

	public static void main(String[] args) {
		/*
		 Unary Operators
		 
		 +		Unary Plus                      positive value
		 -		Unary Minus                     convert positive value to negative value
		 !		Logical Complement Operator		flip the boolean value
		 ~      Bitwise complement operator     flips every bit in the binary representation of the number
		 ++		Increment                       increase the value by one. post-increment (operand++) or pre-increment (++operand).
		 --		Decrement 						decrease the value by one. post-decrease  (operand--) or pre-decrease  (--operand).
		 */
		int x=10;    
		System.out.println(+x);    //10     
		System.out.println(-x);    //-10
		boolean c=true;      
		boolean d=false;  
		System.out.println(!c);	   //false (opposite of boolean value)      
		System.out.println(!d);    //true  
		int a=10;       
		System.out.println(~a);    //-11     
		//Binary of 10 (in 32 bits):		00000000 00000000 00000000 00001010
		//Applying ~:						11111111 11111111 11111111 11110101  ← this is the binary of -11    (two's complement)
		int b=-10;  
		//Binary of -10 (two's complement):	11111111 11111111 11111111 11110110
		//Applying ~:						00000000 00000000 00000000 00001001  ← this is the binary of 9
		System.out.println(~b);//9   
		x=10;    
		System.out.println(x++);   //10 (11)    
		System.out.println(++x);   //12 
		x=10;
		System.out.println(x--);   //10 (9)
		System.out.println(--x);   //8  
		
		/*
		 Arithmetic Operator
		 
| **Operator** | **Name**       | **Description**                                   |
| ------------ | -------------- | ------------------------------------------------- |
| `+`          | Addition       | Adds two numbers.                                 |
| `-`          | Subtraction    | Subtracts one number from another number.         |
| `*`          | Multiplication | Multiplies two numbers.                           |
| `/`          | Division       | Divides one number by another number.             |
| `%`          | Modulus        | Divides and returns the remainder of two numbers. |
*/
		 a=10;      
		 b=5;      
		 System.out.println(a+b);	//15      
		 System.out.println(a-b);	//5      
		 System.out.println(a*b);	//50      
		 System.out.println(a/b);	//2      
		 System.out.println(a%b);	//0   
		 
		 /*
		  Relational Operator
		  
| **Operator** | **Name**                 | **Description**                                         |
| ------------ | ------------------------ | ------------------------------------------------------- |
| `==`         | Equal to                 | Checks if two values are equal.                         |
| `!=`         | Not equal to             | Checks if two values are not equal.                     |
| `>`          | Greater than             | Checks if left value is greater than right.             |
| `<`          | Less than                | Checks if left value is less than right.                |
| `>=`         | Greater than or equal to | Checks if left value is greater than or equal to right. |
| `<=`         | Less than or equal to    | Checks if left value is less than or equal to right.    |

		  */
		 
		 a = 10;
		 b = 20;

		 System.out.println(a < b);    // true
		 System.out.println(a > b);    // false
		 System.out.println(a <= b);   // true
		 System.out.println(a >= b);   // false
		 System.out.println(a == b);   // false
		 System.out.println(a != b);   // true
		 
		 
		 /*
		  Logical Operator
		  
| **Operator** | **Name**    | **Description**                                        |            |                                          |
| ------------ | ----------- | ------------------------------------------------------ | ---------- | ---------------------------------------- |
| `&&`         | Logical AND | True if **both** operands are true                     |            |                                          |
|  |           | Logical OR  | True if **at least one** operand is true               |
| `!`          | Logical NOT | Inverts the boolean value (true → false, false → true) |            |                                          |

		  */
		 
	        boolean y = true;
	        boolean z = false;

	        System.out.println("y && z = " + (y && z));  // false, because z is false
	        System.out.println("y || z = " + (y || z));  // true, because y is true
	        System.out.println("!y = " + (!y));          // false, negation of true
	        System.out.println("!z = " + (!z));          // true, negation of false
		 
		 
		 
		 /*
		  Ternary(conditional) Operator:
		  
		  		It is one line replacement for if-then-else statement.
		  		variable = (condition) ? expressionIfTrue : expressionIfFalse;
		  */
		 
		 a = 10;
		 b = 20;
		 int max = (a > b) ? a : b;  //  20
		 
		 
		 /*
          Bitwise Operator
          
| **Operator** | **Name**    | **Description**                                         |                                                             |
| ------------ | ----------- | ------------------------------------------------------- | ----------------------------------------------------------- |
| `&`          | Bitwise AND | Sets each bit to `1` **only if both bits are `1`**      |                                                             |
| '|`          | Bitwise OR  | Sets each bit to `1` if **at least one** of the bits is `1` |
| `^`          | Bitwise XOR | Sets each bit to `1` **if only one** of the bits is `1` |                                                             |
| `~`          | Bitwise NOT | **Inverts** all bits (1 → 0, 0 → 1)                     |                                                             |

		  */
		    a = 5;  // Binary: 0101
	        b = 3;  // Binary: 0011

	        int andResult = a & b;       // 0101 & 0011 = 0001 → 1
	        int orResult = a | b;        // 0101 | 0011 = 0111 → 7
	        int xorResult = a ^ b;       // 0101 ^ 0011 = 0110 → 6
	        int notA = ~a;               // ~0101 = 1010 (in 32-bit: ~00000000 00000000 00000000 00000101)
	                                     // = 11111111 11111111 11111111 11111010 → -6 (two's complement)
	        
	        
	        /*
	         Shift Operators

| **Operator** | **Name**             | **Description**                                                                        |
| ------------ | -------------------- | -------------------------------------------------------------------------------------- |
| `<<`         | Left Shift           | Shifts bits to the left; fills with `0` on the right                                   |
| `>>`         | Signed Right Shift   | Shifts bits to the right; preserves the sign bit (fills with `0` or `1` based on sign) |
| `>>>`        | Unsigned Right Shift | Shifts bits to the right; fills with `0` regardless of the sign bit                    |
>> keeps the sign of the original number.
>>> does not preserve the sign (used for unsigned right shift).
            */
	        
	        
	        a = 8;   // Binary: 0000 1000
	        b = -8;  // Binary: 1111 1000 (in two's complement)

	        int leftShift = a << 2;  // 0000 1000 << 2 = 0010 0000 (8 * 2^2 = 32)  if a << 3 -> (8 * 2^3)
	        int signedRightShift = a >> 2;  // 0000 1000 >> 2 = 0000 0010 (8 / 2^2 = 2)

	        int signedRightShiftNeg = b >> 2; // Sign bit is preserved
	        //-8     -> 11111111 11111111 11111111 11111000
	        //b >> 2 -> 11111111 11111111 11111111 11111110  -> -2

	        int unsignedRightShift = a >>> 2;  // Fills left bits with 0  
	        //    8      -> 00000000 00000000 00000000 00001000
	        //  a>>>2    -> 00000000 00000000 00000000 00000010  → This is 2


	        int unsignedRightShiftNeg = b >>> 2; // No sign preservation; fills with 0
	        //    -8    : 11111111 11111111 11111111 11111000
	        //  b >>> 2 : 00111111 11111111 11111111 11111110    ->   1073741822
		 
		 /*
		  Assignment Operator
		  
| **Operator** | **Name**                        | **Description**                                                                                           |                                                                                              |
| ------------ | ------------------------------- | --------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `=`          | Simple assignment               | Assigns right-hand value to left-hand variable                                                            |                                                                                              |
| `+=`         | Add and assign                  | Adds right-hand value to left-hand variable and assigns result to left-hand variable                      |                                                                                              |
| `-=`         | Subtract and assign             | Subtracts right-hand value from left-hand variable and assigns result to left-hand variable               |                                                                                              |
| `*=`         | Multiply and assign             | Multiplies left-hand variable by right-hand value and assigns result to left-hand variable                |                                                                                              |
| `/=`         | Divide and assign               | Divides left-hand variable by right-hand value and assigns result to left-hand variable                   |                                                                                              |
| `%=`         | Modulus and assign              | Calculates modulus using left-hand variable and right-hand value and assigns result to left-hand variable |                                                                                              |
| `&=`         | Bitwise AND and assign          | Performs bitwise AND on left and right-hand operands and assigns result to left-hand variable             |                                                                                              |
| '|=`         |  Bitwise OR and assign           | Performs bitwise OR on left and right-hand operands and assigns result to left-hand variable |
| `^=`         | Bitwise XOR and assign          | Performs bitwise XOR on left and right-hand operands and assigns result to left-hand variable             |                                                                                              |
| `<<=`        | Left shift and assign           | Left shifts left-hand variable and assigns result to left-hand variable                                   |                                                                                              |
| `>>=`        | Right shift and assign          | Right shifts left-hand variable and assigns result to left-hand variable                                  |                                                                                              |
| `>>>=`       | Unsigned right shift and assign | Unsigned right shifts left-hand variable and assigns result to left-hand variable                         |                                                                                              |

            */
		 
		    a = 10;

	        a += 3;  // a = a + 3 → 10 + 3 = 13
	        a -= 4;  // a = a - 4 → 13 - 4 = 9
	        a *= 2;  // a = a * 2 → 9 * 2 = 18
	        a /= 2;  // a = a / 2 → 18 / 2 = 9
	        a %= 3;  // a = a % 3 → 9 % 3 = 0


	        a = 5;   // Binary: 0101

	        a &= 3;  // a = a & 3 → 0101 & 0011 = 0001 → a = 1
	        a |= 2;  // a = a | 2 → 0001 | 0010 = 0011 → a = 3
	        a ^= 1;  // a = a ^ 1 → 0011 ^ 0001 = 0010 → a = 2

	        a <<= 2; // a = a << 2 → 2 << 2 = 8
	        a >>= 1; // a = a >> 1 → 8 >> 1 = 4
	        a >>>= 1; // a = a >>> 1 → 4 >>> 1 = 2 (unsigned shift)

	         

	        /*
	         
| Operator | Type                           | Behavior in conditions                                   | Short-circuit?            |
| -------- | ------------------------------ | -------------------------------------------------------- | ------------------------- |
| `&&`     | Logical AND                    | Evaluates **left to right**, stops if left is false      | **Yes** (short-circuits)  |
| `&`      | Bitwise AND (also boolean AND) | Evaluates **both sides always**, works with booleans too | **No** (no short-circuit) |



| Operator | Works On    | Short-circuits? | Evaluates Both Sides Always? | Typical Use                |                          |                          |
| -------- | ----------- | --------------- | ---------------------------- | -------------------------- | ------------------------ | ------------------------ |
| `&&`     | Boolean     | Yes             | No                           | Logical AND in conditions  |                          |                          |
   ||`     | Boolean     | Yes             | No                           | Logical OR in conditions |
| `&`      | Boolean/Int | No              | Yes                          | Bitwise AND or boolean AND |                          |                          |
|  |       | Boolean/Int | No              | Yes                          | Bitwise OR or boolean OR |                          |
| `^`      | Boolean/Int | No              | Yes                          | Bitwise XOR or boolean XOR |                          |                          |
| `!`      | Boolean     | N/A             | N/A                          | Logical NOT                |                          |                          |
| `~`      | Int         | N/A             | N/A                          | Bitwise NOT                |                          |                          |

When to use which?
	For boolean logic in if conditions, use logical operators (&&, ||, !).
	For bitwise operations on integers, use bitwise operators (&, |, ^, ~).
	Use bitwise & and | with booleans only if you need to evaluate both sides every time (rare).


*/
	
	        
	        /*
	         
	         Java Operator Precedence Table
	         
| **Precedence Level** | **Operators**                      | **Type**                          | **Associativity** |               |               |
| -------------------- | ---------------------------------- | --------------------------------- | ----------------- | ------------- | ------------- |
| 1                    | `()` `[]` `.`                      | Parentheses, array, member access | Left to right     |               |               |
| 2                    | `++` `--` (postfix)                | Post-increment/decrement          | Left to right     |               |               |
| 3                    | `++` `--` `+` `-` `~` `!` (prefix) | Unary                             | Right to left     |               |               |
| 4                    | `*` `/` `%`                        | Multiplicative                    | Left to right     |               |               |
| 5                    | `+` `-`                            | Additive                          | Left to right     |               |               |
| 6                    | `<<` `>>` `>>>`                    | Bitwise shift                     | Left to right     |               |               |
| 7                    | `<` `<=` `>` `>=` `instanceof`     | Relational                        | Left to right     |               |               |
| 8                    | `==` `!=`                          | Equality                          | Left to right     |               |               |
| 9                    | `&`                                | Bitwise AND                       | Left to right     |               |               |
| 10                   | `^`                                | Bitwise XOR                       | Left to right     |               |               |
| 11                   |  |`                                | Bitwise OR   					    | Left to right     |               |
| 12                   | `&&`                               | Logical AND                       | Left to right     |               |               |
| 13                   |  ||                                | Logical OR                        | Left to right                     |
| 14                   | `?:`                               | Ternary (conditional)             | Right to left     |               |               |
| 15                   | `=` `+=` `-=` `*=` `/=` etc.       | Assignment                        | Right to left     |               |               |

	         
	         */


	}

}
