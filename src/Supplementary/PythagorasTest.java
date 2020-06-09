/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Supplementary;

/**
 *
 * @author hernangarcia
 */
// File: PythagorasTest.java

// Pythagoras class constructs objects with the lengths of 2 
// adjacent sides of a right triangle.  Method getHypotenuse 
// computes and returns the length of the hypotenuse.

// Demonstrates Math class methods sqrt and pow.

/**
 * A "calculator" class that computes the length of the hypotenuse
 * of a right triangle, given the lengths of the two adjacent sides.
 */
class Pythagoras
{
	// instance var's
	private double side1 ;		// lengths of 2 adjacent sides of a 
	private double side2 ;		// right triangle
	
	/** 
	 * Creates a Pythagoras object.
	 * @param sideA the length of one adjacent side
	 * @param sideB the length of the other adjacent side
	 */
	public Pythagoras(double sideA, double sideB)
	{
		side1 = sideA ;
		side2 = sideB ;
	}
	
	/** 
	 * Returns the length of one of the adjacent sides.
	 * @return side1 the length of the side
	 */
	public double getSide1()
	{
		return side1 ;
	}
	
	/** 
	 * Returns the length of the other adjacent side.
	 * @return side2 the length of the side
	 */
	public double getSide2()
	{
		return side2 ;
	}
	
	/** 
	 * Computes and returns the length of the hypotenuse.
	 * @return hypotenuse the length of the hypotenuse
	 */
	public double getHypotenuse()
	{
		double hypotenuse = Math.sqrt( Math.pow(side1,2) + Math.pow(side2,2) ) ;
		return hypotenuse ;
                
                /**
                 * Can make this into only one procedure by making it return
                 * the equation, and not calling the method hypotenuse.
                 */
	}
}

/**
 * Simple test class for the Pythagoras class.
 */
public class PythagorasTest
{
	public static void main (String [] args)
	{
		// create 2 Pythagoras objects
		Pythagoras aRightTriangle = new Pythagoras(5,12) ;
		Pythagoras anotherRightTriangle = new Pythagoras(1.23,4.56) ;
		
		double sideA = aRightTriangle.getSide1() ;
		double sideB = aRightTriangle.getSide2() ;
		// get length of hypotenuse of first right triangle
		double hypot = aRightTriangle.getHypotenuse() ;
		
		String out = "If SideA = " + sideA + " and SideB = " + 
		             sideB + "\nthen the hypotenuse = " + hypot + "\n" ;
  		System.out.println(out) ;
  		
  		sideA = anotherRightTriangle.getSide1() ;
		sideB = anotherRightTriangle.getSide2() ;
		// get length of hypotenuse of second right triangle
		hypot = anotherRightTriangle.getHypotenuse() ;

  		out = "If SideA = " + sideA + " and SideB = " + 
		      sideB + "\nthen the hypotenuse = " + hypot + "\n" ;
  		System.out.println(out) ;
  	}
}

/* program output

If SideA = 5.0 and SideB = 12.0
then the hypotenuse = 13.0

If SideA = 1.23 and SideB = 4.56
then the hypotenuse = 4.722975756871931

*/


	
