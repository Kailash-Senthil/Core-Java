package org.myLearning.dev.learn;

public class ControlStatementsLearning {
	/*
	 Control Statements:
	 	Java compiler executes the code from top to bottom.
	 	code are executed according to the order in which they appear.
	 	If we want to control the execution flow we will go to Control Statements
	 	types:
	 		1.Decision Making statements
                * if statements
                * switch statement
            2.Loop statements
                * do while loop
                * while loop
                * for loop
                * for-each loop
            3.Jump statements
                *break statement
                *continue statement
                *System.exit(0)
	 */
	
	public static void main(String[] args) {
		
		/*
		 If Statement:
		 	1.Simple if statement
                        2.if-else statement
                        3.if-else-if ladder
                        4.Nested if-statement
		 */
		
        int number = 75;

        /* 1. Simple if statement
           evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true.
         */
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        /* 2. if-else statement
         The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block.
         The else block is executed if the condition of the if-block is evaluated as false.
         */
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        /* 3. if-else-if ladder
         if-else-if ladder contains the chain of if-else statements that create a decision tree where the program may enter in the block of code where the condition is true.
          */ 
        if (number >= 90) {
            System.out.println("Grade: A");
        } else if (number >= 75) {
            System.out.println("Grade: B");
        } else if (number >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        /*  4. Nested if-statement
         if statement can contain a if or if-else statement inside another if or else-if statement.
         */
        if (number >= 60) {
            if (number >= 75) {
                System.out.println("You passed with distinction.");
            } else {
                System.out.println("You passed.");
            }
        }
		
        
        /*
         Loop statements
             executes the block of code repeatedly while some condition evaluates to true
                * do while loop
                * while loop
                * for loop
                * for-each loop
 
         
         */
        
        // 1. do-while loop: 
        int i = 1;
        do {
            System.out.println("do-while loop: i = " + i);
            i++;
        } while (i <= 3);

        // 2. while loop: 
        int j = 1;
        while (j <= 3) {
            System.out.println("while loop: j = " + j);
            j++;
        }

        // 3. for loop: 
        for (int k = 1; k <= 3; k++) {
            System.out.println("for loop: k = " + k);
        }

        // 4. for-each loop
        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println("for-each loop: num = " + num);
        }
        
       /*
| Feature                 | `do-while`     | `while`             | `for`             | `for-each`            |
| ----------------------- | -------------- | ------------------- | ----------------- | --------------------- |
| Condition checked       | After body     | Before body         | Before body       | Before each iteration   |
| Executes at least once? | ✅ Yes          | ❌ Not guaranteed    | ❌ Not guaranteed  | ❌ Not guaranteed      |
| Best for                | Run-then-check | Unknown count loops | Known count loops | Iterating arrays or collections |
| Index-based             | Optional       | Optional            | ✅ Yes             | ❌ No (direct access) |
			   exit check loop   entry check loop	   entry check loop     entry check loop	

 */
	
        /*
         Jump Statements:
         	jump statements transfer the execution control to the other part of the program.
         		1.break
         			break the current flow of the program and transfer the control to the next statement outside a loop or switch statement.
         			However, it breaks only the inner loop in the case of the nested loop.
         		2.continue
         			skips the specific part of the loop and jumps to the next iteration of the loop immediately
         		3.System.exit(0)
         			terminate the currently running Java program immediately.
         			Stops all running threads immediately.
                                Does not return to any code after the System.exit(...) call.
					Commonly used in:
						GUI applications (on exit button press)
						Error handling
						Terminating after a critical failure or completion         	
         */
        
        for (int k = 1; k <= 10; k++) {

            if (k == 3) {
                System.out.println("Skipping number 3 using continue");
                continue;  // skips the rest of the loop for k = 3
            }

            if (k == 5) {
                System.out.println("Breaking the loop at 5 using break");
                break;     // exits the loop when k = 5
            }

            if (k == 7) {
                System.out.println("This will never be printed because loop ends at 5");
            }

            System.out.println("Current number: " + k);
        }
        
        outerLoop:
        for (int x = 1; x <= 3; x++) {
            innerLoop:
            for (int y = 1; y <= 3; y++) {

                if (x == 2 && y == 2) {
                    System.out.println("Using continue to skip outer loop at x = 2, y = 2");
                    continue outerLoop; // skips rest of outer loop's current iteration
                }

                if (x == 3 && y == 1) {
                    System.out.println("Breaking outer loop at x = 3, y = 1");
                    break outerLoop; // exits the outer loop entirely
                }

                System.out.println("x = " + x + ", y = " + y);
            }
        }

        System.out.println("Program finished.");

        System.out.println("Now exiting the program using System.exit(0)");
        System.exit(0);  // forcefully exits the program

        // This line will never be executed
        System.out.println("This line will not be printed.");
		
	}

}
