package jlab15;
//Q2
public class Verifier {

	public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException{
			if(value >= low && value <= 100)
				{	
					System.out.println("Number in range!!!");
				
				}
			else 
				{
					throw new MyOutOfRangeException("Number " + value + " is not in range");
				}		
	}
	public void verifyPasswordStrength(String password) throws MyInvalidPasswordException 
	{
		if (password.length() >= 8)
			{
				System.out.println("Good Password");
			}
		else if (password.length() < 8)
			{
				throw new MyInvalidPasswordException("Password " + password + " is not strong enough");
			}		
	}
}