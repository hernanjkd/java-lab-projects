package Craps;

import javax.swing.JOptionPane;
/**
 * A test class for the Craps class.  Plays a game and prints results.
 */
public class CrapsTest
{
	public static void main(String[] args)
	{
            String input ;
            
            do
            {   
		// create a Craps game object, with trace on
		Craps shooter = new Craps(true) ;
		
		// play a game
		shooter.play() ;
		
		if ( shooter.isWinner() )
		  System.out.println("Player wins!\n") ;
		else
		  System.out.println("Sorry, player loses.\n") ;
                
                input=JOptionPane.showInputDialog("Want to play again?"+
                        "\nType \"yes\" or cancel.") ;                
            }
            while (input.equalsIgnoreCase("yes")) ;
	}
}