/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Supplementary;

/**
 *
 * @author hernangarcia
 */
//  File: InputDemo.java

//  A Purchase class object has the number of items purchased, a description 
//  of the item, and the price of the item 

//  Test class InputDemo uses the showInputDialog method of the JOptionPane 
//  class to read data for a Purchase, and methods parseInt and parseDouble 
//  to convert the input strings to numeric types

//  Program also shows a defined constant

import javax.swing.JOptionPane ; 	// for input

/**
 * A class to represent a purchase - number of items, description, and price
 * per item
 */
class Purchase 
{
	// instance vars
	private int quantity ;			// number of each item purchased
    private String item ;			// description of the item
    private double unitPrice ;		// price per item
    private double cost ;			// total cost:  quantity * unitPrice
    
    private static final double TAX_RATE = 0.065 ;	// 6.5% (a constant)

	/**
	 * Creates a purchase object
	 * @param quantity number of items bought
	 * @param item one-word description of item
	 * @param unitPrice price per item
	 */
	public Purchase(int quantity, String item, double unitPrice) 
	{
		this.quantity = quantity ;
		this.item = item ;
		this.unitPrice = unitPrice ;
		// compute cost of purchase
		cost = quantity * unitPrice ;	
	}
	
	/**
	 * Return the cost of a purchase.
	 * @return the cost of a purchase
	 */
    public double getCost()
	{
		return cost ;					
	}
	
	/**
	 * Returns a String containing the input data for a purchase
	 * @return the quantity, description, and price per item as a String
	 * Example:	"5 widgets @ $1.23
	 */
    public String getData() 
	{
		return  quantity + " " + item + " @ $" + unitPrice ;
		// example:	"5 widgets @ $1.23
	}

	/**
	 * Compute and return the tax on a purchase.
	 * @return the tax on a purchase
	 */
    public double getTax()
	{
		double tax = cost * TAX_RATE ;		// tax on purchase
		return tax ;					
	}

	/**
	 * Compute and return total cost of a purchase, including tax
	 * @return the total cost of a purchase, tax included
	 */
    public double getTotal()
	{
		// call getTax() to compute the tax, and add to cost
		return getTax() + cost ;
	}
	
} // end of Purchase class definition ========================================

/**
 * Test class for Purchase class
 */
public class InputDemo
{
  	public static void main(String[] args)  
  	{
		// prompt user
		String input = JOptionPane.showInputDialog
			           ("Enter number of items purchased") ;
                       	   
    	int quantity = Integer.parseInt(input) ; 	// convert to int
		
		String item = JOptionPane.showInputDialog
			          ("Enter description of item purchased") ;
		
		input = JOptionPane.showInputDialog("Enter unit price of item") ;
		
		double price = Double.parseDouble(input) ;	// convert to double
      	    
   	    // construct a Purchase object, using input data
   	    Purchase current = new Purchase(quantity, item, price) ;
      	    
    	// print purchase, tax, and total cost
    	System.out.println("\nYour purchase:\n") ;
    	System.out.println(current.getData() + " = $" + current.getCost()) ;
    	System.out.println("Tax = $" + current.getTax()) ;
        System.out.println("Total cost = $" + current.getTotal()) ;
    	                   
    	System.exit(0) ;
	}
} 

/*  sample output:

Your purchase:

8 hockey pucks @ $4.37 = $34.96
Tax = $2.2724
Total cost = $37.2324

*/	
