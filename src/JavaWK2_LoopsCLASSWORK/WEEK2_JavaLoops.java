package JavaWK2_LoopsCLASSWORK;

public class WEEK2_JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("is The number  between 1 and 100? - LINE 10");
/*
 * Chp2 Loops Q1
 * 
 *  Is A Number Between 1 and 100? Check to see if userNumber is between 1 and 100. 
 *  If it is, create a while loop that prints all integer values starting with userNumber to 100. 
 *  If not, print (exactly) "Your number was not between 1 and 100." to the console.

 *
 *
					 *public static void main(String[] args) {
					        Scanner in = new Scanner(System.in);
					        int userNumber = in.nextInt();
					        int counter;
					        counter = userNumber;
					        if ( userNumber <= 100 && userNumber >= 1 ) {
					            while ( counter <= 100 ) {
					                System.out.println(counter++);
					            }
					        } else {
					            System.out.println("Your number was not between 1 and 100.");
					        }
					
					    }
					}
					 *
					 */

// chp2 question 2 loops
/*Do While Loop Practice: Create a do while loop that checks the length of userWord and if that word 
 * is less than 5 characters, then print userWord to the console 1 time. If it is 5 or more characters 
 * print userWord to the console userWord.length() number of times.
 * 
						 * public class CodingQuestion {
						
							public static void main(String[] args) {
							    
								Scanner in = new Scanner(System.in);
								String userWord = in.nextLine();
								int wordLength = userWord.length();
								int counter = wordLength;
								// do not change the code above this line
								
								// build your do while loop using the variables listed above
								do {
								    System.out.println(userWord);
								    if ( wordLength < 5 ) {
								        break;
								    } 
								    counter--;
								} while ( counter > 0 );
								
								
							}
						}
						 * 
						 * 
						 */








//chp2 LOOPS q3

/*Add A Number A Certain Number of Times: In this question, there are three variables declared for you: 
 * numToAdd, howManyTimes, and sumResult. The user (each test case) is providing you with two (2) values. 
 * The first is stored in the variable numToAdd. The second value is stored in the variable howManyTimes. 
 * Create a do while loop that adds numToAdd to a variable sumResult as many times as the loop runs, which 
 * is set by howManyTimes. 
You will want to set up your addition to add numToAdd to your sumResult on each iteration of the loop. 

Once the loop has finished running, print the value of sumResult to the console using System.out.println().
 * 
 * 
 * 
 * 
				 * public class CodingQuestion {
				
				    public static void main(String[] args) {
				
				        Scanner in = new Scanner(System.in);
				        int numToAdd = in.nextInt();
				        int howManyTimes = in.nextInt();
				        int sumResult = 0;
				
				        // create your do while loop below this line
				        do {
				            sumResult += numToAdd;
				            howManyTimes--;
				        } while (howManyTimes > 0);
				
				        System.out.println(sumResult);
				    }
				}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */




//CHP2 LOOPS q 4
/*
 * 
 * While Loop Practice: Create an if/else statement that checks to see if userNumber is more than 10 and 
 * under 100.If so, then execute a while loop that prints the value of userNumber and decrements by 1 until 
 * it is less than 10. If not, print (exactly) "Your number is not between 10 and 100." to the console, including the "." at the end.
 * 

					 * 
					public class CodingQuestion {
					
						public static void main(String[] args) {
							Scanner in = new Scanner(System.in);
							int userNumber;
							userNumber = in.nextInt();
					
					        // Write your code below 
					        if ( userNumber > 100 || userNumber < 10 ) {
					            System.out.println("Your number is not between 10 and 100.");
					        } else {
					            while ( userNumber >= 10 ) {
					                System.out.println(userNumber);
					                userNumber--;
					            }
					        }
						}
					}
					 * 
					 * 
					 */
					



