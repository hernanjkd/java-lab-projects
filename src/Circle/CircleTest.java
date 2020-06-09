package Circle;

/**
 * A class that uses the Circle class.
 */
public class CircleTest
{
	public static void main (String[]args)
	{
		Circle myCircle = new Circle(10,20,5.5) ;
		Circle round = new Circle(20,40,11) ;
                
		double xValue ;
		double yValue ;
		double radius ;
                
		xValue = myCircle.getX() ;
		yValue = myCircle.getY() ;
		radius = myCircle.getRadius() ;
		
                double xValuer ;
                double yValuer ;
                double radiusr ;
                
                xValuer = round.getX() ;
                yValuer = round.getY() ;
                radiusr = round.getRadius() ;
                
		System.out.println("The center of myCircle is at " +
                        xValue + ", " + 	yValue + " and its radius is " + radius) ;
	        
                System.out.println("Center located at " +
                        xValuer + ", " + yValuer + " with radius at " + radiusr) ;
                
                round.move(5,10) ;
                
                System.out.println("New location at " + round.getX() + 
                        "," + round.getY()) ;
                
                round.setRadius(2.75) ;
                
                System.out.println("New radius is " + round.getRadius()) ;
                
                System.out.println("Area of circle: " + 
                        (Math.PI * round.getRadius() * round.getRadius())) ;
                
                myCircle.move(round.getX(),round.getY()) ;
                
                System.out.println("New location for myCircle: " +
                        myCircle.getX() + ", " + myCircle.getY()) ;
                
                double oldRadius ;
                oldRadius = myCircle.getRadius() ;                
                
                myCircle.setRadius(myCircle.getRadius() * 3) ;              
                
                System.out.println("New radius of old circle: " + 
                        myCircle.getRadius() + " and the old radius was " +
                        oldRadius) ;
        }
}