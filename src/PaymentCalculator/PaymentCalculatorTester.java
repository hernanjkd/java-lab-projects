package PaymentCalculator;

import javax.swing.JOptionPane;

public class PaymentCalculatorTester
{
	public static void main(String[] args)
	{
		// local vars (NOTE: initial values necessary only to make unfinished
		// program compile!)
		
		int amountBorrowed;
		double interestRate;
		int years;
		
		// insert statements to do input here
		// ----------------------------------

                String input=JOptionPane.showInputDialog("Loan amount:");
		amountBorrowed=Integer.parseInt(input);
		
                input=JOptionPane.showInputDialog("Interest rate:");
                interestRate=Double.parseDouble(input);
                
                input=JOptionPane.showInputDialog("Term of loan:");
                years=Integer.parseInt(input);
				
		// create PaymentCalculator object using input values
		PaymentCalculator myCalc = 
		  new PaymentCalculator(amountBorrowed, interestRate, years) ;
		
		// print loan data
		System.out.println( myCalc.getData() );
		
		// get payment amount
		double payment = myCalc.computePayment() ;
		
		// print payment amount
		System.out.println("Monthly Payment: $" + payment + "\n") ;
                
                //----------------------------------------------------
                
                int years2;
                
                input=JOptionPane.showInputDialog("Loan amount:");
		amountBorrowed=Integer.parseInt(input);
		
                input=JOptionPane.showInputDialog("Interest rate:");
                interestRate=Double.parseDouble(input);
                
                input=JOptionPane.showInputDialog("Term of loan:");
                years2=Integer.parseInt(input);
				
		// create PaymentCalculator object using input values
		PaymentCalculator myCalc2 = 
		  new PaymentCalculator(amountBorrowed, interestRate, years2) ;
                
                double payment2=myCalc2.computePayment();
                
                System.out.println("Term of loan:\t"+years2+" years"+
                        "\nMonthly Payment: $"+payment2+"\n\n"+
                        "The amount saved by choosing the "+years2+" year term"+
                        " loan is $"+((payment*12*years)-(payment2*12*years2))+
                        "\n");
	}
}	// 	end of PaymentCalculatorTest class definition

