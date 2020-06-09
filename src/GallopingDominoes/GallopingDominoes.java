package GallopingDominoes;

import java.util.Random ;
import javax.swing.JOptionPane ;

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
		int initialRoll ;				// sum of first roll of two dice

		int trialNumber = 0 ;			// counts number of trials

		// "priming" read
		String answer = JOptionPane.showInputDialog("Want to play?" +
		                 "\nType Y for Yes or N for No") ;
		
		// repeat as long as user wants to play
		while ( answer.equalsIgnoreCase("Y") )
		{
			trialNumber++ ;

			// get the initial roll
			initialRoll = d1.roll() + d2.roll() ;

			// count number of rolls needed to match initial roll
			int count = 1 ;

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
			
			// print stats
			System.out.println("Trial #" + format(trialNumber) + 
			                 "   Initial roll = " + format(initialRoll) + 
			                 "   Matched in " + format(count) + " rolls.") ;
                        
                        answer = JOptionPane.showInputDialog("Want to play?" +
		                 "\nType Y for Yes or N for No") ;
			
		} 
	}
}

public class GallopingDominoes
{
	public static void main(String[] args)
	{
		MatchGame fun = new MatchGame() ;
		fun.play() ;
	}
}