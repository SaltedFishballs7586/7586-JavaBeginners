//7586-Java-Beginner -click "+" to expand
/*This file includes the things you need to learn this 
 *week and your homework problems
*/
/*Learning 1: Getting Started; Data Expressions; Functions; 
 *            Conditionals; Loops; Testing and Debugging
 *Homework 1: problem set is at the end of this file
*/
//Name: 
//School:
//Grade:
//If you have any questions feel free to write here :)

package week1;

import java.lang.*;

/*Learning Part -click "+" to expand
 *
 * 1. Getting Started
 *		1.1 Style
 *			As a programmer in team 7586, you are responsible to
 *			follow this style guide. Some of the rules are 7586 
 *			specific, even though they might not be such a restriction
 *			in general programming.
 *			
 *			Question: Why the heck do we need to do this???
 *			Answer: Some Style Facts:

				Good style is...
				The product of years of suffering due to bad style.
				
				Good style reduces time spent debugging, and...
				Around 75% of a developer's time is spent debugging (source)
				Fixing a bug takes 30 times longer than writing a line of code (source)
				
				Good style reduces errors, and...
				Software errors cost the global economy over $300 billion annually in 2013! (source)
				Software errors have resulted in many spectacular failures (source)
				
				You can search for official style guide in Java. But here you should follow
				our guide, just to keep our code easy to read for anyone in our team (community rule!). 
 *
 *			Okay, so what's our style?
 *
 *				*******Important rule in SaltedFishballs coding community！********
 *				Clarity Rules
					Ownership
					You must include your name in Pingyin(e.g. Zemin Jiang), school and which grade are you in, 
					in a comment at the top of every file you submit.
					This is good practice for later in life, when you will want to document all 
					code that you contribute to projects.
					
					
					Comments
					You should write concise, clear, and informative comments that supplement 
					your code and improve understanding.
					Comments should be included with any piece of code that is not self-documenting.
					Comments should also be included at the start of every function.
					Comments should not be written where they are not needed.
					Remember: writing comments is to let you and your co-workers understand.
					
					Helper Functions (Top-Down Design)
					You should use top-down design to break large programs down into helper 
					functions where appropriate.
					This also means that no function should become too long (and therefore unclear).
					For algorithm problems please PREVENT writing a function(except perhaps for the main function)
				    that is more than 25 lines long!
					Exceptions: blank lines and comments do not count towards this line limit, 
					and this rule does not apply to graphics functions.
					
					Variable Names
					Use meaningful variable and function names (whenever possible).
					Variables and functions should be written in the camelCase format. 
					In this format, the first letter is in lowercase, and all following 
					words are upper-case (eg: tetrisPiece).
					Variable names should not overwrite built-in function names; for example, 
					String is a bad name for a String variable. 
					Exceptions: i/j for index/iterator, c for character, s for string, 
					and n/x/y for number. These are totally fine.
		
					
					Unused Code
					Your code should not include any dead code (code that will never be executed).
					Additionally, all debugging code should be removed once your program is complete, 
					even if it has been commented out.
				
					
					Formatting
					Your code formatting should make your code readable. This includes:
					Not exceeding 100 characters in any one line (including comments!).
					P.S. You know how it feels when you keep scrolling left and right while 
					reading this tutorial 233333.
					Indenting consistently, with 4 spaces per indent level. 
					Using consistent whitespace throughout your code.
					Good whitespace: x=y+2, x = y+2, or x = y + 2(by the way, this is the format 
					if you press ctrl+shift+F)
					Bad whitespace: x= y+2, x = y +2, or x = y   + 2
					Curly brackets after parenthesis should be in the SAME line!
					Good function define statement example: 
					public void beautifulFunc (int beautifulParam) {
						// your code 
					}
					
					
				Robustness Rules
					Test Functions
					You should always write test functions for each function that is reasonably testable.
					How to write test functions? Use assert! It looks like this:
					
						assert list != null && list.size() > 0 : "list variable is null or empty";
						// this means if the statement between "assert" and ":" isn't True, 
						 *then while the program is running it throws an Assertion Error 
						 *saying the thing after ":" and stops running the program; 
						 *else it does nothing
					You should enable assertion following these steps:
						Go to Run->run configuration.
						select java application in left navigation pan.
						right click and select New .
						select Arguments tab.
						Add -ea in VM arguments.
					Assertions are usually used as a debugging aid.
					Exceptions: you do not need to test random and graphics.
					
					Efficiency
					As this is a beginner level tutorial, you are not expected to write the 
					most efficient solutions generally. However, your code may not be "grossly" inefficient, 
					especially if you had simple, clear, and reasonably efficient options to choose from.
					Hint: If one of your functions(algorithmic problem) takes you more than 
					10 seconds to run, it is very possible that your solution isn't good enough.
					
					Repetitive Code
					In general, you should not have repetitive code.
					One example of this is duplicate code, code that has been copy-pasted. 
					This should instead be put into a helper function.
					Another example is "numbered"-code, where there are multiple variables 
					like foo0, foo1, foo2. These should be represented by a loop or array instead.
				
					
					Magic Numbers
					A magic number is a number used outside of a variable assignment in code 
					that does not have an immediate and clear meaning.
					In general, every number besides -1, 0, 0.5, 1, 2, and 10 is magic.
					If you must use a magic number, store the number or an expression using 
					the number in a variable, then use that variable.
					For example, store 26 in a variable called numAlphabet or something like that.
					
					If/Else Statements
					When reasonable, multiple if statements should be joined into an if - else if - else chain.
 * 
 * 2. Data Expression 
 * 		Carefully read section "变量", "操作符", "数字与字符串" and "数组" in how2j.cn 
 * 		and go over the practice problems
 * 		Play with variables!
 * 
 * 			-Which has the biggest range? byte, short, int, long
 * 			-Which has the highest precision? float, double
 * 			-How to declare a float variable? float f2 = 54.321f 
 * 			-What's the difference between char and String? char uses '' and only has one(or zero) character inside; String uses "" and can have multiple characters inside.
 * 				-String! is fun and important
 * 					-Strings are immutable, meaning that it can't be changed once created
 * 						but you can use various methods to access String variables! 
 * 						("how2j.cn-JAVA基础-数字与字符串-操纵字符串")
 * 						-You should remember all the functions in this module :) just a few functions, easy peasy!
 * 			-How to define a 1D List and a 2D List?
 * 				-List! another really fun thing to play with ;)
 * 					-How to traverse a 2D List?
 * 					-How to turn a 2D List into a 1D List?
 * 					-How to reverse a 1D List? 
 * 					-How to know if a 1D List (or a String) is palindrome(like "ab6c6ba")?
 * 					-How to rotate a 2D List 90 degrees clockwise/counterclockwise?
 * 					-...well, there are tons of interesting questions about lists!
 * 					-List is a very important thing in robotics path planning and computer vision. So,... you know what I mean.
 * 
 * 3. Loops & Conditions
 * 		-How to loop with different methods? How many times does each one loop?
 * 			int[] dummyList = new int[10]; 
 * 			for (int i = 0; i < 10; i++) {
 * 				dummyList[i] = i;
 * 			}
 * 			When do we usually use for loop? Well, basically when you know 
 * 			which element to start and end and your step(in this case, 1). 
 * 			Sometimes it you don't know the ending element it's still fine, 
 * 			because you can use break.	
 * 
 * 			int[] dummyList = new int[10];
 * 			int i = 0;			
 * 			while (i < 10) {
 * 				dummyList[i] = i;
 * 				i++;
 * 			}
 * 			When do we have to use while loop instead of for loop? Well, sometimes you
 * 			only know the start and end condition but don't know a specific list.
 * 
 * 			-Consider this problem: finding the nth prime number.
 * 			#First, you may think of writing everything in the main function. 
 * 			It's fine, but your code hard to reuse. Instead, if you write functions, 
 * 			then you can reuse them if you want!
 * 			#Secondly, you may think of how to find the nth something. Loop! Exactly.
 * 			But what loop should be used? Think of how you can approach the problem
 * 			using for and while loop respectively. You'll see while loop is more suitable.
 * 
 * 			***** The Nth Template *****
 * 			public int nthPrime(int n) {
 * 				int guess = 1; // your first guess-1 (why need to -1?)
 * 				int found = 0; // how many primes you've found 
 * 				while (found < n) {
 * 					guess += 1; // see? here our first guess is 2.
 * 					if (isPrime(guess) == true) // just leave it there, you know you'll write it soon
 * 						found += 1; // no need to write curly brackets here because this if conditional only has one statement
 * 				}
 * 				return guess;
 * 			}
 * 			
 * 			Okay, so let's write the helper function to know if a positive integer is prime or not
 * 			
 * 			public boolean isPrime(int n) {
 * 				// think about the definition of prime.
 * 				for (int i = 2; i < n; i++) 
 * 					if (n % i == 0) 
 * 						return false;
 * 					//no need to write else statement because it i is not a factor of n we just continue check the next i
 * 				return true; //only if the for loop has finished, this function will return true.
 * 			}
 * 			
 * 			Okay, you're done!
 * 
 * 			Of course you can make your isPrime function smarter by using some math tricks.
 * 			
 * 			import java.lang.*;
 * 			public boolean isPrime2(int n) {
 * 				if (n == 2) {
        			return true;
        		} else if (n > 2) { 
        			for (int i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++) {
            			if (n % i == 0)
                			return false;
        			return true;
        	}
        	
        	-If you reflect on the process of solving this problem, you'll notice
        	how you analyze the problem, break it down to smaller modules, and solve
        	these modules one by one.
        	-This way of thinking is very important. It's called top-down design.
        	
 * 
 * 4. Function
 * 		Know how to define a function;
 * 		Know function types: 
 * 			public, private, protected, or default?
 * 		What's the return type? 
 * 			void, int, String, boolean, etc.
 * 		How many parameters does the function have and what type? 
 * 			0, 1, 2, ... parameters
 * 		Are the parameters in a function global or local? In which domain?
 * 
 */


