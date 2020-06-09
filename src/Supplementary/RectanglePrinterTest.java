import javax.swing.JOptionPane ;

/**
 * A class to print block rectangles.
 */
class RectanglePrinter
{
	// instance var's
	int height ;    
	int width ;
                        	                
	/**
	 * Create a RectanglePrinter object.
	 * @param height height of rectangle (i.e., number of lines to print)
	 * @param width width of rectangle (i.e., number of '*'s per line
	 */
	public RectanglePrinter(int height, int width)	// constructor
	{
		this.height = height ;
		this.width = width ;
	}

	/**
	 * Prints one line of a rectangle, by printing exactly "width" asterisks
	 */ 
	public void printSegment()
	{
            for (int w=1 ; w <= width ; w++)
            {
                System.out.print("*") ;
            }
	}

	/**
	 * Prints a rectangle exactly "height" lines in height.  Each line is 
	 * printed via a call to method printSegment
	 */ 
	public void printRectangle()
	{
            for (int h=1 ; h <= height ; h++)
            {
                printSegment() ;
                System.out.println() ;
            }
	}
        
        public void printParallelogram()
        {            
            for (int h=1 ; h <= height ; h++)
            {                
                for (int count=1 ; count <= h ; count++)
                {
                    System.out.print(" ") ;                  
                }
                
                printSegment() ;
                System.out.println() ;
            }
        }
	
}  // end of class rectanglePrinter definition

public class RectanglePrinterTest
{
	public static void main (String [] args)
	{
		String input = JOptionPane.showInputDialog
			                       ("What is the height of the rectangle?") ;
		int height = Integer.parseInt(input) ;
		
		input = JOptionPane.showInputDialog
			                ("What is the width of the rectangle?") ;
		
		int width = Integer.parseInt(input) ;

		RectanglePrinter r = new RectanglePrinter(height, width) ;

		System.out.println() ;
		r.printRectangle() ;
		System.out.println() ;
                r.printParallelogram() ;
                System.out.println() ;
	}
}
