package GallopingDominoes;

import java.util.Random ;

/**
 * A class to represent a standard 6-sided die
 */
class Die	// die is the singular of "dice"
{
	// random number generator object
	private static Random r = new Random() ;
	
	/**
	 * Roll one die.
	 * @return a random integer from 1 to 6
	 */
	public int roll()		
	{
		return r.nextInt(6) + 1 ;
	}
}

class MatchGame
{
	// instance var's are Die objects 
	Die d1 = new Die() ;				// create pair of dice
	Die d2 = new Die() ;

	// This method just aligns the output...
	private static String format (int number)
	{
		if (number <= 9)				// if single-digit number...
		  return " " + number ;			// ...pad with one leading space
		else							// 2-digit number...
		  return "" + number ;			// ...no padding
	}
        
	public void play()
	{
		int initialRoll = 0 ;				// sum of first roll of two dice

		int trialNumber = 0 ;			// counts number of trials

                int count = 0;
               
                int highestRoll = Integer.MIN_VALUE ;
                int lowestRoll = Integer.MAX_VALUE ;
        
                int mostAttempts = 0;
                int leastAttempts = Integer.MAX_VALUE ;
                
		System.out.println() ;
		
                boolean terminate = true;
                      
                // repeat as long as ...
		while ( terminate )					// loop forever!
		{
			trialNumber++ ;

			// get the initial roll
			initialRoll = d1.roll() + d2.roll() ;

                        // count number of rolls needed to match initial roll
                        count = 1 ;
                
			// roll dice again to try to match initial roll
			int currentRoll = d1.roll() + d2.roll() ;
			
			// repeat as long as initial roll is not matched
			while ( currentRoll != initialRoll )
			{
				// increment number of rolls needed...
				count++ ;		
				// ...and roll 'em again!
				currentRoll = d1.roll() + d2.roll() ;                                                                
			}
                        
                        // Loop postcondition:  initialRoll has been matched
			if (count == 1)
                        {
                            terminate = false ;
                        }
			
                        if (count > mostAttempts)
                        {
                            mostAttempts = count ;
                            
                            highestRoll = currentRoll ;
                        }
                        
                        if (count < leastAttempts)
                        {
                            leastAttempts = count ;
                            
                            lowestRoll = currentRoll ;
                        }
                        
			// print stats
			System.out.println("Trial #" + format(trialNumber) + 
			                 "   Initial roll = " + format(initialRoll) + 
			                 "   Matched in " + format(count) + " rolls.") ;
		}
                                
                System.out.println("\n\nMost attempts:\t"+mostAttempts+" to match a "+
                                highestRoll+"\nLeast attempts:\t"+leastAttempts+
                                " to match a "+lowestRoll);
	}
}

public class GallopingDominoes2
{
	public static void main(String[] args)
	{
		MatchGame fun = new MatchGame() ;
		fun.play() ;
      	}
}