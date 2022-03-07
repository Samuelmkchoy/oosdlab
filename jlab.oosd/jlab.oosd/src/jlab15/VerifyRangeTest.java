package jlab15;

import java.util.Scanner;

public class VerifyRangeTest {
	public static void main( String[] args ){
	Scanner scanner = new Scanner( System.in );
	Verifier Verify = new Verifier();
	
	boolean continueLoop=true;
	do {
		try {
				System.out.println( "Please enter a value: " );
				int value = scanner.nextInt();
				int low = 1;
				int high = 100;
				Verify.verifyIntRange(value, low, high);// check in range
				continueLoop = false;

			}
			
		catch (MyOutOfRangeException MyOutOfRangeException)//go error
			{
				System.err.println( "Exception " + MyOutOfRangeException);
				scanner.nextLine(); // discard input so user can try again
			} //end catch
		
		}
	
	while(continueLoop); 
	
	Scanner s = new Scanner( System.in );
	boolean continueL = true;
	do {
		try {
				System.out.println( "Please enter a password: " );
				String password = s.nextLine();
				Verify.verifyPasswordStrength(password);
				continueL = false;

			}
			
		catch (MyInvalidPasswordException MyInvalidPasswordException)
			{
				System.err.println( "Exception " + MyInvalidPasswordException);
				scanner.nextLine(); // discard input so user can try again
			} //end catch
		
		}
	
	while(continueL); 

		
	}//end main	
}//end class}