//Homework Part!
/*
 * Write each function according to the requirement. Some of the questions
 * are hand graded. You should pass all the test cases before handing in.
 * Good luck > w <
 */

public class Homework1 {
	
	/*
	 * Question 1: Read over the code shown in the block below, 
	 * then describe what it does in less than 10 words using common language. 
	 * This question will be hand-graded.
	 */
	public boolean mysteryCode(char s) {
		//Write your answer here: 
	    boolean a = ('a' <= s) & (s <= 'z');
	    boolean b = (s == 'a') | (s == 'e') | (s == 'i') | (s == 'o') | (s == 'u');
	    return a & !b;
	}
	
	/*
	 * Question 2: Reasoning over code. Find a value that will make roc return True. 
	 * You only need to modify the function rocAnswer() to return that value
	 * and the value will be automatically passed to the function roc.
	 * 
	 * Yes, you could try every possible value in this function until 
	 * you find one that works. That won't help you learn, though. 
	 * Instead, try working through the problem on paper, to see if you can 
	 * figure out what a correct answer should look like without going through 
	 * all the possibilities.
	 */
	public static boolean roc(int x) {
	    if (x <= 0)
	        return false;
	    else if (x % 100 == x) {
	        int a = x / 10;
	        int b = x % 10;
	        if (a != b)
	            return false;
	        return true;
	    } 
	    else
	        return x == 42;
	}
	
