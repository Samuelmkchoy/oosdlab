package jlab3q3;

public class BankDriver {

	public static void main(String agrs[]) 
	{
		BankCustomer a = new BankCustomer();
		SavingsAccount ac1 = new SavingsAccount();
		SavingsAccount ac2 = new SavingsAccount();
		SavingsAccount ac3 = new SavingsAccount();
		
		SavingsAccount.modifyAnnualInterestRate(0.04f);

		ac1.setSavingsBlance(2000.00f);
		ac2.setSavingsBlance(3000.00f);
		ac3.setSavingsBlance(4000.00f);
		
		ac1.calculateMonthlyInterest();
		ac2.calculateMonthlyInterest();
		ac3.calculateMonthlyInterest();
		
		float blance;
		blance = ac1.getSavingsBlance() + ac2.getSavingsBlance() + ac3.getSavingsBlance();
		
		a.setName("Ming");
		a.setAddress("No. 3, Hero Road, Ireland");
		
		System.out.print("Customer Name: " +a.getName()+ ", Address: " +a.getAddress()+ ", Total Balance: "+ blance);
		
		
	}
}
