package jlab3q2;

public class SavAccDriver 
{
	public static void main(String arg[]) 
	{
		SavingsAccount saver1 = new SavingsAccount(); 
		SavingsAccount saver2 = new SavingsAccount(); 
		
		saver1.setSavingsBlance(2000.00f);
		saver2.setSavingsBlance(3000.00f);
		
		SavingsAccount.modifyAnnualInterestRate(0.04f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
		SavingsAccount.modifyAnnualInterestRate(0.05f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
	}
}