	public static int rocAnswer() {
		return 42; 
	}
	
	/*
	 * Question 3: Write the function 
	 * (This is a collaborative question, meaning that you can do it together with your
	 * good PY if you want:)
	 * -----Double threeLinesArea(double m1, double b1, double m2, double b2, double m3, double b3) 
	 * that takes six double values representing the 3 lines:
	 * 		y = m1*x + b1
			y = m2*x + b2
			y = m3*x + b3
	 * First find where each pair of lines intersects, then return the area 
	 * of the triangle formed by connecting these three points of intersection. 
	 * If no such triangle exists (if any two of the lines are parallel), 
	 * return 0.
	 * 
	 * To do this, you MUST write three helper functions:
	 * 
	 * -----Double lineIntersection(double m1, double b1, double m2, double b2) 
	 * to find where two lines intersect (which you will call three times)
	   This function takes four double values representing two lines 
	   and returns the x value of the point of intersection of the two lines. 
	   If the lines are parallel, or identical, the function should return null.

	   -----Double distance(double x1, double y1, double x2, double y2) 
	   to find the distance between two points (again called three times)
	   This function takes four double values representing two points and 
	   returns the distance between those points.
		
	   -----Double triangleArea(double s1, double s2, double s3) 
	   to find the area of a triangle given its side lengths (which you will call once).
	   This function takes three double values representing side lengths of 
	   a triangle, and returns the area of that triangle. 
	   To do this, you may wish to to use Heron's Formula:
	   http://mathworld.wolfram.com/HeronsFormula.html
	   
	   You can write more helper functions if you need them.
	 */
	public static Double threeLinesArea(double m1, double b1, double m2, double b2, double m3, double b3) {
		return 42.0;
	}
	
	public static Double lineIntersection(double m1, double b1, double m2, double b2) {
		return 42.0;
	}
	
	public static Double distance(double x1, double y1, double x2, double y2) {
		return 42.0;
	}
	
	public static Double triangleArea(double s1, double s2, double s3) {
		return 42.0;
	}

	
	/*
	 * Question 4: an Nth Template Practice!
	 * Write the function long nthHappyPrime(long n) that finds the nth happy prime. 
	 * Prime we know already, but what is a happy number? 
	 * To find out, read the first paragraph on the Wikipedia page. 
	 * https://en.wikipedia.org/wiki/Happy_number
	 * For our purposes, we can simplify the process of finding a happy number 
	 * by saying that a cycle which reaches 1 indicates a happy number, 
	 * while a cycle which reaches 4 indicates a number that is unhappy. 
	 * To solve this problem, you should use top-down design.
	 * Write any helper function that you think is useful:)
	 * 
	 * ***Important Note: You are NOT allowed to turn the number into String
	 * to find each digits!
	 */
	
