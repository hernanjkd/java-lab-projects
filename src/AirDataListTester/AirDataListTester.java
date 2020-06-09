package AirDataListTester;
//  File: AirDataListTester.java

import java.util.* ;		// for ArrayList and Scanner 
import java.io.* ;			// for FileWriter, PrintWriter, and IOException
import Align.Align;

/*
 * A class to store data for an airline
 */
class AirData
{
	// instance vars
    private String name ;			// airline name
    private int revenueMiles ;		// annual revenue miles (in 1000's)
    private int passengerMiles ;	// annual passenger miles (in 1000's)

	/**
	 * Creates an AirData object.
	 * @param name the airline name
	 * @param revenueMiles the number of revenue miles flown
	 * @param passengerMiles the number of passenger miles flown
	 */
	public AirData(String name, int revenueMiles, int passengerMiles) 
	{
		this.name = name ;
		this.revenueMiles = revenueMiles ;
		this.passengerMiles = passengerMiles ;
	}
	
	/**
	 * Returns the airline name.
	 * @return the airline name
	 */
	public String getName()		
	{
		return name ;
	}

	/**
	 * Returns the airline's revenue miles flown.
	 * @return the revenue miles
	 */
	public int getRevMiles() 
	{
		return revenueMiles ;
	}

	/**
	 * Returns the airline's passenger miles flown.
	 * @return the passenger miles
	 */
	public int getPassMiles()
	{
		return passengerMiles ;
	}
	
} // end of AirData class definition ========================================

/**
 * A class to implement a list of AirData objects
 */
class AirDataList  
{
	// instance var
	private ArrayList<AirData> list ;		// a list of AirData objects 

   	/**
   	 * Creates an empty list
   	 */
  	public AirDataList() 
  	{
  	   	list = new ArrayList<AirData>() ;
    }
  	
  	/**
  	 * Appends an AirData object to the list.
  	 * @param current the object to be appended to the list
  	 */
  	public void addToList(AirData current) 
  	{	   
    	list.add(current) ;
	}
    
    /** 
     * Converts the list to a multi-line string, with each line containing the
     * data for one airline.
     * @return the String containing all the data on the list
     */	
  	public String toString() 
  	{	   
    	// headings
    	String out = "               Revenue Miles   Passenger Miles\n" +
    	             "     Airline    (in 1000's)      (in 1000's)\n" +
    	             "     =======   =============   ===============" + "\n" ;
    	
    	// for each AirData object on the list...
    	for (int i = 0 ; i < list.size() ; i++)
    	{
    	   AirData air= list.get(i) ;			// get next AirData obj
    	   String name = air.getName() ;		// get airline name
    	   int revMiles = air.getRevMiles() ;   // get revenue miles
    	   int passMiles = air.getPassMiles() ; // get passenger miles
    	   // concatenate data to output string
    	   out = out + Align.right( name, 12 ) + Align.right( revMiles, 16 ) +
	                   Align.right( passMiles, 18 ) + "\n" ;
    	}
    	return out + "\n" ;
	}
        
        public String computeShares()
        {
            int totRevMiles = 0 ;
            int totPassMiles = 0 ;
            String out = "                  Share of        Share of\n" +
    	             "     Airline   Revenue Miles   Passenger Miles\n" +
    	             "     =======   =============   ===============" + "\n" ;
            
            for (int i=0 ; i < list.size() ; i++)
            {
                totRevMiles += list.get(i).getRevMiles() ;
                totPassMiles += list.get(i).getPassMiles() ;
            }
            
            for (int i=0 ; i < list.size() ; i++)
            {
                AirData line = list.get(i) ;
                double shareRev ;
                shareRev = line.getRevMiles()/(double)totRevMiles*100 ;
                double sharePass ;
                sharePass = line.getPassMiles()/(double)totPassMiles*100 ;
            
                out += Align.right(line.getName(),12) +
                       Align.right(shareRev,15,2) + "%" +
                       Align.right(sharePass,17,2) + "%\n" ; 
            } 
            
            return out ;    
        }

} // end of AirDataList class definition =====================================

public class AirDataListTester
{
  	public static void main(String[] args) throws IOException 
  	{            
            AirDataList list = new AirDataList() ;
		    	
            // create Scanner object to read each line of file until eof
            Scanner infile = new Scanner ( new File ("AirData.txt") ) ;
		
            System.out.println("Data entered:\n") ;
    	
            while ( infile.hasNext() ) 				// while not eof...
            {
		// read next line
		String line = infile.nextLine() ;
			
		// "echo print" data entered
    		System.out.println(line) ;
    		
    		// 1. create a Scanner object associated with String "line"
    		Scanner lineScan = new Scanner(line) ;
        		
    		// 2. extract tokens from current line
                String name = lineScan.next() ;
                int revenueMiles = lineScan.nextInt() ;
                int passengerMiles = lineScan.nextInt() ;
                
		// 3. create AirData object passing the tokens to the constructor
          	AirData air = new AirData(name, revenueMiles, passengerMiles) ;
      	    
                // 4. add object to list  
                list.addToList(air) ;    
            }
            
            PrintWriter outfile = new PrintWriter(new FileWriter("NewAirData.txt")) ;
        
            System.out.println() ;        

            System.out.println( list.toString() ) ;		// print the list
            outfile.println(list.toString()) ;
                
            System.out.println( list.computeShares()) ;
            outfile.print(list.computeShares()) ;
            
            outfile.close() ;
	}
} // end of AirDataListTester class definition