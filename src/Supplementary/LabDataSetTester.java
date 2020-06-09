//	File:	LabDataSetTester.java

//	Class DataSet computes the average and maximum of any number of integer
//  test scores entered by the user.  

//	Demonstrates using a while loop to process a set of data until end-of-file.
//  Note: to indicate end-of-file in JOptionPane, click Cancel

import javax.swing.JOptionPane ;
import java.text.NumberFormat ;

class LabDataSet
{
	private int sum ;			// sum of the scores in the set
	private int count ;			// number of scores in the set
	private int maximum ;	                // largest score in the set
        private int minimum ;                   // smallest score in the set
	
	// creates an empty data set
	public LabDataSet()
	{
		count = 0 ;
		sum = 0 ;
		maximum = Integer.MIN_VALUE ;
                minimum = Integer.MAX_VALUE ;
	}
	
	// add a value to the data set
	public void add(int currentScore)
	{
		sum = sum + currentScore ;		// accumulate sum of scores
		count++ ;						// one more value added
		
		// conditionally update the largest score
		if ( currentScore > maximum )	// if current score is largest so far...	
		{								
                        maximum = currentScore ;	// ...save it as new maximum
		}
                
                // conditionally update the smallest score
                if ( currentScore < minimum)
                {
                        minimum = currentScore ;
                }
	}
	
	// return largest value entered
	public int getMaximum()
	{
		return maximum ;				 
	}
        
        public int getMinimum()
        {
                return minimum ;
        }

	// return average of values entered
	public double getAverage()
	{
		return (double)sum / count ;		
	}
	
	// return number of values entered
	public int getCount()
	{
		return count ;
	}
}

public class LabDataSetTester
{
	public static void main (String [] args)
	{
		LabDataSet set = new LabDataSet() ;	// create empty data set
		
		NumberFormat formatter = NumberFormat.getNumberInstance() ;
		formatter.setMaximumFractionDigits(2) ;
		formatter.setMinimumFractionDigits(2) ;

		JOptionPane.showMessageDialog(null, "I will compute the average and " +
		                              "maximum for any number of integers") ;
		
		String input = JOptionPane.showInputDialog
		               ("Enter an integer\n(or click Cancel to quit)") ;
		
		// repeat until end-of-file (i.e., until user clicks Cancel)
		while ( input != null )
		{
			int score = Integer.parseInt(input) ;
			System.out.println("You entered: " + score) ;
			set.add(score) ;
			input = JOptionPane.showInputDialog
		            ("Enter another integer\n(or click Cancel to quit)") ;
		}
	        
                double average = set.getAverage() ;
                
                if (set.getCount() == 0)
                {
                    System.out.println("\nERROR! No Data!");
                }
                else System.out.println("\nThe average is: " + formatter.format(average) 
		                   + "\nThe maximum is:\t" + set.getMaximum()+
                                    "\nThe minimum is:\t"+ set.getMinimum()) ;
	}
}