	public static int nthHappyPrime(int n) {
		return 42;
	}
	
	/*
	 * Question 5: Congratulations you are on the final problem!
	 * Write the function boolean areAnagrams(String s1, String s2) that returns true if 
	 * two strings are anagrams 
	 * (that is, if they contain the same letters in possibly-different orders). 
	 * For example, "smart" and "trams" are anagrams; on the other hand, 
	 * "read" and "dared" are not anagrams, since they have a different number of letters.
	 */
	
	public static boolean areAnagrams(String s1, String s2) {
		return true;
	}
	
	
	//////////////////////////////////////////////////////////////////
	// Ignore the following - Homework 1 test cases
	public static void testRoc() {
		System.out.print("Testing roc()...");
		assert(roc(rocAnswer()) == true);
		System.out.println("Passed!");
	}
	
	public static void testLineIntersection() {
	    System.out.print("Testing lineIntersection()...");
	    assert(lineIntersection(2.5, 3, 2.5, 11) == null);
	    assert(lineIntersection(25, 3, 25, 11) == null);
	    //y=3x-5 and y=x+5 intersect at (5,10)
	    assert(Math.abs(lineIntersection(3, -5, 1, 5) - 5) < 0.01);
	    //y=10x and y=-4x+35 intersect at (2.5,25)
	    assert(Math.abs(lineIntersection(10, 0, -4, 35) - 2.5) < 0.01);
	    System.out.println("Passed!");
	}


	public static void testDistance() {
	    System.out.print("Testing distance()...");
	    assert(Math.abs(distance(0, 0, 1, 1) - Math.sqrt(2)) < 0.01);
	    assert(Math.abs(distance(3, 3, -3, -3) - 6 * Math.sqrt(2)) < 0.01);
	    assert(Math.abs(distance(20, 20, 23, 24) - 5) < 0.01);
	    System.out.println("Passed!");
	}


	public static void testTriangleArea() {
	    System.out.print("Testing triangleArea()...");
	    assert(Math.abs(triangleArea(3, 4, 5) - 6) < 0.01);
	    assert(Math.abs(triangleArea(Math.sqrt(2), 1, 1) - 0.5) < 0.01);
	    assert(Math.abs(triangleArea(Math.sqrt(2), Math.sqrt(2), 2) - 1) < 0.01);
	    System.out.println("Passed!");
	}


	public static void testThreeLinesArea() {
	    System.out.print("Testing threeLinesArea()...");
	    assert(Math.abs(threeLinesArea(1, 2, 3, 4, 5, 6) - 0) < 0.01);
	    assert(Math.abs(threeLinesArea(0, 7, 1, 0, -1, 2) - 36) < 0.01);
	    assert(Math.abs(threeLinesArea(0, 3, -.5, -5, 1, 3) - 42.66666666666) < 0.01);
	    assert(Math.abs(threeLinesArea(1, -5, 0, -2, 2, 2) - 25) < 0.01);
	    assert(Math.abs(threeLinesArea(0, -9.75, -6, 2.25, 1, -4.75) - 21) < 0.01);
	    System.out.println("Passed!");
	}
	
	public static void testNthHappyPrime() {
		System.out.print("Testing nthHappyPrime()...");
		assert(nthHappyPrime(0) == 7);
	    assert(nthHappyPrime(1) == 13);
	    assert(nthHappyPrime(2) == 19);
	    assert(nthHappyPrime(3) == 23);
	    assert(nthHappyPrime(4) == 31);
	    assert(nthHappyPrime(5) == 79);
	    assert(nthHappyPrime(6) == 97);
	    System.out.println("Passed!");
	}
	
	public static void testAreAnagrams() {
		System.out.print("Testing areAnagrams()...");
		assert(areAnagrams("abcba", "bbaac") == true);
		assert(areAnagrams("1", "111111") == false);
		assert(areAnagrams("\\^ o ^/", "  o\\/^^") == true);
		assert(areAnagrams("", " ") == false);
		System.out.println("Passed!");
	}
	
	public static void main(String[] args) {
		testRoc();
		testLineIntersection();
		testDistance();
		testTriangleArea();
		testThreeLinesArea();
		testNthHappyPrime();
		testAreAnagrams();
	}
}
