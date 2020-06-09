/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Supplementary;

/**
 *
 * @author hernangarcia
 */
// File:	 PizzaCalculatorTest.java

/** Computes price per square inch for a circular (non-Sicilian) pie,
 *  given the diameter and price of the pizza.
 */
class PizzaCalculator
{
	// instance var's
	private int diameter ;			// diameter of pizza, in inches
    private double price ;			// cost of pizza

    /**
     * Create a PizzaCalculator object.
     * @param size the diameter of the pizza, in inches
     * @param cost the price of the pizza
     */
    public PizzaCalculator(int size, double cost)
    {
    	diameter = size ;
    	price = cost ;
	}
	
	/**
	 * Returns the size of the pizza.
	 * @return the diameter of the pizza, in inches
	 */
	public int getSize()
	{
		return diameter ;
	}

	/**
	 * Returns the price of the pizza.
	 * @return the cost of the pizza
	 */
	public double getPrice()
	{
		return price ;
	}
			
	/**
	 * Returns the unit price of the pizza.
	 * @return the price per square inch of the pizza
	 */
	public double unitPrice()
	{
    	// local var's 
    	double radius ;						// radius of pizza
	    double pizzaSize ;					// area of pizza in square inches
		double pricePerSqIn ;				// pizza's price per square inch
	    							
    	// compute price per square inch of pizza...
    	
    	// First compute size in sq. inches
    	radius = 0.5 * diameter ;				// radius of a circular pizza
    	pizzaSize = Math.PI * radius * radius ;	// area of a circle!
    	
    	// price per sq. in. = cost of pie / size in sq.inches
    	pricePerSqIn = price / pizzaSize ;      
												
		return pricePerSqIn ;
	}
}
	
/**
 * A test class for the PizzaCalculator class
 */
public class PizzaCalculatorTest
{
	public static void main(String [] args)
	{
		// create two PizzaCalculator objects
		PizzaCalculator smallPie = new PizzaCalculator(12, 7.98) ;
		PizzaCalculator largePie = new PizzaCalculator(16, 12.98) ;

		// compute unit price of each
		double costOfSmallPie = smallPie.unitPrice() ;
		double costOfLargePie = largePie.unitPrice() ;
		
		String out = "A(n) " + smallPie.getSize() + "-inch pizza that costs $" 
		             + smallPie.getPrice() + "\n...has a unit price of $" +
                     costOfSmallPie + " per sq. inch\n" ;
		System.out.println(out) ;
		
		out = "A(n) " + largePie.getSize() + "-inch pizza that costs $" 
		      + largePie.getPrice() + "\n...has a unit price of $" +
              costOfLargePie + " per sq. inch\n" ;
		System.out.println(out) ;
	}
}

/*  program output:

A(n) 12-inch pizza that costs $7.98
...has a unit price of $0.07055869143740694 per sq. inch

A(n) 16-inch pizza that costs $12.98
...has a unit price of $0.06455722379165005 per sq. inch

*/