/*WEEK2 Loops Q:5
 * While Loop Practice: Create an if/else statement that checks to see if userNumber is more than 10 and 
 * under 100.If so, then execute a while loop that prints the value of userNumber and decrements by 1 until
 *  it is less than 10. If not, print (exactly) "Your number is not between 10 and 100." to the console, 
 *  including the "." at the end.
 * 
 * 
 * 	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber;
		userNumber = in.nextInt();

        // Write your code below 
        if ( userNumber > 100 || userNumber < 10 ) {
            System.out.println("Your number is not between 10 and 100.");
        } else {
            while ( userNumber >= 10 ) {
                System.out.println(userNumber);
                userNumber--;
            }
        }
	}
}

 * 
 */

		
		
		/*WEEK2 Loops Q:6
		 * Pick a Loop: Write a loop (any type of loop will work) that does a countdown from the variable
		 *  countDown.countDown represents the number that a user enters. Check to make sure the number is
		 *   not larger than 10, but greater than or equal to 3. Each time the loop runs, print to the console
		 *    the value of the counter followed by three periods (…) using System.out.println(). Once out of the
		 *     loop, print to the console "We have lift off!". Note: If a number is less than 3 or greater than 10,
		 *      then the only message printed to the console is "We have lift off!"
											 * 
											 * 	public static void main(String[] args) {
											Scanner in = new Scanner(System.in);
											int countDown = in.nextInt();
									        
									        // Write your code below this line
									        if (countDown <= 10 || countDown >= 3) {
									            while (countDown >= 1) {
									                System.out.println(countDown + "...");
									                countDown--;
									            }
									        }
									        
									        System.out.println("We have lift off!");
										}
}
		 * 

		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
	
	/*WEEK2 Loops Q:7
	 * For Loop Practice: Create a for loop that starts at 1 and goes to 100, but increments by the value of 
	 * userValue and prints the value of the counter to the console each time the loop processes.
	 * 	Also, check to make sure that userValue is greater than 0. If userValue is not greater than 0,
	 *  print exactly "Your number needs to be greater than 0."
	 * 
	 * public class CodingQuestion {

								public static void main(String[] args) {
									Scanner in = new Scanner(System.in);
									int userValue;
									userValue = in.nextInt();
							
							        // add your code below this line 
							        if ( userValue > 0 ) {
							            for ( int i = 1; i <= 100; i = i + userValue ) {
							                System.out.println(i);
							            }
							        } else {
							            System.out.println("Your number needs to be greater than 0.");
							        }
							        
								}
							}
	 */
	
	
	/*WEEK2 Loops Q:8
						 * Multiplication Table: Create a for loop that prints out a multiplication table for num from 1 through 10.
					If the value of num is 1, the output will look like this:
					Multiplication Table of 1 
					1 x 1 = 1
					1 x 2 = 2 
					1 x 3 = 3
					1 x 4 = 4
					1 x 5 = 5
					1 x 6 = 6
					1 x 7 = 7
					1 x 8 = 8
					1 x 9 = 9
					1 x 10 = 10
						 * 
						 * 
						 * 
						 * public class CodingQuestion {
					
						public static void main(String[] args)  {
					        Scanner in = new Scanner(System.in);
					        int num = in.nextInt();
					
					        System.out.println("Multiplication Table of " + num);
					
					        // create your for loop below here 
					        for(int i=1; i<=10; i++) {
					            System.out.println(num +" x " + i + " = " + (num*i) );
					        }
					    }
					}
	 * 
	 */
	
		
		/*WEEK2 Loops Q:9

		/*Concatenate A String It's Length Number of Times: Write a for loop that starts at zero
		 *  and loops the length of a user-entered String saved in userWord. Every time the loop 
		 *  runs, the userWord is added to the variable longString to make a repeating string. For 
		 *  example, if the userWord was = "Hello", the loop would run 5 times and concatenate the
		 *   word "Hello" to longString 5 times. The String printed to the console would be "HelloHelloHelloHelloHello"
						 * 
						 * 
						 * public class CodingQuestion {
				
				    public static void main(String[] args) {
				        Scanner in = new Scanner(System.in);
				        String userWord = in.next();
				        String longString ="";
				 
				        // create your for loop here
				        for ( int i = 0; i < userWord.length(); i++ ) {
				            longString += userWord;
				        }
				        
				        // Do not change this code
				        System.out.println(longString);
				    }
				}
						 */
						
		/*r Loop Practice: Using a for loop, raise base to the power of power (i.e. base^power) and 
		 * print the result to the console using the provided System.out.println() statement below
		 * 
		 * public class CodingQuestion {
					
					    public static void main(String[] args) {
					        Scanner in = new Scanner(System.in);
					        int base = in.nextInt();
					        int power = in.nextInt();
					        int result = 1;
					
					        // Create your for loop here 
					        for(int i = 1; i <= power; i++) {
					            result *= base;
					        }
					        
					        
					        
					   
					        
					        // Do not change this code
					        System.out.println("Result: "+ result);
					    }
					}
		 * 
		 */
		
		
		
		
		
		
		/*Printing A Range Of Integers: Create a for loop that prints the numbers 0 to x to the console 
		 * using System.out.println() for each number, where x is a value that is provided by the user 
		 * (Or here, provided by the test cases). Make sure that you check for the value of x to be greater
		 *  than zero (0).Use the provided error message in the System.out.println() that is below in the 
		 *  code to print to the console when x is less than one (1)
		 * 
		 * public class CodingQuestion {

					    public static void main(String[] args)    {
					        Scanner in = new Scanner(System.in);
					
					        int x = in.nextInt();
					        
					        // write your code below this line
					        if ( x < 1 ) {
					            //Use this line for printing to the console if the value of x is less than 1.
					            System.out.println("Please enter a number greater than 0.");
					        } else {
					            for ( int i = 0; i <= x; i++ ) {
					                System.out.println(i);
					            }
					        }
					
					    }
}
		 * 
		 * 		 * 
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
