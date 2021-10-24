package jlab3q2;

public class SavingsAccount {

	private int accNum;
	private static float annualInterestRate;
	private float savingsBlance;
	private static int nextAcc = 1;
	
	public SavingsAccount()
	{
		accNum = nextAcc;
		nextAcc++;
	}
	
	public int getAccNum() 
	{
		return accNum;
	}
	public float getSavingsBlance() 
	{
		return savingsBlance;
	}
	
	public void setSavingsBlance(float sb)
	{
		savingsBlance = sb;
	}
	public void calculateMonthlyInterest()
	{
		float interest = savingsBlance * annualInterestRate / 12;
		savingsBlance += interest;
	}
	
	public static void modifyAnnualInterestRate(float annualInterestRate)
	{
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	public String toString()
	{
		return "Account number: " + getAccNum() + ", blance = " + getSavingsBlance();
	}
	
}
