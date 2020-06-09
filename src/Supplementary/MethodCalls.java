/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Supplementary;

/**
 *
 * @author hernangarcia
 */
// File:  MethodCalls.java

// Shows how to call methods that return a value - e.g., String class methods 
// length() and replace() - and those that do not (e.g., println)

// Also shows variable declarations with and without initial values, and the 
// assignment statement

public class MethodCalls
{
	public static void main (String [] args)
	{
		// declare a String object variable and create a String object
		String sport = "basketball" ;
		
		String anotherSport ;			// String object variable
		
		int length ; 					// stores length of a string
		
		// calling a method - println - that does not return a value
		
		System.out.println("Initially, sport is \"" + sport + "\"\n") ;
		
		// calling a method that returns a value (in an assignment statement)

		length = sport.length() ;
		
		System.out.println("The string \"" + sport + "\" has " + length +
		                   " characters.\n") ;

		// calling another method that returns a value
		
		anotherSport = sport.replace("basket","foot") ;   // "football"
 	
 		System.out.println("After calling replace(), anotherSport is \"" + 
 		                    anotherSport + "\"\n") ;
 		                    
 		// calling a method that returns a value (in an output statement)

		System.out.println("The string \"" + anotherSport + "\" has " + 
		                    anotherSport.length() + " characters.") ;      
	}
}

/*  program output:
 
Initially, sport is "basketball"

The string "basketball" has 10 characters.

After calling replace(), anotherSport is "football"

The string "football" has 8 characters.

*/
