package Craps;

import java.text.NumberFormat;
/**
 * A test class for the Craps class.  Plays a game and prints results.
 */
public class CrapsTest2
{
	public static void main(String[] args)
	{
            String input ;
            int count = 0 ;
            int wins = 0 ;
            int loses = 0 ;
            
            NumberFormat fix = NumberFormat.getNumberInstance() ;
            fix.setMaximumFractionDigits(0) ;
            fix.setMinimumFractionDigits(0) ;
            
            do
            {   
		// create a Craps game object, with trace on
		Craps shooter = new Craps(false) ;
		
		// play a game
		shooter.play() ;
		
		if ( shooter.isWinner() )
		  wins++ ;
		else
		  loses++ ;
                
                count ++ ;
            }
            while (count < 1000) ;
            
            double percentWins = (double)wins/count*100 ;
            double percentLoses = (double)loses/count*100 ;
            
            System.out.println("\n"+count+" games have been played, with "+wins+
                    " wins and "+loses+" loses.\n\nThe percentage of the wins "+
                    "and loses respectively was "+fix.format(percentWins)+"% and "+
                    fix.format(percentLoses)+"%.\n") ;
	}
}