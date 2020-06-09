/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Hello;

/**
 *
 * @author hernangarcia
 */
/*
 *  File: Hello2.java
 *
 *  Shows construction (Creation) of String objects, declaration of String
 *  object-variables, and assigning objects to object-variables
 *
 */
public class Hello2 
{
	public static void main(String [] args)
	{
		// create object, declare obj-var aMessage which points to it
		
		String aMessage = "Hi Mom!" ;
		System.out.println(aMessage) ;
		
		// create another object, declare obj-var anotherMessage which
		// points to it
		
		String anotherMessage ;					// declares obj-var
		anotherMessage = "Hi Dad!" ;			// create String object and
												// point obj-var to it
		System.out.println(anotherMessage) ;
		
		// create new object, but point existing obj-var to it
		aMessage = "Please send money!" ;
		System.out.println(aMessage) ;
	}
}

/*  Program output
 
Hi Mom!
Hi Dad!
Please send money!

*/
